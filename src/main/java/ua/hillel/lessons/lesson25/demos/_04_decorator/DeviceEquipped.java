package ua.hillel.lessons.lesson25.demos._04_decorator;

public class DeviceEquipped implements Device {

    private final Device equipped;

    public DeviceEquipped(Device equipped) {
        this.equipped = equipped;
    }

    @Override
    public void start() {
        equipped.start();
        System.out.println("Device has started using magnifier.");
    }

    @Override
    public int getMagnificationPower() {
        return equipped.getMagnificationPower() * 3;
    }

    @Override
    public void stop() {
        equipped.stop();
    }
}
