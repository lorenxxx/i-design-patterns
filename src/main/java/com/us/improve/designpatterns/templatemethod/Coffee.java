package com.us.improve.designpatterns.templatemethod;

/**
 * 咖啡
 *
 * Created by Loren on 2018/11/1.
 */
public class Coffee extends AbstractClass {

    protected void addIngredient() {
        System.out.println("加入速溶咖啡粉");
    }

    @Override
    protected void addSugar(){
        System.out.println("加入糖");
    }

}
