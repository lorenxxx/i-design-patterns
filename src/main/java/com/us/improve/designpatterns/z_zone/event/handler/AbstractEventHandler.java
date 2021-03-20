package com.us.improve.designpatterns.z_zone.event.handler;

import com.us.improve.designpatterns.z_zone.event.IEvent;

/**
 * @ClassName AbstractEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 6:08 PM
 * @Version 1.0
 **/
public abstract class AbstractEventHandler implements IEventHandler {

    @Override
    public final void handle(IEvent event) {
        doHandle(event);
    }

    public abstract void doHandle(IEvent event);

}
