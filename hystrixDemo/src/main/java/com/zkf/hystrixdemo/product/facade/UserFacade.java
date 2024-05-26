package com.zkf.hystrixdemo.product.facade;

import com.zkf.hystrixdemo.common.ResultMessage;

public interface UserFacade {

    public ResultMessage timeout();

    public ResultMessage exp(String msg);
}
