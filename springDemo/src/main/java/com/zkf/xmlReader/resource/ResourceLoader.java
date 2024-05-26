package com.zkf.xmlReader.resource;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/2/28 22:10
 * @Description:
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResouce(String location);
}
