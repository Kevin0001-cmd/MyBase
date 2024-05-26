package com.zkf.singleton.basicT3;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/6 17:52
 * @Description:
 */
public class Sun {

    private Sun() {
    }

    private static Sun sun = null;

    public static synchronized Sun getInstance() {
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}
