package com.us.improve.designpatterns.chainofresponsibility.use;

/**
 * 具体处理者-默认
 * 默认处理者一般是责任链的最后一个处理者，无论是什么样的请求，如果最后到这里都会被处理
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteHandlerDefault extends Handler {

    public void solve(int value) {
        System.out.println("当前处理金额大于1000，为：" + value);
    }

}
