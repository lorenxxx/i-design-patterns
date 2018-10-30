package com.us.improve.designpatterns.decorate.component;

/**
 * 饮料
 * 抽象构件
 *
 * Created by Loren on 2018/10/30.
 */
public abstract class Beverage {

    /**
     * 返回饮料的描述
     * @return
     */
    public abstract String getDescription();

    /**
     * 返回饮料的价格
     * @return
     */
    public abstract double getCost();

}
