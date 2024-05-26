package com.zkf.singleton.basicT2;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/6 17:48
 * @Description: 懒汉式
 */
public class Sun {
    private Sun() {

    }

    private static Sun sun = null;

    public static Sun getInstance() {
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}