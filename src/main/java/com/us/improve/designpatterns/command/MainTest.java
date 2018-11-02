package com.us.improve.designpatterns.command;

/**
 * Created by Loren on 2018/11/2.
 */
public class MainTest {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setButton(1, new ConcreteCommandMachineA());
        invoker.setButton(2, new ConcreteCommandMachineB());

        invoker.pressButton(1);
        invoker.pressButton(2);
    }

}
