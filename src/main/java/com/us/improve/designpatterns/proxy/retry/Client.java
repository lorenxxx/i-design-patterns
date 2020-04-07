package com.us.improve.designpatterns.proxy.retry;

/**
 * @ClassName Client
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/7 10:47 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 原始对象
        IBusiness business = new Business();

        // 获取被代理对象
        RetrySupport retrySupport = new RetrySupport.Builder().target(business).build();
        IBusiness businessProxy = (IBusiness) retrySupport.getProxy();

        // 调用被代理对象
        String result = (String) businessProxy.doBusiness();
        System.out.println("result: " + result);
    }

}
