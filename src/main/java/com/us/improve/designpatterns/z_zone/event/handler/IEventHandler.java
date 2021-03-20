package com.us.improve.designpatterns.z_zone.event.handler;

import com.us.improve.designpatterns.z_zone.event.IEvent;

/**
 * @ClassName IEventListener
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 4:14 PM
 * @Version 1.0
 **/
public interface IEventHandler {

    void handle(IEvent event);

}