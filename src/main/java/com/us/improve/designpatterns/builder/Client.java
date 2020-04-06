package com.us.improve.designpatterns.builder;

/**
 * @ClassName Client
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/6 7:53 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .name("dbconnectionpool")
                .maxTotal(16)
                .maxIdle(10)
                .minIdle(12)
                .build();
    }

}
