package ua.hillel.lessons.lesson15.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5, "apple");
        map.put(2, "potato");
        map.put(1, "tomato");
        map.put(4, "kiwi");
        map.put(5, null);
        map.put(6, null);

        System.out.println(map);

//        Integer firstKey = map.firstKey();
//        System.out.println(firstKey);
//
//        System.out.println(map.lastEntry());
//
//        System.out.println(map.headMap(3));
//        System.out.println(map.subMap(2, 5));
//        System.out.println(map.tailMap(2));

        System.out.println(map.ceilingEntry(1));
        System.out.println(map.higherEntry(4));
        System.out.println(map.lowerEntry(3));


    }
}
