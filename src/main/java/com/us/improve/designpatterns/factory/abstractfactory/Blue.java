package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName Blue
 * @Desciption 具体产品：蓝色
 * @Author loren
 * @Date 2020/3/15 9:48 PM
 * @Version 1.0
 **/
public class Blue implements IColor {

    @Override
    public void display() {
        System.out.print("blue...");
    }

}
