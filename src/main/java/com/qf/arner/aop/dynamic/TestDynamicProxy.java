package com.qf.arner.aop.dynamic;

import com.qf.arner.aop.service.UserService;
import com.qf.arner.aop.service.serviceImpl.UserServiceImpl;

public class TestDynamicProxy {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserService userService = (UserService) dynamicProxy.newInstance(new UserServiceImpl());
        userService.login();
    }
}
