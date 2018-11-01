package com.us.improve.designpatterns.simplefactory;

/**
 * Created by Loren on 2018/11/1.
 */
public class MainTest {

    public static void main(String[] args) {
        // 建造一个工厂
        Factory factory = new Factory();

        // 利用工厂生产一个产品
        IProduct product = factory.getProduct("banana");

        product.dis();
    }

}
