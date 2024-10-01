package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._03;

class MyThreadMulti extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
