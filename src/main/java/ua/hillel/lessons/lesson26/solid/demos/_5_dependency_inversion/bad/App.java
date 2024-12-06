package ua.hillel.lessons.lesson26.solid.demos._5_dependency_inversion.bad;

public class App {

    public static void main(String[] args) {

        // Конкретна реалізація LaserPrinter
        LaserPrinter laserPrinter = new LaserPrinter();
        // Конкретна реализація OfficePrinter,
        // яка залежить від іншої конкретної реалізації - LaserPrinter
        OfficePrinter officePrinter = new OfficePrinter(laserPrinter);
        officePrinter.printFile();
    }
}
