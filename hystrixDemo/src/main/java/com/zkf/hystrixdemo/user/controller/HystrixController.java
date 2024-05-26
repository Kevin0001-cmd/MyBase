package com.zkf.hystrixdemo.user.controller;

import com.zkf.hystrixdemo.common.ResultMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hystrix")
public class HystrixController {

    private static Long MAX_SLEEP_TIME = 5000L;

    /**
     * 测试超时
     */
    @GetMapping("/timeout")
    public ResultMessage timeout() {
        Long sleepTime = (long) (MAX_SLEEP_TIME * Math.random());
        try {
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            System.out.println("执行异常");
        }
        return new ResultMessage(true, "执行时间" + sleepTime);
    }

    /**
     * 异常测试
     */
    @GetMapping("/exp/{msg}")
    public ResultMessage exp(@PathVariable("msg") String msg) {
        if ("spring".equals(msg)) {
            return new ResultMessage(true, msg);
        } else {
            throw new RuntimeException("出现了异常，请检查参数是否是spring");
        }
    }
}
