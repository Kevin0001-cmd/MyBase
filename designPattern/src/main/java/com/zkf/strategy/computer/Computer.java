package com.zkf.strategy.computer;

import com.zkf.strategy.DataLoader;
import com.zkf.strategy.usb.CameraUsb;
import com.zkf.strategy.usb.KeyboardUsb;
import com.zkf.strategy.usb.Usb;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/29 06:16
 * @Description:
 */
public class Computer implements DataLoader {
    private Usb usb;

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }


    public Usb loadData(String name) {
        if ("keyboard".equals(name)) {
            return new KeyboardUsb();
        } else if ("camera".equals(name)) {
            return new CameraUsb();
        }
        return null;
    }
}
