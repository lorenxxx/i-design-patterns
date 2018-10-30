package com.us.improve.designpatterns.observer;

/**
 * Created by Loren on 2018/10/30.
 */
public class MainTest {

    public static void main(String[] args) {
        // 创建具体目标
        Subject subject = new ConcreteSubject();

        // 创建具体观察者
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        // 注册观察者A、B
        subject.register(observerA);
        subject.register(observerB);

        // 发布消息
        subject.notifyObserver("hello everyone!");

        // 观察者B取消订阅
        subject.remove(observerB);

        // 再次发布消息
        subject.notifyObserver("is everyone here?");
    }

}
