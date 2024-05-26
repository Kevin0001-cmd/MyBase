package com.zkf.strategy.usb;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/29 06:16
 * @Description:
 */
public class CameraUsb implements Usb {

    private String code = "camera";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return "Camera Usb";
    }
}
