package com.us.improve.designpatterns.state;

/**
 * 具体状态类（冰水）
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteStateCold implements State {

    public void heat(Context context) {
        System.out.println("当前加热后成为常温的水");
        context.setState(context.getConcreteStateNormal());
    }

    public void ice(Context context) {
        System.out.println("当前已经是冰水");
    }

}
