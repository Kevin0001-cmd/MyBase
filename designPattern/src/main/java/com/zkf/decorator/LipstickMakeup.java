package com.zkf.decorator;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/7 13:32
 * @Description:
 */
public class LipstickMakeup extends Decorator {
    public LipstickMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}
