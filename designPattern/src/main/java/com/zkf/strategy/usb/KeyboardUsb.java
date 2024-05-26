package com.zkf.strategy.usb;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/29 06:15
 * @Description:
 */
public class KeyboardUsb implements Usb {

    private String code = "keyboard";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return "Keyboard Usb";
    }
}
