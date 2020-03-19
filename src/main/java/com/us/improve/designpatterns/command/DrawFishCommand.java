package com.us.improve.designpatterns.command;

/**
 * @ClassName DrawFishCommand
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/17 9:02 PM
 * @Version 1.0
 **/
public class DrawFishCommand implements Command {

    private static final String CONTENT = "Fish";

    private Screen screen;

    public DrawFishCommand(Screen screen) {
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
