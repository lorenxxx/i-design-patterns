package com.us.improve.designpatterns.chainofresponsibility.use;

/**
 * 具体处理者A
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteHandlerA extends Handler {

    public void solve(int value) {
        if (value < 100) {
            System.out.println("当前处理金额小于100，为：" + value);
        } else {
            // 当前类处理不了金额大于100的请求，或者说是不处理这样类型的请求，转交给下一个责任链上的处理者
            this.successor.solve(value);
        }
    }

}
