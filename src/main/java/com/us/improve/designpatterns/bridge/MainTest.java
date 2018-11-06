package com.us.improve.designpatterns.bridge;

/**
 * Created by Loren on 2018/11/6.
 */
public class MainTest {

    public static void main(String[] args) {
        IColor blueColor = new BlueColor();
        IColor redColor = new RedColor();

        AbstractPen bigPen = new BigPen();
        AbstractPen smallPen = new SmallPen();

        bigPen.setColor(blueColor);
        smallPen.setColor(redColor);

        bigPen.dis();
        smallPen.dis();
    }

}
