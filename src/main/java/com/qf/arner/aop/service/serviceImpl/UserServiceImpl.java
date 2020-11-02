package com.qf.arner.aop.service.serviceImpl;

import com.qf.arner.aop.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String login() {
        System.out.println("2.核心方法！！！！！");
        return "核心方法";
    }
}
