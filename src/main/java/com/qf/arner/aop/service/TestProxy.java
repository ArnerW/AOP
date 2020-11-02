package com.qf.arner.aop.service;

import com.qf.arner.aop.service.proxy.UserServiceProxy;
import com.qf.arner.aop.service.serviceImpl.UserServiceImpl;

public class TestProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.login();
    }
}
