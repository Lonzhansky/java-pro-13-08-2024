package ua.hillel.lessons.lesson12.demos._06_Problems._02_Deadlock;

// При запуску програми, код працює протягом невизначеного
// часу (програма зависає), тому що потоки перебувають у стані
// взаємоблокування і не дозволяють коду виконуватися.

//Потік 1 захоплює блокування на об'єкті s1 і очікує звільнення блокування на об'єкті s2, щоб завершити виклик shared.test2() в методі test1.
//Потік 2 захоплює блокування на об'єкті s2 і очікує звільнення блокування на об'єкті s1, щоб завершити виклик shared.test2() в методі test1.

public class Main {

    public static void main(String[] args) {

        Shared s1 = new Shared();
        Shared s2 = new Shared();

        // Створення та запуск першого потоку
        MyThread01 t1 = new MyThread01(s1, s2);
        t1.start();

        // Створення та запуск другого потоку
        MyThread02 t2 = new MyThread02(s1, s2);
        t2.start();
    }
}
