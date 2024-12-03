package ua.hillel.lessons.lesson25.demos._02_bridge;

public class App {

    public static void main(String[] args) {

        System.out.println("\nDevice A in action...");
        DeviceA deviceA = new DeviceA(new OptionA());
        deviceA.start();
        deviceA.operate();
        deviceA.stop();

        System.out.println("\nDevice B in action...");
        DeviceB deviceB = new DeviceB(new OptionA());
        deviceB.start();
        deviceB.operate();
        deviceB.stop();
    }
}
