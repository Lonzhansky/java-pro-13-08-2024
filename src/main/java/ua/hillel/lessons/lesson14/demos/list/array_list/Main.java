package ua.hillel.lessons.lesson14.demos.list.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("orange");
        list.add("banana");
//        list.add(null);  // -- null дозволено
        list.add("kiwi");
        list.add("banana"); // -- дублікат дозволено
        list.add("apple");

        list.addFirst("potato");

//        System.out.println(list);

//
//        list.add(1, "kiwi2");
//        System.out.println();
//        System.out.println(list);
//
//
//        list.add(11, "kiwi3");

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("potato");
//        list2.add("tomato");
//
//
//        list.addAll(list2);
////        list.addAll(1, list2);
//        System.out.println(list);

//        list.clear();
//        System.out.println(list);

//        System.out.println(list.contains("potato2"));


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("orange");
        list3.add("banana");
//
//
        System.out.println("list 1: " + list);
        System.out.println("list 3: " + list3);
//
//        System.out.println(list.containsAll(list3));


//        System.out.println(list.get(0));

//        System.out.println("list 1: " + list);
//        System.out.println(list.indexOf("banana"));
//        System.out.println(list.lastIndexOf("banana"));

//        System.out.println(list.isEmpty());

//        list.remove("banana");
//        System.out.println("list 1: " + list);


//        list.removeAll(list3);
//        System.out.println("list 1: " + list);

//        list.retainAll(list3);
//        System.out.println(list);


//        list.set(0, "potato");
//        System.out.println(list);

//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());

//        System.out.println(list);
//        System.out.println();
//
//
//        List<String> strings = list.subList(0, 2);
//
//        System.out.println(strings);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String element : list) {
//            System.out.println(element);
//        }

//        list.forEach(item -> System.out.println("item: " + item));

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        System.out.println(integerArrayList);


//        integerArrayList.remove(integerArrayList.indexOf(1));
        integerArrayList.remove(1);
        System.out.println(integerArrayList);


    }
}
