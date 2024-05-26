package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.HighClassUnit;
import com.zkf.abstractFactory.basicT1.define.LowClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:20
 * @Description:
 */
public class Battleship extends HighClassUnit {
    public Battleship(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("战舰出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("战舰用激光炮打击，攻击力:" + attack);
    }
}
