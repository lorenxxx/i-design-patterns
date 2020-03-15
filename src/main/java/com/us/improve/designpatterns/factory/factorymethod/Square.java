package com.us.improve.designpatterns.factory.factorymethod;

/**
 * @ClassName Square
 * @Desciption 具体产品：正方形
 * @Author loren
 * @Date 2020/3/15 9:19 PM
 * @Version 1.0
 **/
public class Square implements IShape {

    @Override
    public void display() {
        System.out.println("I am a Square");
    }

}

