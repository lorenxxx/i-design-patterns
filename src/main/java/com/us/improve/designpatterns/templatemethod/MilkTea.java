package com.us.improve.designpatterns.templatemethod;

/**
 * 奶茶
 *
 * Created by Loren on 2018/11/1.
 */
public class MilkTea extends AbstractClass {

    @Override
    protected void addIngredient() {
        System.out.println("加入奶茶粉");
    }

}
