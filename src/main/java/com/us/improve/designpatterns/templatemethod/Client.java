package com.us.improve.designpatterns.templatemethod;

/**
 * @ClassName Client
 * @Desciption 客户端
 * @Author loren
 * @Date 2020/3/19 8:37 PM
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        AbstractNetwork network;

        network = new Facebook();
        network.postMsg("Hello, Facebook.");

        network = new Twitter();
        network.postMsg("Hello, Twitter.");
    }

}
