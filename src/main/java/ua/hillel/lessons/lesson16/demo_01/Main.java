package ua.hillel.lessons.lesson16.demo_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();

        Student student1 = new Student("Den", 33);
        Student student2 = new Student("Oleg", 22);
        Student student3 = new Student("Alex", 11);
        Student student4 = new Student("Alise", 44);

        map.put(student1, student1.getName());
        map.put(student2, student2.getName());
        map.put(student3, student3.getName());
        map.put(student4, student4.getName());

//        System.out.println(map);

        for (Map.Entry<Student, String> studentStringEntry : map.entrySet()) {
            System.out.println("Key: " + studentStringEntry.getKey() + ", value: " + studentStringEntry.getValue());
        }

        System.out.println();
        System.out.println(map.get(student4));


        Comparator<Student> comparator = (studetn1, studetn2) -> studetn2.age - studetn1.age;

    }

}
