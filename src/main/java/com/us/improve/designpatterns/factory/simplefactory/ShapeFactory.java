package com.us.improve.designpatterns.factory.simplefactory;

/**
 * @ClassName ShapeFactory
 * @Desciption 工厂类：形状工厂
 * @Author loren
 * @Date 2020/3/15 9:20 PM
 * @Version 1.0
 **/
public class ShapeFactory {

    public static IShape createShape(String name) {
        switch (name) {
            case "line":
                return new Line();
            case "square":
                return new Square();
            default:
                return null;
        }
    }

}