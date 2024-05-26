package com.zkf.hystrixdemo.product.controller;

import com.zkf.hystrixdemo.common.ResultMessage;
import com.zkf.hystrixdemo.product.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @Autowired
    private UserFacade userFacade = null;

    @GetMapping("/cr/timeout")
    public ResultMessage timeout() {
        return userFacade.timeout();
    }

    @GetMapping("/cr/exp/{msg}")
    public ResultMessage exp(@PathVariable("msg") String msg) {
        return userFacade.exp(msg);
    }
}
