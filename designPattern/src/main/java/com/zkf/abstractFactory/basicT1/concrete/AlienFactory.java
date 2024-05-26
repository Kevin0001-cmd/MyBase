package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.AbstractFactory;
import com.zkf.abstractFactory.basicT1.define.HighClassUnit;
import com.zkf.abstractFactory.basicT1.define.LowClassUnit;
import com.zkf.abstractFactory.basicT1.define.MidClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:29
 * @Description:
 */
public class AlienFactory implements AbstractFactory {

    private int x;
    private int y;

    public AlienFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public LowClassUnit createLowClass() {
        Roach roach = new Roach(x, y);
        System.out.println("制造蟑螂兵成功");
        return roach;
    }

    public MidClassUnit createMidClass() {
        Poison poison = new Poison(x, y);
        System.out.println("制造毒液兵成功");
        return poison;
    }

    public HighClassUnit createHighClass() {
        Mammoth mammoth = new Mammoth(x, y);
        System.out.println("制造猛犸巨兽成功");
        return mammoth;
    }
}
