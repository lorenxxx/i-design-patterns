package com.us.improve.designpatterns.z_zone.toilet;

/**
 * @ClassName StateIdle
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:19 PM
 * @Version 1.0
 **/
public class StateRelease implements IState {

    @Override
    public void occupy(ToiletContext context) {
        System.out.println("Occupy done...");
        context.setState(context.getStateRelease());
    }

    @Override
    public void release(ToiletContext context) {
        System.out.println("Warning: Already release!!!");
    }

}
