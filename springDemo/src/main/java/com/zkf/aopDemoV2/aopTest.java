package com.zkf.aopDemoV2;

import com.zkf.springframework.aop.MethodMatcher;
import com.zkf.springframework.aop.aspectj.AspectJExpressionPointcut;
import com.zkf.springframework.aop.framework.ReflectiveMethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/14 08:08
 * @Description:
 */
public class aopTest {

    /**
     * 普通方法拦截
     */
    @Test
    public void test_proxy_basic() {
        UserService targetObject = new UserService();
        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                targetObject.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("记录日志：" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                        return method.invoke(targetObject, args);
                    }
                });
        String result = proxy.queryUser("雨天");
        System.out.println("result:" + result);
        /**
         * 记录日志：2024-03-14
         * Query,This user name is 雨天
         * result:雨天
         */
    }

    /**
     * 从下面的代码看，有两个地方是可以嵌入代码的
     * 第一个是匿名内部类MethodInterceptor#invoke方法中
     * 第二个是ReflectiveMethodInvocation#proceed方法中
     * AOP是在拦截器中执行了通知
     */
    @Test
    public void test_proxy_methodInterceptor() {
        UserService targetObject = new UserService();
        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                targetObject.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("queryUser".equals(method.getName())) {
                            MethodInterceptor methodInterceptor = new MethodInterceptor() {
                                @Override
                                public Object invoke(MethodInvocation invocation) throws Throwable {
                                    try {
                                        return invocation.proceed();
                                    } finally {
                                        //这是在方法执行之后再执行的
                                        System.out.println("拦截方法 记录日志：" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                                    }
                                }
                            };
                            return methodInterceptor.invoke(new ReflectiveMethodInvocation(targetObject, method, args));
                        }
                        //这是在方法执行之前执行的
                        System.out.println("普通方法 记录日志：" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                        return method.invoke(targetObject, args);
                    }
                });
        String result = proxy.queryUser("雨天");
        System.out.println("result:" + result);
        System.out.println("------------------------------");
        String output = proxy.addUser("晴天");
        System.out.println("result:" + output);
        /**
         * 方法执行~~~
         * Query,This user name is 雨天
         * 拦截方法 记录日志：2024-03-14
         * result:雨天
         * ------------------------------
         * 普通方法 记录日志：2024-03-14
         * Add one user,name is 晴天
         * result:晴天
         */
    }

    @Test
    public void test() {
        Object target = new UserService();

        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            //定义PointCut
            MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* com.zkf.aopDemoV2.IUserService.*(..))");

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (methodMatcher.matches(method, target.getClass())) {
                    MethodInterceptor methodInterceptor = invocation -> {
                        long start = System.currentTimeMillis();
                        try {
                            //执行queryUser
                            return invocation.proceed();
                        } finally {
                            System.out.println("监控 - Begin By AOP");
                            System.out.println("方法名称：" + invocation.getMethod().getName());
                            System.out.println("方法耗时：" + (System.currentTimeMillis() - start) + "ms");
                            System.out.println("监控 - End\r\n");
                        }
                    };
                    return methodInterceptor.invoke(new ReflectiveMethodInvocation(target, method, args));
                }
                return method.invoke(target, args);
            }
        });
        String result = proxy.queryUser("西西");
        System.out.println("result:" + result);
        System.out.println("------------------------------");
        String output = proxy.addUser("晴天");
        System.out.println("result:" + output);
    }
}
