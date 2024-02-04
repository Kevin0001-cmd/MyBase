package com.zkf.factory.basicT2;

import java.util.Random;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 13:43
 * @Description:
 */
public class AircraftFactory implements Factory {
    @Override
    public Enemy createFactory(int width) {
        Random random = new Random();
        int i = random.nextInt(width);
        return new Aircraft(i, 0);
    }
}
