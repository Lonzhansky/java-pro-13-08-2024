package ua.hillel.lessons.lesson18;

import java.sql.Struct;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentUtil {

    public static void addStudent(Student student) {
        StudentRepository.studentList.add(student);
    }

    public static Student getNewStudent(String name, int age) {
        return new Student(name, age, UUID.randomUUID().toString());
    }

//    public static Student getStudentById(String id) {
//        return StudentRepository.studentList.stream()
//                .filter(student -> student.getId().equals(id))
//                .toList()
//                .getFirst();
//
//    }

    public static Optional<Student> getStudentById(String id) {
//        return StudentRepository.studentList.stream()
//                .filter(student -> student.getId().equals(id))
//                .toList()
//                .stream()
//                .findAny();

        return StudentRepository.studentList.stream()
                .filter(student -> student.getId().equals(id))
                .findAny();
    }

    public static List<Student> findAllStudent() {
        return StudentRepository.studentList;
    }

    public static Optional<List<Student>> findAllStudent2() {
        return Optional.ofNullable(StudentRepository.studentList);
    }

}
