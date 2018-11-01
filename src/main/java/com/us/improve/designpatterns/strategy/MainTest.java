package com.us.improve.designpatterns.strategy;

/**
 * Created by Loren on 2018/11/1.
 */
public class MainTest {

    public static void main(String[] args) {
        Context context = new Context();

        // 设定策略A
        context.setStrategy(new StrategyA());

        context.setResult(100);
        System.out.println(context.getResult());

        // 设定策略B
        context.setStrategy(new StrategyB());

        context.setResult(100);
        System.out.println(context.getResult());
    }

}
