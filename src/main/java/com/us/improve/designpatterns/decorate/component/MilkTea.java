package com.us.improve.designpatterns.decorate.component;

/**
 * 原味奶茶
 * 具体构件
 *
 * Created by Loren on 2018/10/30.
 */
public class MilkTea extends Beverage {

    @Override
    public String getDescription() {
        return "原味奶茶";
    }

    @Override
    public double getCost() {
        return 5.0;
    }

}
