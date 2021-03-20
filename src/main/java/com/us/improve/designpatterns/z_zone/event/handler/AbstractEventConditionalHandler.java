package com.us.improve.designpatterns.z_zone.event.handler;

import com.us.improve.designpatterns.z_zone.event.IEvent;

/**
 * @ClassName AbstracEventConditionalHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 6:09 PM
 * @Version 1.0
 **/
public abstract class AbstractEventConditionalHandler implements IEventConditionalHandler {

    @Override
    public void handle(IEvent event) {
        if (!checkCondition(event)) {
            return;
        }

        doHandle(event);
    }

    public abstract void doHandle(IEvent event);

}
