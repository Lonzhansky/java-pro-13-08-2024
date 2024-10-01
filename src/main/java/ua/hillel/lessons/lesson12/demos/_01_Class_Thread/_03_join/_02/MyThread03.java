package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._02;

class MyThread03 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Exception" + ie);
            }
        }
    }
}
