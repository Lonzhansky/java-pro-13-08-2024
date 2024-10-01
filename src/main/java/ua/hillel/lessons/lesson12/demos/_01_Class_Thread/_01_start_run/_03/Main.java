package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._03;

// Якщо є кілька потоків,
// те який потік отримає шанс виконання першим,
// вирішуватиме Планувальник потоків (Thread Scheduler).
// Планувальник потоків є частиною JVM.
// Поведінка планувальника потоків залежить від постачальника JDK,
// і тому ми не можемо очікувати гарантовано однакового результату
// кожного разу при виконані програми.
public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThreadMulti thread = new MyThreadMulti();
        thread.start();
        // При заміні метода start() на run()
        // вивод повинен змінитися
//        thread.run();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
