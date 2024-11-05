package ua.hillel.lessons.lesson18;

import java.util.Optional;
import java.util.UUID;

public class MainStudent {
    public static void main(String[] args) {


        Student student1 = StudentUtil.getNewStudent("Den", 30);
        System.out.println(student1);

        StudentUtil.addStudent(student1);
        System.out.println(StudentRepository.studentList);

//        String id = UUID.randomUUID().toString();
        String id = student1.getId();
        System.out.println("find id: " + id);
        System.out.println();

        Optional<Student> studentById = StudentUtil.getStudentById(id);

        studentById.ifPresent(System.out::println);


    }
}
