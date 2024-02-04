package com.zkf.factory.basicT2;

import org.junit.Test;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 13:58
 * @Description:客户端
 *
 * 工厂方法模式
 */
public class Client {

    @Test
    public void test() {
        TankFactory tankFactory = new TankFactory();
        int width = 100;
        Enemy tank = tankFactory.createFactory(width);
        for (int i = 0; i < 4; i++) {
            tank.fight();
        }

        AircraftFactory aircraftFactory = new AircraftFactory();
        Enemy aircraft = aircraftFactory.createFactory(width);
        for (int i = 0; i < 5; i++) {
            aircraft.fight();
        }
    }
}
