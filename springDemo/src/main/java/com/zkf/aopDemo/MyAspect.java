package com.zkf.aopDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/10 16:31
 * @Description:
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("within(UserService)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----aop around before----");
        // 在方法执行前的操作...
        try {
            // 调用原方法并获取返回值
            Object result = joinPoint.proceed();
            System.out.println("----aop around after----");
            // 在方法成功执行后的操作...
            return result;
        } catch (Exception ex) {
            return null;
        }
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("----aop before----");
    }


}
