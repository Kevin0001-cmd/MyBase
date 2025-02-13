package com.zkf.array;

import org.junit.Test;

import java.util.*;

public class RomanToIntClass {


    Map<Character, Integer> default_map = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    @Test
    public void test() {
        romanToInt("III");
        romanToInt("IV");
        romanToInt("IX");
        romanToInt("LVIII");
        romanToInt("MCMXCIV");
    }

    /**
     * 规则：
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        if (null == s || s == "") {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = default_map.get(s.charAt(i));
            // 注意，这里的i+1的索引可能会超过字符串的长度，需要加上限制
            if (i < (s.length() - 1)
                    &&
                    default_map.get(s.charAt(i + 1)) > default_map.get(s.charAt(i))
            ) {
                result += value * (-1);
            } else {
                result += value;
            }
        }
        System.out.println("输入值：" + s + "-----输出值：" + result);
        return result;
    }
}
