package com.us.improve.designpatterns.adapter.use;

/**
 * @ClassName Point
 * @Desciption 点
 * @Author loren
 * @Date 2020/3/11 9:21 PM
 * @Version 1.0
 **/
public class Point implements IShape {

    @Override
    public void display() {
        System.out.println("I am a point");
    }

}
