package com.us.improve.designpatterns.state;

/**
 * Created by Loren on 2018/11/2.
 */
public class MainTest {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateHot(), new ConcreteStateCold(), new ConcreteStateNormal());
        // 初始化当前为常温的水
        context.setState(context.getConcreteStateNormal());
        // 加热
        context.heat();
        // 加热
        context.heat();
        // 冷却
        context.ice();
        // 冷却
        context.ice();
        // 冷却
        context.ice();
    }

}
