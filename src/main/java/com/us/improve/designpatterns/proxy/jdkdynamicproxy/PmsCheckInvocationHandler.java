package com.us.improve.designpatterns.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName InvocationHandlerImpl
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/7 9:27 PM
 * @Version 1.0
 **/
public class PmsCheckInvocationHandler implements InvocationHandler {

    private Object object;

    public PmsCheckInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用前处理
        System.out.println("执行权限校验。。。");

        Object returnValue = method.invoke(object, args);

        return returnValue;
    }

}
