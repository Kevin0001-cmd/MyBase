package com.zkf.shardingspheredemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zkf.shardingspheredemo.demos.service"})
@MapperScan("com.zkf.shardingspheredemo.demos.dao")
public class ShardingspheredemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingspheredemoApplication.class, args);
    }

}
