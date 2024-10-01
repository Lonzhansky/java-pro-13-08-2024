package ua.hillel.lessons.lesson12.demos._06_Problems._04_Starvation;

public class MyThread01 implements Runnable {

    Main main;

    MyThread01(Main main) {
        this.main = main;
    }

    @Override
    public void run() {
        main.handleData();
        main.handleData();
        main.handleData();
    }
}
