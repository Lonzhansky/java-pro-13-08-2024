package ua.hillel.lessons.lesson13._01.demos._01_Synchronization._01;

public class Thread1 extends Thread {

    DataHandler dataHandler;

    public Thread1(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.printData(5);
    }
}
