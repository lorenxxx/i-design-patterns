package com.us.improve.designpatterns.z_zone.event.handler;

import com.us.improve.designpatterns.z_zone.event.IEvent;

/**
 * @ClassName IEventConditionalHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 6:06 PM
 * @Version 1.0
 **/
public interface IEventConditionalHandler extends IEventHandler {

    boolean checkCondition(IEvent event);

}
