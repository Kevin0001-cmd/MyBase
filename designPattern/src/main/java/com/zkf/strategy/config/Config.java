package com.zkf.strategy.config;

import com.zkf.strategy.usb.CameraUsb;
import com.zkf.strategy.usb.KeyboardUsb;
import com.zkf.strategy.usb.Usb;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/29 06:43
 * @Description:
 */
public class Config {

    public static Map<String, Usb> usbMap = new HashMap<>();

    static {
        KeyboardUsb keyboardUsb = new KeyboardUsb();
        CameraUsb cameraUsb = new CameraUsb();
        usbMap.put(keyboardUsb.getCode(), keyboardUsb);
        usbMap.put(cameraUsb.getCode(), cameraUsb);
    }
}
