package com.qf.arner.aop.cglib;

import com.qf.arner.aop.service.UserService;
import com.qf.arner.aop.service.serviceImpl.UserServiceImpl;

public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        UserService userService = (UserService) proxy.getProxy(UserServiceImpl.class);
        String login = userService.login();
    }
}
