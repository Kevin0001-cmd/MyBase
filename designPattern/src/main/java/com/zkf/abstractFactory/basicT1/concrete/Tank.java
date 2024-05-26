package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.MidClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:20
 * @Description:
 */
public class Tank extends MidClassUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("坦克出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("坦克用炮轰击，攻击力:" + attack);
    }
}
