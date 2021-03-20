package com.us.improve.designpatterns.z_zone.toilet.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName ToiletStateEnum
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:58 PM
 * @Version 1.0
 **/
@AllArgsConstructor
public enum ToiletStateEnum {

    OCCUPY("occupy"),

    RELEASE("release");

    @Getter
    private String value;

}