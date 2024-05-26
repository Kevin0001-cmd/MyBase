package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.MidClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:23
 * @Description:
 */
public class Poison extends MidClassUnit {
    public Poison(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("毒液兵出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("毒液兵用毒液喷射，攻击力:" + attack);
    }
}
