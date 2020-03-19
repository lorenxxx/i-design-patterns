package com.us.improve.designpatterns.command;

/**
 * @ClassName DrawPigCommand
 * @Desciption TODO
 * @Author loren
 * @Date 2020/3/17 8:57 PM
 * @Version 1.0
 **/
public class DrawPigCommand implements Command {

    private static final String CONTENT = "Pig";

    private Screen screen;

    public DrawPigCommand(Screen screen) {
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
