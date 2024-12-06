package ua.hillel.lessons.lesson26.solid.demos._5_dependency_inversion.bad;

public class OfficePrinter {

    private final LaserPrinter printer;

    public OfficePrinter(LaserPrinter printer) {
        this.printer = printer;
    }

    public void printFile() {
        printer.print("File content ...");
    }
}
