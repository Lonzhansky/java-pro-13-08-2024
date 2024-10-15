package ua.hillel.lessons.lesson15.sortedmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(5, "apple");
        map.put(2, "potato");
        map.put(1, "tomato");
        map.put(4, "kiwi");

        System.out.println(map);

        map.putFirst(4, "orange");
        System.out.println(map);

    }
}
