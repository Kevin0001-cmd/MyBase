package com.zkf.shardingspheredemo.demos.service.impl;

import com.zkf.shardingspheredemo.demos.dao.OrderItemMapper;
import com.zkf.shardingspheredemo.demos.model.OrderItem;
import com.zkf.shardingspheredemo.demos.model.OrderItemExample;
import com.zkf.shardingspheredemo.demos.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {

    @Autowired
    OrderItemMapper mapper;

    @Override
    public long countByExample(OrderItemExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(OrderItemExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long itemId) {
        return 0;
    }

    @Override
    public int insert(OrderItem record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(OrderItem record) {
        return 0;
    }

    @Override
    public List<OrderItem> selectByExample(OrderItemExample example) {
        return null;
    }

    @Override
    public OrderItem selectByPrimaryKey(Long itemId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(OrderItem record, OrderItemExample example) {
        return 0;
    }

    @Override
    public int updateByExample(OrderItem record, OrderItemExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(OrderItem record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OrderItem record) {
        return 0;
    }
}
