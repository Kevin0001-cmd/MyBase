package com.zkf.singleton.basicT1;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/6 17:47
 * @Description: 饿汉式
 */
public class Sun {

    private Sun() {

    }

    private static final Sun sun = new Sun();

    public static Sun getInstance() {
        return sun;
    }
}
