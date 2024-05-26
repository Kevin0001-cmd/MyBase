package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.LowClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:23
 * @Description:
 */
public class Roach extends LowClassUnit {
    public Roach(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("蟑螂兵出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("蟑螂兵用爪子挠，攻击力:" + attack);
    }
}
