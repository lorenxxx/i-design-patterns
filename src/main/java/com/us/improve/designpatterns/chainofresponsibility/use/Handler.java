package com.us.improve.designpatterns.chainofresponsibility.use;

/**
 * 抽象处理者
 *
 * Created by Loren on 2018/11/2.
 */
public abstract class Handler {

    /**
     * 后继对象
     */
    protected Handler successor;

    public abstract void solve(int value);

}
