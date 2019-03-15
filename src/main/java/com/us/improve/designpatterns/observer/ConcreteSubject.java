package com.us.improve.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 *
 * Created by Loren on 2018/10/30.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
