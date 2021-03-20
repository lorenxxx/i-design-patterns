package com.us.improve.designpatterns.z_zone.event;

import com.us.improve.designpatterns.z_zone.event.handler.IEventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ApplicationContext
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/9 6:23 PM
 * @Version 1.0
 **/
public class ApplicationContext {

    public static List<IEventHandler> listAllEventHandler() {
        return new ArrayList<>();
    }

}
