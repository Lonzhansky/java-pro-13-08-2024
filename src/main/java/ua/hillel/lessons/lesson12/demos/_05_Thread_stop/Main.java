package ua.hillel.lessons.lesson12.demos._05_Thread_stop;

// Приклад запуску потоку, який виконує
// екземпляр класу MyRunnable, та його повторної
// Зупинки після затримки.
//
// У цьому прикладі спочатку створюється екземпляр MyRunnable,
// потім він передається в потік та запускає потік.
// Потім потік, що виконує метод main() (основний потік),
// зупиняється на 10 секунд, а потім викликає метод
// doStop() екземпляра MyRunnable.
// Це призведе до зупинки потоку, що виконує метод MyRunnable,
// оскільки функція keepRunning() поверне false після
// виклику doStop().
public class Main {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        Метод stop() є застарілим і небезпечним,
//        оскільки він може спричинити непередбачувану поведінку програми,
//        порушення цілісності даних і виклик неконтрольованих винятків.
//        Замість нього слід використовувати безпечніші методи,
//        такі як флаги для завершення або метод interrupt().
//        thread.stop();

        myRunnable.doStop();
    }
}
