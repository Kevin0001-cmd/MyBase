package com.zkf.shardingspheredemo.demos.service.impl;

import com.zkf.shardingspheredemo.demos.dao.ConfigMapper;
import com.zkf.shardingspheredemo.demos.model.Config;
import com.zkf.shardingspheredemo.demos.model.ConfigExample;
import com.zkf.shardingspheredemo.demos.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigServiceImpl implements IConfigService {

    @Autowired
    ConfigMapper mapper;

    @Override
    public long countByExample(ConfigExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ConfigExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(Config record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Config record) {
        return 0;
    }

    @Override
    public List<Config> selectByExample(ConfigExample example) {
        return null;
    }

    @Override
    public Config selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Config record, ConfigExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Config record, ConfigExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Config record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Config record) {
        return 0;
    }
}
