package com.us.improve.designpatterns.observer;

/**
 * 具体观察者B
 *
 * Created by Loren on 2018/10/30.
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void update(String message) {
        System.out.println("ConcreteObserverB is notified: " + message);
    }

}
