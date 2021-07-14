package com.us.improve.designpatterns.observer;

/**
 * 抽象观察者
 *
 * Created by Loren on 2018/10/30.
 */
public interface Observer {

    /**
     * 主题变化时通知观察者调用
     *
     * @param message
     */
    void update(String message);

}
