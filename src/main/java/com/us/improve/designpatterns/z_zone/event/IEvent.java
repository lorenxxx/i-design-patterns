package com.us.improve.designpatterns.z_zone.event;

import com.us.improve.designpatterns.z_zone.event.handler.IEventConditionalHandler;
import com.us.improve.designpatterns.z_zone.event.handler.IEventHandler;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * @ClassName IEvent
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 4:12 PM
 * @Version 1.0
 **/
public interface IEvent {

    default void happen() {
        List<IEventHandler> eventHandlers = ApplicationContext.listAllEventHandler();
        if (CollectionUtils.isEmpty(eventHandlers)) {
            return;
        }

        for (IEventHandler eventHandler : eventHandlers) {
            if (eventHandler instanceof IEventConditionalHandler) {
                IEventConditionalHandler eventConditionalHandler = (IEventConditionalHandler) eventHandler;
                eventConditionalHandler.handle(this);
            } else {
                eventHandler.handle(this);
            }
        }

    }

}