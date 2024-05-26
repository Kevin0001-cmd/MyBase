package com.zkf.aopDemoV2;

/**
 * @Author: KfZhao
 * @CreateDate: 2024/3/14 08:09
 * @Description:
 */
public class UserService implements IUserService {
    @Override
    public String queryUser(String name) {
        System.out.println("Query,This user name is " + name);
        return name;
    }

    @Override
    public String addUser(String name) {
        System.out.println("Add one user,name is " + name);
        return name;
    }
}
