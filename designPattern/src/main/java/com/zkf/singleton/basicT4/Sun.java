package com.zkf.singleton.basicT4;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/6 17:53
 * @Description:
 */
public class Sun {

    private Sun() {

    }

    private static volatile Sun sun = null;

    public static Sun getInstance() {
        if (sun == null) {
            synchronized (Sun.class) {
                if (sun == null) {
                    sun = new Sun();
                }
            }
        }
        return sun;
    }
}
