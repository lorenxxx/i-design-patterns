package com.us.improve.designpatterns.proxy.retry;

import java.util.Random;

/**
 * @ClassName RetryBusiness
 * @Desciption TODO
 * @Author loren
 * @Date 2019/5/30 11:05 AM
 * @Version 1.0
 **/
public class Business implements IBusiness {

    @Override
    public Object doBusiness() {
        if (new Random().nextBoolean()) {
            throw new RuntimeException("Random Exception");
        }

        System.out.println("do business...");
        return "success";
    }

}
