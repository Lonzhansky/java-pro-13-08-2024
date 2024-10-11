package ua.hillel.lessons.lesson14.demos.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("orange");
        set.add("banana");
        set.add(null);   // -- null дозволено
        set.add("kiwi");
        set.add("banana");   // -- дублікат НЕ дозволено


        System.out.println(set);


        ArrayList<String> list = new ArrayList<>();
        list.add("potato");
        list.add("tomato");
        list.add("banana");

        System.out.println("SET VALUES: " + set);
        System.out.println("LIST VALUES: " + list);

        set.addAll(list);

//        set.clear();

        System.out.println("SET VALUES: " + set);

//        System.out.println(set.containsAll(list));

//        System.out.println(set.isEmpty());

//        set.remove("banana");
//        set.removeAll(list);
//        System.out.println(set);

//        set.retainAll(list);
//
//        System.out.println(set);


//        for (String element : set) {
//            System.out.println(element);
//        }

//        set.forEach(item -> System.out.println(item));

    }
}
