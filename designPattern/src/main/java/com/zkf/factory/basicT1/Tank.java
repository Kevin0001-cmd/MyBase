package com.zkf.factory.basicT1;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 11:51
 * @Description: 子类-坦克
 */
public class Tank extends Enemy {


    public Tank(int x, int y) {
        super(x, y);
    }

    void fight() {
        System.out.println("坦克出现，坐标位置：" + x + "-" + y);
    }
}
