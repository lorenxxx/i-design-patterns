package com.us.improve.designpatterns.strategy;

/**
 * 环境类
 * 负责使用算法策略，其中维持一个抽象策略类的引用实例
 *
 * Created by Loren on 2018/11/1.
 */
public class Context {

    private int result;

    private IStrategy strategy;

    public int getResult() {
        return strategy.calculate(result);
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

}
