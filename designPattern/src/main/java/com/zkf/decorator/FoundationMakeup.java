package com.zkf.decorator;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/7 13:30
 * @Description:
 */
public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
