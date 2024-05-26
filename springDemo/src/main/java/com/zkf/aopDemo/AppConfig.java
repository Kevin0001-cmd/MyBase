package com.zkf.aopDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/10 17:13
 * @Description: 自动代理创建器
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    // 如果MyAspect类实现了切面
    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
