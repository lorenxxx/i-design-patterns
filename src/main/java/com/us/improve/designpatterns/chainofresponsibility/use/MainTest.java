package com.us.improve.designpatterns.chainofresponsibility.use;

/**
 * Created by Loren on 2018/11/2.
 */
public class MainTest {

    public static void main(String[] args) {
        // 构件责任链
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerDefault concreteHandlerDefault = new ConcreteHandlerDefault();

        concreteHandlerA.successor = concreteHandlerB;
        concreteHandlerB.successor = concreteHandlerDefault;


        // 使用责任链处理请求
        concreteHandlerA.solve(50);
        concreteHandlerA.solve(500);
        concreteHandlerA.solve(5000);
    }

}
