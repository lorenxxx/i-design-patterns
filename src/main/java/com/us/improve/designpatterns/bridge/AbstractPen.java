package com.us.improve.designpatterns.bridge;

/**
 * 抽象类-笔
 *
 * Created by Loren on 2018/11/6.
 */
public abstract class AbstractPen {

    protected IColor color;

    public abstract void setColor(IColor color);

    public abstract void dis();

}
