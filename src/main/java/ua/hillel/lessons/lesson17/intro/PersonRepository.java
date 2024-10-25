package ua.hillel.lessons.lesson17.intro;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    public static List<Person> getData() {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Max", 11));
        list.add(new Person("Den", 30));
        list.add(new Person("Den", 22));
        list.add(new Person("Den", 11));
        list.add(new Person("Alex", 22));
        list.add(new Person("Oleg", 33));
        list.add(new Person("Max", 45));

        return list;
    }

}
