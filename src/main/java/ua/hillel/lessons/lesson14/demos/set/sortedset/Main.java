package ua.hillel.lessons.lesson14.demos.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        SortedSet<String> set = new TreeSet<>();

        set.add("apple");
        set.add("orange");
        set.add("banana");
//        set.add(null);   // -- null НЕ дозволено
        set.add("kiwi");
        set.add("banana");   // -- дублікат НЕ дозволено

        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());


        System.out.println(set.headSet("kiwi"));
        System.out.println(set.subSet("banana", "banana"));
        System.out.println(set.tailSet("kiwi"));
//        System.out.println(set.headSet(null));

    }
}
