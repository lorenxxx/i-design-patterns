package com.us.improve.designpatterns.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName LogInvocationHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/7 9:38 PM
 * @Version 1.0
 **/
public class LogInvocationHandler implements InvocationHandler {

    private Object object;

    public LogInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Log before...");

        Object returnVal = method.invoke(object, args);

        System.out.println("Log after...");

        return returnVal;
    }

}
