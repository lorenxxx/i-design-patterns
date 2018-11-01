package com.us.improve.designpatterns.simplefactory;

/**
 * 工厂角色
 *
 * Created by Loren on 2018/11/1.
 */
public class Factory {

    /**
     * 工厂生产产品的方法，根据名字生产对应的产品，如果名字不存在则使用默认产品
     *
     * @param fruit
     * @return
     */
    public static IProduct getProduct(String fruit) {
        IProduct product;

        if ("apple".equals(fruit)) {
            product = new Apple();
        } else if ("banana".equals(fruit)) {
            product = new Banana();
        } else {
            product = new Apple();
        }

        return product;
    }

}
