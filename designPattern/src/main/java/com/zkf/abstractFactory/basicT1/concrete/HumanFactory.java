package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.AbstractFactory;
import com.zkf.abstractFactory.basicT1.define.HighClassUnit;
import com.zkf.abstractFactory.basicT1.define.LowClassUnit;
import com.zkf.abstractFactory.basicT1.define.MidClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:27
 * @Description:
 */
public class HumanFactory implements AbstractFactory {


    private int x;
    private int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public LowClassUnit createLowClass() {
        Marine marine = new Marine(x, y);
        System.out.println("制造海军陆战队员成功");
        return marine;
    }

    public MidClassUnit createMidClass() {
        Tank tank = new Tank(x, y);
        System.out.println("制造变形坦克成功");
        return tank;
    }

    public HighClassUnit createHighClass() {
        Battleship battleship = new Battleship(x, y);
        System.out.println("制造巨型战舰成功");
        return battleship;
    }
}
