package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._01;

// Якщо не встановлюємо пріоритет потоку,
// то за замовчуванням він встановлюється JVM.
// Тут отримуємо пріоритет потоку за замовчуванням
// за допомогою методу getPriority().
public class Main {

    public static void main(String[] args) {
        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();
        MyThread03 thread03 = new MyThread03();

        thread01.start();
        thread02.start();
        thread03.start();

        System.out.println("Thread 1 priority is " +
                thread01.getPriority());
        System.out.println("Thread 2 priority is " +
                thread02.getPriority());
        System.out.println("Thread 3 priority is " +
                thread03.getPriority());
    }
}
