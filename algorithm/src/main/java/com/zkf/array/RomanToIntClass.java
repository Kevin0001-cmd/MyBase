package com.zkf.array;

import org.junit.Test;

import java.util.*;

public class RomanToIntClass {

    HashMap<Character, Integer> default_map = new HashMap<>();

    public RomanToIntClass() {
        default_map.put('I', 1);
        default_map.put('V', 5);
        default_map.put('X', 10);
        default_map.put('L', 50);
        default_map.put('C', 100);
        default_map.put('D', 500);
        default_map.put('M', 1000);
    }

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
        List<Character> default_list = new ArrayList<>(Arrays.asList('I', 'X', 'C'));
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char oneChar = chars[i];
            int value = default_map.get(oneChar);
            // 注意，这里的i+1的索引可能会超过字符串的长度，需要加上限制
            if (default_list.contains(oneChar)
                    &&
                    ((i < (chars.length - 1)) && default_map.get(chars[i + 1]) > default_map.get(chars[i]))
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
