package com.zkf.threadLocalDemo;

import org.junit.Test;

public class demo {

    @Test
    public void test() {
        ThreadLocal<String> key = new ThreadLocal<>();
        key.set("db1");
        key.set("db2");
        key.set("db3");
        System.out.println("---------------------");
        String s = key.get();
        System.out.println(s);
        System.out.println("---------------------");
        key.remove();
    }
}
