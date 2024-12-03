package ua.hillel.lessons.lesson25.demos._04_decorator;

public class App {

    static int magnPwr;

    public static void main(String[] args) {

        // Базовий девайс
        System.out.println("\nBasic device.");
        DeviceBasic deviceBasic = new DeviceBasic();
        deviceBasic.start();
        deviceBasic.stop();
        magnPwr = deviceBasic.getMagnificationPower();
        System.out.println("Basic device magnification power: " +
                magnPwr);

        // Змінюємо властивості девайсу, додаючи декоратор
        System.out.println("\nEquipped device.");
        DeviceEquipped deviceEquipped =
                new DeviceEquipped(deviceBasic);
        deviceEquipped.start();
        deviceEquipped.stop();
        magnPwr = deviceEquipped.getMagnificationPower();
        System.out.println("Equipped device magnification power: " +
                magnPwr);
    }
}
