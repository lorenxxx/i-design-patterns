package com.us.improve.designpatterns.adapter.clazz;

/**
 * @ClassName Adaptor
 * @Desciption 类适配器: 基于继承
 * @Author loren
 * @Date 2020/4/10 8:20 PM
 * @Version 1.0
 **/
public class Adaptor extends Adaptee implements ITarget {

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // 重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
