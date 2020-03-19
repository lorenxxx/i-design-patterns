package com.us.improve.designpatterns.command;

/**
 * @ClassName DrawDogCommand
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/17 9:02 PM
 * @Version 1.0
 **/
public class DrawDogCommand implements Command {

    private static final String CONTENT = "Dog";

    private Screen screen;

    public DrawDogCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.attachContent(CONTENT);
    }

    @Override
    public void undo() {
        screen.removeLastContent();
    }

}
