package com.us.improve.designpatterns.observer;

/**
 * 抽象主题
 *
 * Created by Loren on 2018/10/30.
 */
public interface Subject {

    /**
     * 观察者注册(订阅)这个主题
     *
     * @param observer
     */
    void register(Observer observer);

    /**
     * 观察者取消订阅这个主题
     *
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 通知所有订阅这个主题的观察者
     *
     * @param message
     */
    void notifyObserver(String message);

}
