package ua.hillel.lessons.lesson17.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class PersonToStudentCollector implements Collector<Person, List<Student>, List<Student>> {

    @Override
    public Supplier<List<Student>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Student>, Person> accumulator() {
        return (studentList, person) -> studentList.add(new Student(person.getName(), person.getAge()));
    }

    @Override
    public BinaryOperator<List<Student>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Student>, List<Student>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }

}