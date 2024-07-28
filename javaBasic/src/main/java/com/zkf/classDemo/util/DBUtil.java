package com.zkf.classDemo.util;

import com.alibaba.fastjson.JSON;
import com.zkf.classDemo.service.DBService;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class DBUtil<T> {

//    private final Class<T> type;
    private final Type argType;

//    public DBUtil(T vo) {
//        type = (Class<T>) vo.getClass();
//    }

    public DBUtil() {
//        type = (Class<T>) vo.getClass();
        Class<?> superclass = getClass().getSuperclass();
        Type superClass = getClass().getGenericSuperclass();
        if (!(superClass instanceof ParameterizedType)) {
            throw new IllegalArgumentException("无泛型类型信息");
        }
        argType = ((ParameterizedType) superClass).getActualTypeArguments()[0];
    }

    public void save(T vo) {
//        System.out.println("type:" + type.getName());
        System.out.println("save vo:" + JSON.toJSONString(vo));
    }

//    @Override
//    public String getDBType() {
//        System.out.println("DB Type:" + "MySQL");
//        return "MySQL";
//    }

    public Type getType() {
        return argType;
    }
}
