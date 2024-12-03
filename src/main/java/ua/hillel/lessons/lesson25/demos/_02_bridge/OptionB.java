package ua.hillel.lessons.lesson25.demos._02_bridge;

public class OptionB implements Option {

    @Override
    public void onActivate() {
        System.out.println("Option B has activated.");
    }

    @Override
    public void apply() {
        System.out.println("Option B is applying...");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Option B has deactivated.");
    }
}