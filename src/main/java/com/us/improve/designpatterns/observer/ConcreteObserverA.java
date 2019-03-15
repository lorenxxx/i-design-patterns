package com.us.improve.designpatterns.observer;

/**
 * 具体观察者A
 *
 * Created by Loren on 2018/10/30.
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update(String message) {
        System.out.println("ConcreteObserverA is notified: " + message);
    }

}
