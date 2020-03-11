package com.us.improve.designpatterns.adapter.use;

/**
 * @ClassName OldCircleAdapter
 * @Desciption OldCircle类的适配器，适配IShape接口
 * @Author loren
 * @Date 2020/3/11 9:30 PM
 * @Version 1.0
 **/
public class OldCircleAdapter implements IShape {

    private OldCircle oldCircle;

    public OldCircleAdapter() {
        this.oldCircle = new OldCircle();
    }

    @Override
    public void display() {
        this.oldCircle.displayIt();
    }

}
