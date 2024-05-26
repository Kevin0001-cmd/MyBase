package com.zkf.decorator;

import org.junit.Test;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/7 13:33
 * @Description:
 */
public class ApiTest {

    @Test
    public void test() {
        new LipstickMakeup(new FoundationMakeup(new Girl())).show();
    }
}
