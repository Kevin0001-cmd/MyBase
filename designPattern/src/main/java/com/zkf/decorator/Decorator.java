package com.zkf.decorator;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/7 13:29
 * @Description:
 */
public abstract class Decorator implements Showable {

    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();
    }
}
