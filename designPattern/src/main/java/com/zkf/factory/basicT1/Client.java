package com.zkf.factory.basicT1;

import org.junit.Test;

import java.util.Random;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 11:57
 * @Description: 客户端
 *
 * 简单工厂模式：根据不同的类型创建不同的产品
 */
public class Client {

    @Test
    public void test() {
        Random random = new Random();
        int m = random.nextInt(100);
        int n = random.nextInt(50);
        Factory factory = new Factory(m, n);
        Enemy tank = factory.createEnemy("tank");
        Enemy aircraft = factory.createEnemy("aircraft");
        for (int i1 = 0; i1 < 5; i1++) {
            tank.fight();
        }
        for (int i1 = 0; i1 < 3; i1++) {
            aircraft.fight();
        }
    }
}
