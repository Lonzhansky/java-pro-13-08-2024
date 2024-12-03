package ua.hillel.lessons.lesson25.demos._02_bridge;

public class DeviceA implements Device {

    private final Option option;

    public DeviceA(Option option) {
        this.option = option;
    }

    @Override
    public void start() {
        System.out.println("Device A has started.");
        option.onActivate();
    }

    @Override
    public void operate() {
        System.out.println("Device A is operating...");
        option.apply();
    }

    @Override
    public void stop() {
        System.out.println("Device A has stopped.");
        option.onDeactivate();
    }
}
