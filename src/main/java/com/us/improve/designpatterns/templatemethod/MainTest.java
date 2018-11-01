package com.us.improve.designpatterns.templatemethod;

/**
 * Created by Loren on 2018/11/1.
 */
public class MainTest {

    public static void main(String[] args) {
        // 制作咖啡
        Coffee coffee = new Coffee();
        coffee.make();

        System.out.println("------------------");

        // 制作奶茶
        MilkTea milkTea = new MilkTea();
        milkTea.make();
    }

}
