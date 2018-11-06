package com.us.improve.designpatterns.bridge;

/**
 * 小号的笔
 *
 * Created by Loren on 2018/11/6.
 */
public class SmallPen extends AbstractPen {

    public void setColor(IColor color) {
        this.color = color;
    }

    public void dis() {
        System.out.print("用小号的笔画出");
        color.color();
    }

}
