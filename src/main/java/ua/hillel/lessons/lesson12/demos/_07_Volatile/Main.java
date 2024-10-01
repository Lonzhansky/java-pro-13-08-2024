package ua.hillel.lessons.lesson12.demos._07_Volatile;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadListener threadListener = new ThreadListener();
        ThreadMaker threadMaker = new ThreadMaker();
        threadListener.start();
        threadMaker.start();
    }
}
