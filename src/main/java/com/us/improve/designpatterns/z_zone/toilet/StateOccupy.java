package com.us.improve.designpatterns.z_zone.toilet;

/**
 * @ClassName StateOccupy
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:18 PM
 * @Version 1.0
 **/
public class StateOccupy implements IState {

    @Override
    public void occupy(ToiletContext context) {
        System.out.println("Warning: Already occupy!!!");
    }

    @Override
    public void release(ToiletContext context) {
        System.out.println("Release done...");
        context.setState(context.getStateRelease());
    }

}
