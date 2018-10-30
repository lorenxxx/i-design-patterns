package com.us.improve.designpatterns.decorate.component;

/**
 * 原味可可
 * 具体构件
 *
 * Created by Loren on 2018/10/30.
 */
public class Coco extends Beverage {

    @Override
    public String getDescription() {
        return "原味可可";
    }

    @Override
    public double getCost() {
        return 6.0;
    }

}
