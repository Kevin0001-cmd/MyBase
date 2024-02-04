package com.zkf.factory.basicT1;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 11:51
 * @Description: 子类-飞机
 */
public class Aircraft extends Enemy {


    public Aircraft(int x, int y) {
        super(x, y);
    }

    void fight() {
        System.out.println("飞机出现，坐标位置：" + x + "-" + y);
    }
}
