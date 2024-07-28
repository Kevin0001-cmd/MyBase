package com.zkf.classDemo.util;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OracleUtil<T> {
    private final Class<T> type;


    public OracleUtil(T vo) {
        type = (Class<T>) vo.getClass();
    }

    public void save(T vo) {
        System.out.println("type:" + type.getName());
        System.out.println("save vo:" + JSON.toJSONString(vo));
    }

    public String getDBType() {
        String dbType = "Oracle";
        System.out.println("DB Type:" + dbType);
        return dbType;
    }

}
