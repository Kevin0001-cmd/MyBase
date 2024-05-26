package com.zkf.shardingspheredemo;

import com.zkf.shardingspheredemo.demos.dao.ConfigMapper;
import com.zkf.shardingspheredemo.demos.dao.OrderItemMapper;
import com.zkf.shardingspheredemo.demos.dao.OrderMapper;
import com.zkf.shardingspheredemo.demos.model.Config;
import com.zkf.shardingspheredemo.demos.model.Order;
import com.zkf.shardingspheredemo.demos.model.OrderItem;
import com.zkf.shardingspheredemo.demos.service.IConfigService;
import com.zkf.shardingspheredemo.demos.service.IOrderItemService;
import com.zkf.shardingspheredemo.demos.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;


@SpringBootTest
//@RunWith(SpringRunner.class)
public class ShardingspheredemoApplicationTests {

    @Autowired
    IOrderService orderService;

    @Autowired
    IOrderItemService orderItemService;

    @Autowired
    IConfigService configService;

    @Test
    void contextLoads() {
        for (int i = 0; i < 4; i++) {
            Order order = new Order();
//            order.setOrderId((long) i + 1);
            order.setOrderNo("A000" + i);
            order.setCreateName("订单 " + i);
            order.setPrice(new BigDecimal("" + i));
            orderService.insert(order);


//            OrderItem orderItem = new OrderItem();
////            orderItem.setItemId((long) i + 1);
//            orderItem.setOrderNo(order.getOrderId().toString());
//            orderItem.setItemName("服务项目" + i);
//            orderItem.setPrice(new BigDecimal("" + i));
//            orderItemService.insert(orderItem);
        }
    }

    @Test
    void config() {
        Config tConfig = new Config();
//        tConfig.setId(3l);
        tConfig.setRemark("我是广播表");
        tConfig.setCreateTime(new Date());
        tConfig.setLastModifyTime(new Date());
        configService.insert(tConfig);
    }

}
