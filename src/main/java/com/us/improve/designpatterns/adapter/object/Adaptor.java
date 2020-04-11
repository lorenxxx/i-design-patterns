package com.us.improve.designpatterns.adapter.object;

/**
 * @ClassName Adaptor
 * @Desciption 对象适配器：基于组合
 * @Author loren
 * @Date 2020/4/10 8:23 PM
 * @Version 1.0
 **/
public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        // 委托给Adaptee
        adaptee.fa();
    }

    @Override
    public void f2() {
        // 重新实现f2()...
    }

    @Override
    public void fc() {
        adaptee.fc();
    }

}
