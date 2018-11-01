package com.us.improve.designpatterns.strategy;

/**
 * 抽象策略类
 *
 * Created by Loren on 2018/11/1.
 */
public interface IStrategy {

    /**
     * 根据不同的策略计算得出结果
     *
     * @param data
     * @return
     */
    int calculate(int data);

}
