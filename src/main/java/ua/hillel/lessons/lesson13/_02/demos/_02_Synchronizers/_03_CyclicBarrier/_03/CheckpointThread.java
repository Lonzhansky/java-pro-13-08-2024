package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._03;

public class CheckpointThread implements Runnable {
    @Override
    public void run() {
        // Це буде виконано, як тільки
        // усі потоки досягнуть бар'єру
        System.out.println(""" 
                                All autos have arrived to checkpoint.
                                Take a rest.
                                """);
    }
}
