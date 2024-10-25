package ua.hillel.lessons.lesson17.intro;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(null);
        list.add(8);
        list.add(9);
        list.add(0);
//
        System.out.println("BEFORE: " + list);
//        list.stream()
////                .filter(num -> num % 2 == 0 && num >= 6 && num < 8)
//                .filter(num -> num % 2 == 0)
//                .filter(num -> num >= 6)
//                .filter(num -> num < 8)
//                .forEach(System.out::println);


//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "apple");
//        map.put(2, "banana");
//        map.put(3, "potato");
//        map.put(4, "tomato");
//
//        Map<Integer, String> bananaMap = map.entrySet().stream()
//                .filter(entry -> entry.getValue().equals("banana"))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        System.out.println(bananaMap);


//        list.stream()
//                .map(num -> num * num)
//                .forEach(System.out::println);


//        List<String> stringList = Arrays.asList("apple", "orange");
//        stringList.stream()
//                .map(String::length)
//                .forEach(System.out::println);

//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(1);
//        list3.add(2);
//        list3.add(3);
//
//        List<Integer> list4 = new ArrayList<>();
//        list4.add(11);
//        list4.add(22);
//        list4.add(33);
//
//        List<List<Integer>> list5 = Arrays.asList(list2, list3, list4);
//
//        System.out.println(list5);
//
//        List<Integer> allLists = list5.stream()
//                .flatMap(Collection::stream)
//                .toList();
//
//        System.out.println(allLists);

//        System.out.println(list.stream()
//                .anyMatch(num -> num > 8));

//        System.out.println(list.stream()
//                .noneMatch(num -> num > 11));

//        System.out.println(list.stream()
//                .allMatch(num -> num > 2));


//        System.out.println(list.stream()
//                .findAny());
//
//        System.out.println(list.stream()
//                .findFirst().get());

//        list.stream().sorted().forEach(System.out::println);

//        list.stream().distinct().forEach(System.out::println);


//        list.stream()
//                .filter(Objects::nonNull)
//                .forEach(System.out::println);


//        Optional<Integer> reduce = list.stream()
//                .filter(Objects::nonNull)
//                .reduce((a, b) -> Integer.sum(a, b));

//        System.out.println(reduce);

        System.out.println(list.stream()
                .filter(Objects::nonNull)
                .max((o1, o2) -> o1 - o2));


    }
}
