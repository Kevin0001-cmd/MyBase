package com.zkf.mybatisdemo.controller;

import com.zkf.mybatisdemo.mapper.UserMapper;
import com.zkf.mybatisdemo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper mapper;

    @RequestMapping(value = "select")
    public void select() {
        User user = mapper.selectByPrimaryKey(1l);
        System.out.println(user.toString());
    }
}
