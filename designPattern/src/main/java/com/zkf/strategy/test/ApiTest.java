package com.zkf.strategy.test;

import com.zkf.strategy.computer.Computer;
import com.zkf.strategy.config.Config;
import com.zkf.strategy.usb.KeyboardUsb;
import com.zkf.strategy.usb.Usb;
import org.junit.Test;

import java.util.Map;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/29 06:18
 * @Description:
 */
public class ApiTest {

    /**
     * 在接口computer定义一个方法，功能是根据条件判断返回哪一个策略
     * 在测试方法中，传入策略的名字，返回策略的实现类，然后执行实现类中的方法
     */
    @Test
    public void test_strategy() {
        Computer computer = new Computer();
        computer.setUsb(new KeyboardUsb());
        Usb usb = computer.loadData("keyboard");
        String data = usb.getData();
        System.out.println(data);
    }

    /**
     * 先将所有的策略配置在一个Map中，然后根据策略的名称调用
     */
    @Test
    public void test_config_strategy() {
        Map<String, Usb> usbMap = Config.usbMap;
        Usb camera = usbMap.get("camera");
        String data = camera.getData();
        System.out.println(data);
    }


}
