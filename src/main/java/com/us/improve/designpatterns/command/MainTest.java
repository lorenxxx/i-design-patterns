package com.us.improve.designpatterns.command;

/**
 * @ClassName MainTest
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/17 8:55 PM
 * @Version 1.0
 **/
public class MainTest {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.display();

        Command command;

        command = new DrawDogCommand(screen);
        screen.doCommand(command);
        screen.display();

        command = new DrawDogCommand(screen);
        screen.doCommand(command);
        command = new DrawPigCommand(screen);
        screen.doCommand(command);
        command = new DrawFishCommand(screen);
        screen.doCommand(command);
        screen.display();

        screen.undoCommand();
        screen.display();

        screen.undoCommand();
        screen.undoCommand();
        screen.undoCommand();
        screen.display();

        screen.undoCommand();
        screen.display();
    }

}
