package ua.hillel.lessons.lesson14.demos.set.linkedhashset;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("apple");
        set.add("orange");
        set.add("banana");
        set.add(null);   // -- null дозволено
        set.add("kiwi");
        set.add("banana");   // -- дублікат НЕ дозволено

        System.out.println(set);

        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        set.removeFirst();
        set.removeLast();

        System.out.println(set);

        set.addFirst("potato");
        set.addLast("tomato");

        System.out.println(set);
    }
}
