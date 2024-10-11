package ua.hillel.lessons.lesson14.demos.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("orange");
        queue.add("banana");
        queue.add(null);  // -- null дозволено
        queue.add("kiwi");
        queue.offer("banana"); // -- дублікат дозволено
        queue.offer("apple");
//        queue.clear();
        System.out.println(queue);
//
//        System.out.println(queue.element());
//
//        System.out.println(queue.peek());


//        queue.remove("banana");
        System.out.println(queue.poll());

        System.out.println(queue);
    }

}
