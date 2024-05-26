package com.zkf.strategy;

import com.zkf.strategy.usb.Usb;

public interface DataLoader {
    Usb loadData(String name);
}
