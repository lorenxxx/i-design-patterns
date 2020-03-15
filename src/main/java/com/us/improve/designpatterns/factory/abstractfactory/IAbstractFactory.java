package com.us.improve.designpatterns.factory.abstractfactory;

/**
 * @ClassName IAbstractFactory
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/15 9:49 PM
 * @Version 1.0
 **/
public interface IAbstractFactory {

    /**
     * 生产颜色
     *
     * @return 颜色
     */
    IColor produceColor();

    /**
     * 生产形状
     *
     * @return 形状
     */
    IShape produceShape();

}