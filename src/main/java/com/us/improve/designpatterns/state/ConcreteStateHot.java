package com.us.improve.designpatterns.state;

/**
 * 具体状态类（热水）
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteStateHot implements State {

    public void heat(Context context) {
        System.out.println("当前已经是热水");
    }

    public void ice(Context context) {
        System.out.println("当前冷却后成为常温的水");
        context.setState(context.getConcreteStateNormal());
    }

}
