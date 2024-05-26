package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.HighClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:24
 * @Description:
 */
public class Mammoth extends HighClassUnit {
    public Mammoth(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("猛犸象出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("猛犸象用獠牙顶，攻击力:" + attack);
    }
}
