package com.us.improve.designpatterns.command;

/**
 * 集体命令类-用于操作机器A
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteCommandMachineA implements Command {

    private ReceiverA machineA;

    public ConcreteCommandMachineA() {
        machineA = new ReceiverA();
    }

    public void execute() {
        machineA.start();
    }


}
