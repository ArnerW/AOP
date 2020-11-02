package com.qf.arner.aop.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object obj;


    /**
     * 获取被代理对象
     * @param obj
     * @return
     */
    public Object newInstance(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    /**
     * 代理方法
     * @param proxy 代理对象
     * @param method 核心方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start!!!");
        Object invoke = null;
        try{
            int i = 1/0;
            invoke = method.invoke(obj, args);
            System.out.println("submit!!!");
        }catch (Exception e){
            System.out.println("back!!!");
        }
        return invoke;
    }
}
