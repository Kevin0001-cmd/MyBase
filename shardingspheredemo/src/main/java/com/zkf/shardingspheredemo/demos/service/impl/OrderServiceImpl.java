package com.zkf.shardingspheredemo.demos.service.impl;

import com.zkf.shardingspheredemo.demos.dao.OrderMapper;
import com.zkf.shardingspheredemo.demos.model.Order;
import com.zkf.shardingspheredemo.demos.model.OrderExample;
import com.zkf.shardingspheredemo.demos.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderMapper mapper;

    @Override
    public long countByExample(OrderExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(OrderExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long orderId) {
        return 0;
    }

    @Override
    public int insert(Order record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Order record) {
        return 0;
    }

    @Override
    public List<Order> selectByExample(OrderExample example) {
        return null;
    }

    @Override
    public Order selectByPrimaryKey(Long orderId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Order record, OrderExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Order record, OrderExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return 0;
    }
}
