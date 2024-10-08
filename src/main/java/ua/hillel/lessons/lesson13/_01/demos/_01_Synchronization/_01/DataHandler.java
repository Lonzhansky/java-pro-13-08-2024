package ua.hillel.lessons.lesson13._01.demos._01_Synchronization._01;

public class DataHandler {

//    // Не синхронизованний метод
//    void printData(int number) {
//        for (int i = 1; i <= 5; i++) {
//            int res = number * i;
//            System.out.println(Thread.currentThread().getName() + " " + res);
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Exception");
//            }
//        }
//    }

//    // Синхронизованний метод
//    synchronized void printData(int number) {
//        for (int i = 1; i <= 5; i++) {
//            int res = number * i;
//            System.out.println(Thread.currentThread().getName() + " " + res);
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Exception");
//            }
//        }
//    }


    void printData(int number) {
        // Синхронизованний блок
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                int res = number * i;
                System.out.println(Thread.currentThread().getName() + " " + res);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Exception");
                }
            }
        }
    }

}
