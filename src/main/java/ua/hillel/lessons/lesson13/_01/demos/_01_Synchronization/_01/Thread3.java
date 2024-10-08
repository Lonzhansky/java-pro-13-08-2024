package ua.hillel.lessons.lesson13._01.demos._01_Synchronization._01;

public class Thread3 extends Thread {

    DataHandler dataHandler;

    public Thread3(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.printData(10);
    }
}
