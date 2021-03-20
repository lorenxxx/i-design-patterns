package com.us.improve.designpatterns.z_zone.toilet;

/**
 * @ClassName IState
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:15 PM
 * @Version 1.0
 **/
public interface IState {

    /**
     * 占用
     *
     * @param context
     */
    void occupy(ToiletContext context);

    /**
     * 释放
     *
     * @param context
     */
    void release(ToiletContext context);

}