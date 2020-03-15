package com.us.improve.designpatterns.factory.simplefactory;

/**
 * @ClassName Line
 * @Desciption 具体产品：直线
 * @Author loren
 * @Date 2020/3/15 9:18 PM
 * @Version 1.0
 **/
public class Line implements IShape {

    @Override
    public void display() {
        System.out.println("I am a line");
    }

}
