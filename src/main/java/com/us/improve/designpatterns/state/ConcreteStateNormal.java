package com.us.improve.designpatterns.state;

/**
 * 具体状态类（常温的水）
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteStateNormal implements State {

    public void heat(Context context) {
        System.out.println("当前加热后成为热水");
        context.setState(context.getConcreteStateHot());
    }

    public void ice(Context context) {
        System.out.println("当前冷却后成为冰水");
        context.setState(context.getConcreteStateCold());
    }

}
