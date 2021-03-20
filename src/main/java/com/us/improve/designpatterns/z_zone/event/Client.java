package com.us.improve.designpatterns.z_zone.event;

/**
 * @ClassName Client
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 4:55 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        IEvent event = new UserRoleChangeEvent();
        event.happen();
    }

}
