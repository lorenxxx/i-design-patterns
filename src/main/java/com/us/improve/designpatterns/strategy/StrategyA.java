package com.us.improve.designpatterns.strategy;

/**
 * 策略A实现方案
 *
 * Created by Loren on 2018/11/1.
 */
public class StrategyA implements IStrategy {

    public int calculate(int data) {
        return data * 2;
    }

}
