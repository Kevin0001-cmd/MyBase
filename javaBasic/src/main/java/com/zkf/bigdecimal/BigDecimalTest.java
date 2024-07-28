package com.zkf.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    @Test
    public void test_bigdecimal() {
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("3.5");
        BigDecimal result = a.divide(b, 4, RoundingMode.CEILING);
        //向正无穷大的方向舍入
        BigDecimal result_ceil = a.divide(b, 1, RoundingMode.CEILING);
        //向负无穷大的方向舍入
        BigDecimal result_floor = a.divide(b, 1, RoundingMode.FLOOR);
        //向远离零的方向舍入
        BigDecimal result_up = a.divide(b, 1, RoundingMode.UP);
        //向零的方向舍入
        BigDecimal result_down = a.divide(b, 1, RoundingMode.DOWN);
        //四舍五入，当舍弃部分大于等于0.5时，向正无穷方向舍入
        BigDecimal result_half_up = a.divide(b, 0, RoundingMode.HALF_UP);
        //四舍五入，当舍弃部分大于0.5时，向零方向舍入
        BigDecimal result_half_down = a.divide(b, 0, RoundingMode.HALF_DOWN);
        System.out.println(result); //28.5715
        System.out.println(result_ceil); //28.6
        System.out.println(result_floor); //28.5
        System.out.println(result_up); //28.6
        System.out.println(result_down); //28.5
        System.out.println(result_half_up); //29
        System.out.println(result_half_down); //29
    }
}
