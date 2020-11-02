package com.qf.arner.aop.service.proxy;

import com.qf.arner.aop.service.UserService;

public class UserServiceProxy implements UserService {
    private UserService userservice;

    public UserServiceProxy(UserService userservice) {
        this.userservice = userservice;
    }

    @Override
    public String login() {
        open();
        String login = userservice.login();
        end();
        return login;
    }

    private void open(){
        System.out.println("1.非核心方法");
    }

    private void end(){
        System.out.println("3.非核心方法");
    }
}
