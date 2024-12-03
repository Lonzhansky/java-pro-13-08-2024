package ua.hillel.lessons.lesson25.demos._04_decorator;

public class DeviceBasic implements Device {

    @Override
    public void start() {
        System.out.println("Device has started.");
    }

    @Override
    public int getMagnificationPower() {
        return 5;
    }

    @Override
    public void stop() {
        System.out.println("Device has stopped.");
    }
}
