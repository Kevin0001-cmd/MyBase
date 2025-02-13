package com.zkf.array;

import org.junit.Test;

/**
 * No.1544 整理字符串
 */
public class makeGoodClass {

    @Test
    public void test() {
//        makeGood("leEeetcode");
        makeGood("leEtcode");
        makeGood("aAbBcC");
        makeGood("s");
    }

    /**
     * 注意：
     *
     * 1. java中是如何判断字符的大小写和如何将一个字符进行大小写转换的
     * 2. 遍历的条件，因为会有i+1的索引位置，所以i必须小于s.length()-1，否则会超过字符数组的长度
     * 3. 符合条件后需要跳过当前字符和当前字符的下一个字符
     *
     * @param s
     * @return
     */
    public String makeGood(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (
                    (i != s.length() - 1) &&
                    (
                            ((Character.isUpperCase(s.charAt(i)) & Character.isLowerCase(s.charAt(i + 1)))
                                    ||
                                    (Character.isLowerCase(s.charAt(i)) & Character.isUpperCase(s.charAt(i + 1)))
                            )
                                    && (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i + 1)))
                    )
            ) {
                i += 1;
            } else {
                result += s.charAt(i);
            }
        }
        System.out.println("输入：" +1997 s + "-----输出：" + result);
        return result;
    }
}
