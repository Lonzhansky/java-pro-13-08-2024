package ua.hillel.lessons.lesson15.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();

        Person person1 = new Person(1, "Den", 30);
        Person person2 = new Person(2, "Alex", 22);
        Person person3 = new Person(3, "Vlad", 33);
        Person person4 = new Person(4, "Oleg", 44);

        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        map.put(person3.getId(), person3);
        map.put(person4.getId(), person4);

        printMap(map);

        person1.setId(4);
        System.out.println();

        printMap(map);

        map.put(person1.getId(), person1);
        printMap(map);


//        HashMap<Person, Integer> map = new HashMap<>();
//
//        Person person1 = new Person(1, "Den", 30);
//        Person person2 = new Person(2, "Alex", 22);
//        Person person3 = new Person(3, "Vlad", 33);
//        Person person4 = new Person(4, "Oleg", 44);
//
//        map.put(person1, person1.getId());
//        map.put(person2, person2.getId());
//        map.put(person3, person3.getId());
//        map.put(person4, person4.getId());
//        printMap(map);
    }

    static void printMap(HashMap<Integer, Person> map) {
        System.out.println();
        for (Map.Entry<Integer, Person> integerPersonEntry : map.entrySet()) {
            System.out.println("ID: " + integerPersonEntry.getKey() + ", value: " + integerPersonEntry.getValue());
        }
    }

//    static void printMap(HashMap<Person, Integer> map) {
//        System.out.println();
//        for (Map.Entry<Person, Integer> integerPersonEntry : map.entrySet()) {
//            System.out.println("ID: " + integerPersonEntry.getKey() + ", value: " + integerPersonEntry.getValue());
//        }
//    }
}
