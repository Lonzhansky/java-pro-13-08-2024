package ua.hillel.lessons.lesson25.demos._02_bridge;

public class DeviceB implements Device {

    private final Option option;

    public DeviceB(Option option) {
        this.option = option;
    }

    @Override
    public void start() {
        System.out.println("Device B has started.");
        option.onActivate();
    }

    @Override
    public void operate() {
        System.out.println("Device B is operating...");
        option.apply();
    }

    @Override
    public void stop() {
        System.out.println("Device B has stopped.");
        option.onDeactivate();
    }
}
