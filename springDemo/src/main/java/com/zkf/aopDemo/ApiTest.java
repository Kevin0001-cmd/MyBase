package com.zkf.aopDemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/10 16:52
 * @Description:
 */
public class ApiTest {


    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(UserService.class);
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.query();
    }
}
