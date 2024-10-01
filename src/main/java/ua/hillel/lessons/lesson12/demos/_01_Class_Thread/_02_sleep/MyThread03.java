package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

class MyThread03 extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("This is Lazy Method");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
    }
}
