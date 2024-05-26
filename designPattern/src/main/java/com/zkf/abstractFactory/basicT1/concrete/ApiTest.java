package com.zkf.abstractFactory.basicT1.concrete;

import com.zkf.abstractFactory.basicT1.define.HighClassUnit;
import com.zkf.abstractFactory.basicT1.define.LowClassUnit;
import com.zkf.abstractFactory.basicT1.define.MidClassUnit;
import org.junit.Test;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:31
 * @Description:
 */
public class ApiTest {

    @Test
    public void test() {
        System.out.println("游戏开始.....");
        HumanFactory humanFactory = new HumanFactory(10, 10);
        HighClassUnit highClass = humanFactory.createHighClass();
        highClass.show();
        MidClassUnit midClass = humanFactory.createMidClass();
        midClass.show();
        LowClassUnit lowClass = humanFactory.createLowClass();
        lowClass.show();

        AlienFactory alienFactory = new AlienFactory(20, 20);
        HighClassUnit alienhigh = alienFactory.createHighClass();
        alienhigh.show();
        MidClassUnit alienmid = alienFactory.createMidClass();
        alienmid.show();
        LowClassUnit alienlow = alienFactory.createLowClass();
        alienlow.show();

        System.out.println("开始攻击....");
        highClass.attack();
        alienhigh.attack();
        midClass.attack();
        alienmid.attack();
        lowClass.attack();
        alienlow.attack();

        System.out.println("游戏结束......");


    }
}
