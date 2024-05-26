package com.zkf.aopDemo;

import org.springframework.stereotype.Service;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/10 16:29
 * @Description:
 */
@Service
public class UserService implements IUserService {
    @Override
    public void query() {
        System.out.println("search student~~~");
    }
}
