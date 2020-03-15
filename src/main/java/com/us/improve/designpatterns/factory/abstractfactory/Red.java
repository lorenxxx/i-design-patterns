package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName Red
 * @Desciption 具体产品：红色
 * @Author loren
 * @Date 2020/3/15 9:47 PM
 * @Version 1.0
 **/
public class Red implements IColor {

    @Override
    public void display() {
        System.out.print("red...");
    }

}
