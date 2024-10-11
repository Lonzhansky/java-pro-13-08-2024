package ua.hillel.lessons.lesson14.demos.set.treeset;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("apple");
        set.add("orange");
        set.add("banana");
//        set.add(null);   // -- null НЕ дозволено
        set.add("kiwi");
        set.add("banana");   // -- дублікат НЕ дозволено

        System.out.println(set);


        ArrayList<String> list = new ArrayList<>();
        list.add("tomato");
        list.add("potato");
        list.add("banana");

        System.out.println("SET VALUES: " + set);
        System.out.println("LIST VALUES: " + list);

        set.addAll(list);

        System.out.println(set);


        set.remove("banana");

        set.clear();
        System.out.println(set.size());
        System.out.println(set);



    }

}
