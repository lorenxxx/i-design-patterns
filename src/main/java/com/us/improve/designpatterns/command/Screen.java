package com.us.improve.designpatterns.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Screen
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/17 8:52 PM
 * @Version 1.0
 **/
public class Screen {

    private LinkedList<String> contents;

    private Stack<Command> commandHistory;

    public Screen() {
        contents = new LinkedList<>();
        commandHistory = new Stack<>();
    }

    public void doCommand(Command command) {
        commandHistory.push(command);
        command.execute();
    }

    public void undoCommand() {
        if (commandHistory.size() > 0) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

    public void attachContent(String content) {
        contents.add(content);
    }

    public void removeLastContent() {
        contents.removeLast();
    }

    public void display() {
        System.out.println(contents);
    }

}
