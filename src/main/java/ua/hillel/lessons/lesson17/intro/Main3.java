package ua.hillel.lessons.lesson17.intro;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {

        List<Person> data = PersonRepository.getData();

//        List<String> listName = data.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());      // mutable
////                .toList();                        // immutable
//
////        listName.add("asdasd");
//
//        System.out.println(listName);


//        Set<String> set = data.stream()
//                .map(Person::getName)
//                .collect(Collectors.toSet());
//
//        System.out.println(set);


//        TreeSet<String> treeSet = data.stream()
//                .map(Person::getName)
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        System.out.println(treeSet);

//        Map<String, Integer> map = data.stream()
//                .collect(Collectors.toMap(Person::getName, Person::getAge));
//
//        System.out.println(map);


//        String join = data.stream()
//                .map(Person::getName)
//                .collect(Collectors.joining(", ", "{", "]"));
//
//        System.out.println(join);


//        Map<String, List<Person>> group = data.stream()
//                .collect(Collectors.groupingBy(Person::getName));
//
//        group.forEach((key, value) -> {
//            System.out.println("Person name: " + key);
//            value.forEach(person -> System.out.println("name: " + person.getName() + ", age: " + person.getAge()));
//        });

//        Double avgAge = data.stream()
//                .collect(Collectors.averagingInt(Person::getAge));
//
//        System.out.println(avgAge);


//        Integer sumAge = data.stream()
//                .collect(Collectors.summingInt(Person::getAge));
////                .mapToInt(Person::getAge)
////                .sum();
//        System.out.println(sumAge);

        List<Student> students = data.stream()
                .collect(new PersonToStudentCollector());

        students.forEach(System.out::println);


    }
}
