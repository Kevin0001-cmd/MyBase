package com.zkf.abstractFactory.basicT1.define;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/5 21:14
 * @Description: 产品顶层抽象类
 */
public abstract class Unit {
    protected int attack;

    protected int defence;

    protected int health;

    protected int x;

    protected int y;

    public Unit(int attack, int defence, int health, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public abstract void show();

    public abstract void attack();
}
