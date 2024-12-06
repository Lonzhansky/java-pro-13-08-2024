package ua.hillel.lessons.lesson26.solid.demos._5_dependency_inversion.good;

public class App {

    public static void main(String[] args) {

        String text = "Some super text ...";
        // Конкретна реалізація LaserPrinter
        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print(text);

        // Посилання на абстрактну реалізацію Printer
        Printer printer = new LaserPrinter();
        // Конкретна реалізація OfficePrinter, яка
        // не залежить від іншої конкретної реалізації - LaserPrinter,
        // а сполучається з нею через абстрактну реалізацію Printer.
        OfficePrinter officePrinter = new OfficePrinter(printer);
        officePrinter.printFile();
    }
}
