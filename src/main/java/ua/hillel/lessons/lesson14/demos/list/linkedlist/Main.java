package ua.hillel.lessons.lesson14.demos.list.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("orange");
        list.add("banana");
        list.add(null);  // -- null дозволено
        list.add("kiwi");
        list.add("banana"); // -- дублікат дозволено
        list.add("apple");

        System.out.println(list);

//        list.addFirst("potato");
//        System.out.println();
//        System.out.println(list);

//        list.addLast("potato");
//        System.out.println();
//        System.out.println(list);

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        System.out.println(list);



    }
}
