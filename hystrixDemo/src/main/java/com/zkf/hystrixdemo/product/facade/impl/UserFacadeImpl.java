package com.zkf.hystrixdemo.product.facade.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zkf.hystrixdemo.common.ResultMessage;
import com.zkf.hystrixdemo.product.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private RestTemplate restTemplate = null;

    @Override
    @HystrixCommand(fallbackMethod = "fallback1")
    public ResultMessage timeout() {
        String url = "http://USER/hystrix/timeout";
        return restTemplate.getForObject(url, ResultMessage.class);
    }

    @Override
    public ResultMessage exp(String msg) {
        String url = "http://USER/hystrix/exp/{msg}";
        return restTemplate.getForObject(url, ResultMessage.class, msg);
    }

    public ResultMessage fallback1() {
        return new ResultMessage(false, "超时了");
    }

    public ResultMessage fallback2(String msg) {
        return new ResultMessage(false, "调用产生了异常，参数" + msg);
    }
}
