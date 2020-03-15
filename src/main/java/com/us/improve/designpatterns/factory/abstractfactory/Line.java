package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName Line
 * @Desciption 具体产品：直线
 * @Author loren
 * @Date 2020/3/15 9:43 PM
 * @Version 1.0
 **/
public class Line implements IShape {

    @Override
    public void display() {
        System.out.print("line...");
    }

}

