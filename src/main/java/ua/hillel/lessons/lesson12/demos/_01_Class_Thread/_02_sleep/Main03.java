package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

public class Main03 {

    public static void main(String[] arg) throws InterruptedException {
        MyThread03 t = new MyThread03();
        t.start();
        System.out.println("Main Thread");
    }
}
