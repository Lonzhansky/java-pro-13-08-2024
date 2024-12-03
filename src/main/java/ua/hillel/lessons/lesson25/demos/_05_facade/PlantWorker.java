package ua.hillel.lessons.lesson25.demos._05_facade;

import java.util.Arrays;

public abstract class PlantWorker {

    public void wakeUp() {
        System.out.println(name() + " wakes up.");
    }

    public void goToPlant() {
        System.out.println(name() + " goes to the plant.");
    }

    public abstract void work();

    public void goHome() {
        System.out.println(name() + " goes home.");
    }

    public void goToSleep() {
        System.out.println(name() + " goes to sleep.");
    }

    private void action(Action action) {
        switch (action) {
            case WAKE_UP -> wakeUp();
            case GO_TO_PLANT -> goToPlant();
            case WORK -> work();
            case GO_HOME -> goHome();
            case GO_TO_SLEEP -> goToSleep();
            default -> System.out.println("Undefined action");
        }
    }

    // Виконуються дії
    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract String name();

}
