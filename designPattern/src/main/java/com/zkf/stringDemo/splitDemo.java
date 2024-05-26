package com.zkf.stringDemo;

import org.junit.Test;
import org.springframework.util.StringUtils;
import org.springframework.context.EnvironmentAware;

import java.util.Arrays;

public class splitDemo {

    @Test
    public void test() {
        String str = "a, b, c, d";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        String input = "this is a demo, this, is a demo";
        String[] split1 = StringUtils.commaDelimitedListToStringArray(input);
        String[] split2 = StringUtils.tokenizeToStringArray(input, ",");
        for (String s : split1) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        for (String s : split2) {
            System.out.println(s);
        }
    }
}
