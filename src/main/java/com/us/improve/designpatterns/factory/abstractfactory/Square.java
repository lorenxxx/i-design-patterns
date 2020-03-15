package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName Square
 * @Desciption 具体产品：正方形
 * @Author loren
 * @Date 2020/3/15 9:45 PM
 * @Version 1.0
 **/
public class Square implements IShape {

    @Override
    public void display() {
        System.out.print("square...");
    }

}
