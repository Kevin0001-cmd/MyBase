package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.LowClassUnit;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:20
 * @Description:
 */
public class Marine extends LowClassUnit {
    public Marine(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("士兵出现在坐标：【" + x + "," + y + "】");
    }

    public void attack() {
        System.out.println("士兵用机关枪扫射，攻击力:" + attack);
    }
}
