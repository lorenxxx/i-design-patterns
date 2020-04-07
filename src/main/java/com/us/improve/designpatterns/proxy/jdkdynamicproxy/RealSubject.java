package com.us.improve.designpatterns.proxy.jdkdynamicproxy;

/**
 * @ClassName RealSubject
 * @Desciption 实际对象
 * @Author loren
 * @Date 2020/4/7 9:25 PM
 * @Version 1.0
 **/
public class RealSubject implements ISubject {

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}
