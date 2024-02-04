package com.zkf.factory.basicT2;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 13:39
 * @Description:
 */
public class TankFactory implements Factory {
    @Override
    public Enemy createFactory(int width) {
        Random random = new Random();
        int i = random.nextInt(width);
        return new Tank(i, 0);
    }
}
