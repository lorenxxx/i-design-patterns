package com.us.improve.designpatterns.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/7 9:30 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        System.out.println("调用原始对象: ");
        subject.sayHello("Loren");
        subject.sayGoodBye();
        System.out.println();

        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();

        InvocationHandler pmsCheckInvocationHandler = new PmsCheckInvocationHandler(subject);
        ISubject subjectProxy1 = (ISubject) Proxy.newProxyInstance(classLoader, interfaces, pmsCheckInvocationHandler);

        InvocationHandler logInvocationHandler = new LogInvocationHandler(subjectProxy1);
        ISubject subjectProxy2 = (ISubject) Proxy.newProxyInstance(classLoader, interfaces, logInvocationHandler);

        System.out.println("调用代理对象: ");
        subjectProxy2.sayHello("Loren");
        subjectProxy2.sayGoodBye();
    }

}
