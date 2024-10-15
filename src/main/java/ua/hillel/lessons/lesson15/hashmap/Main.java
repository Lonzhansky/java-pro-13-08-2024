package ua.hillel.lessons.lesson15.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(4, "apple");
        map.put(2, "potato");
        map.put(1, "tomato");
        map.put(3, "kiwi");

        System.out.println(map);


//        HashMap<String, Integer> map2 = new HashMap<>();
//
//        map2.put("apple", 4);
//        map2.put("potato", 2);
//        map2.put("tomato", 1);
//        map2.put("kiwi", 3);
//
//        System.out.println(map2);


//        map.put(null, "nullValue");
//        map.put(7, null);
//        map.putIfAbsent(7, "orange");
//        System.out.println();
//        System.out.println(map);

//        HashMap<Integer, String> map2 = new HashMap<>();
//
//        map2.put(4, "orange");
//        map2.put(5, "apple");
//        map2.put(6, "tomato");
//
//        System.out.println(map2);
//
//        map.putAll(map2);
//
//        System.out.println();
//        System.out.println(map);

//        map.clear();
//        System.out.println(map);

//        String value = map.get(1);
//        System.out.println(value);

//        String value = map.getOrDefault(11, "defaultValue");
//        System.out.println(value);

//        System.out.println(map.isEmpty());

//        System.out.println(map.containsKey(11));
//        System.out.println(map.containsValue("tomato"));

//        boolean replace = map.replace(1, "tomato", "orange");
//        System.out.println(replace);
//
//        System.out.println(map);

//        map.remove(1, "tomato2");


//        System.out.println(map);


//        map.forEach((id, value) -> System.out.println("id: " + id + ", value: " + value));

//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("id: " + entry.getKey() + ", value: " + entry.getValue());
//        }

    }
}
