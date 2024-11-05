package ua.hillel.lessons.lesson18;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Den", 30);
//        Person person2 = null;
//
//        Optional<Person> opt = Optional.ofNullable(person2);
//
//        opt.ifPresent(value -> value.getName());


//        System.out.println(person.getName());
//        System.out.println(person2.getName());


//        Optional<Person> personOptional = Optional.empty();
//        Optional<Person> personOptional = Optional.of(new Person("Den", 30));
//        Optional<Person> personOptional = Optional.of(null);
//        Optional<Person> personOptional = Optional.ofNullable(null);

//        System.out.println(personOptional);


//        if (personOptional.isPresent()) {
//            System.out.println(personOptional);
//        } else {
//            System.out.println("NO DATA");
//        }

//        personOptional.ifPresent(System.out::println);




        Optional<Person> personOptional1 = Optional.empty();
        Optional<Person> personOptional2 = Optional.ofNullable(new Person("Den", 30));


//        System.out.println(personOptional1.get());
//        System.out.println(personOptional2.get());


//        System.out.println(personOptional1.orElse(new Person("DEFAULT", 1)));
//        System.out.println(personOptional2.orElse(new Person("DEFAULT", 1)));

//        System.out.println(personOptional1.orElseGet(() -> new Person("DEFAULT", 1)));
//        System.out.println(personOptional2.orElseGet(() -> new Person("DEFAULT", 1)));

//        System.out.println(personOptional1.orElseThrow(() -> new IllegalArgumentException("NO DATA!!!")));
//        System.out.println(personOptional2.orElseThrow(() -> new IllegalArgumentException("NO DATA!!!")));

//        Optional<Person> personOptional = personOptional2
//                .filter(person -> person.getAge() % 2 == 0)
//                .filter(person -> person.getName().equals("Den"));
//        System.out.println(personOptional);


//        System.out.println(personOptional2
//                .filter(person -> person.getAge() % 2 == 0)
//                .filter(person -> person.getName().equals("Den"))
//                .orElse(new Person("DEFAULT", 1)));


//        System.out.println(personOptional2
//                .filter(person -> person.getAge() % 2 == 0)
//                .filter(person -> person.getName().equals("Den"))
//                .map(person -> person.getName())
//                .get());


        Optional<String> opt1 = Optional.of("Orange");
        Optional<String> opt2 = Optional.empty();

//        System.out.println(opt1.or(() -> Optional.of("Apple")));
//        System.out.println(opt2.or(() -> Optional.of("Apple")));


        // java 8
//        if (opt2.isPresent()) {
//            System.out.println(opt2.get());
//        } else {
//            System.out.println("NO DATA!");
//        }

        // java 9
//        personOptional1.ifPresentOrElse(
//                value -> System.out.println(value.getName()),
//                () -> System.out.println("NO DATA!")
//        );


//        personOptional1.ifPresentOrElse(
//                value -> System.out.println(value.getName()),
//                () -> {
//                    throw new IllegalArgumentException("NO DATA!!");
//                }
//        );

        List<Optional<String>> list = Arrays.asList(
                Optional.ofNullable("Orange"),
                Optional.ofNullable("Apple"),
                Optional.ofNullable(null),
                Optional.ofNullable("Kiwi"),
                Optional.ofNullable(null)
        );

        System.out.println(list);
        System.out.println();

        // java 8
//        List<String> listValues = list.stream()
//                .filter(value -> value.isPresent())     // Optional isPresent
//                .map(value -> value.get())              // Optional get
//                .toList();

//        List<String> listValues2 = list.stream()
//                .filter(Optional::isPresent)     // Optional isPresent
//                .map(Optional::get)              // Optional get
//                .toList();


//        System.out.println(listValues2);


        List<String> list1 = list.stream()
                .flatMap(Optional::stream)
                .toList();

        System.out.println(list1);


    }




}
