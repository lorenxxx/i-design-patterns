package com.us.improve.designpatterns.bridge;

/**
 * 大号的笔
 *
 * Created by Loren on 2018/11/6.
 */
public class BigPen extends AbstractPen {

    public void setColor(IColor color) {
        this.color = color;
    }

    public void dis() {
        System.out.print("用大号的笔画出");
        color.color();
    }

}
