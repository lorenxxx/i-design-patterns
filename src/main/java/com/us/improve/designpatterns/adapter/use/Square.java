package com.us.improve.designpatterns.adapter.use;

/**
 * @ClassName Square
 * @Desciption 正方形
 * @Author loren
 * @Date 2020/3/11 9:23 PM
 * @Version 1.0
 **/
public class Square implements IShape {

    @Override
    public void display() {
        System.out.println("I am a square");
    }

}

