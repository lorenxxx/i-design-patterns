package com.us.improve.designpatterns.command;

/**
 * 具体命令类-用于操作机器B
 *
 * Created by Loren on 2018/11/2.
 */
public class ConcreteCommandMachineB implements Command {

    private ReceiverB machineB;

    public ConcreteCommandMachineB() {
        this.machineB = new ReceiverB();
    }

    public void execute() {
        machineB.start();
    }

}
