package com.us.improve.designpatterns.decorate.decorator;

import com.us.improve.designpatterns.decorate.component.Beverage;

/**
 * 抽象装饰类
 *
 * Created by Loren on 2018/10/30.
 */
public abstract class BeverageDecorator extends Beverage {

    /**
     * 返回饮料装饰后的描述
     * @return
     */
    public abstract String getDescription();

    /**
     * 返回饮料装饰后的价格
     * @return
     */
    public abstract double getCost();

}
