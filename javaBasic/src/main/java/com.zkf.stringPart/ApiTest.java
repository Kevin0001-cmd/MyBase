package com.zkf.stringPart;

import org.junit.Test;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 14:53
 * @Description: 同样是拼接字符串，为什么String拼接要比StringBuilder的拼接慢很多呢？因为在java中是不可修改的，所以拼接的时候实际上是先给新的字符串分配足够的空间，然后
 * 复制旧的字符串的内容添加到新的字符串中
 * String拼接的时间复杂度是O(N^2)
 * 而StringBuilder的append操作实际上是一个数组的复制操作,时间复杂度比String拼接更低
 */
public class ApiTest {

    @Test
    public void test() {
        String result = "";
        String str = "hello";
        int num = 10000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result += str;
        }
        long end = System.currentTimeMillis();
//        System.out.println(result);
        System.out.println(end - start); //593
        StringBuilder sql = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sql.append(str);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - end); //0
    }
}
