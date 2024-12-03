package ua.hillel.lessons.lesson25.demos._02_bridge;

public class OptionA implements Option {

    @Override
    public void onActivate() {
        System.out.println("Option A has activated.");
    }

    @Override
    public void apply() {
        System.out.println("Option A is applying...");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Option A has deactivated.");
    }
}
