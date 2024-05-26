package com.zkf.decorator;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/7 13:29
 * @Description:
 */
public class Girl implements Showable {
    @Override
    public void show() {
        System.out.print("素颜");
    }
}
