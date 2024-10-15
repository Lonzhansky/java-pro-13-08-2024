package ua.hillel.lessons.lesson14.demos.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.add("orange");
        deque.add("banana");
        deque.add(null);  // -- null дозволено
        deque.add("kiwi");
        deque.offer("banana"); // -- дублікат дозволено
        deque.offer("apple");
//        deque.clear();
        System.out.println(deque);

        deque.offerFirst("potato");
        System.out.println();
        System.out.println(deque);

        deque.removeLast();
        System.out.println();
        System.out.println(deque);

        String value = deque.pollFirst();
        System.out.println(value);
        System.out.println(deque);

        String first = deque.peekFirst();
        System.out.println(first);
    }
}
