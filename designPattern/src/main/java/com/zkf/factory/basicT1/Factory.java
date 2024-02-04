package com.zkf.factory.basicT1;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/4 11:58
 * @Description: 简单工厂-工厂类
 */
public class Factory {

    private int x;
    private int y;

    public Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Enemy createEnemy(String type) {
        Enemy enemy = null;
        switch (type) {
            case "tank":
                enemy = new Tank(x, y);
                break;
            case "aircraft":
                enemy = new Aircraft(x, y);
                break;
        }
        return enemy;
    }
}
