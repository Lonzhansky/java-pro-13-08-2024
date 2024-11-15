package ua.hillel.lessons.lesson21.reflections;

import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        Person person = new Person("Den", 30);

//        ReflectionUtil.showFullClassName(person);
//        ReflectionUtil.showSimpleClassName(person);
//        ReflectionUtil.showClassFields(person);
//        ReflectionUtil.showAllClassFields(person);
//        ReflectionUtil.showAllClassMethods(person);

//        System.out.println(person.getAge());
//        ReflectionUtil.setValuePrivateField(person, "age", 190);
//        System.out.println(person.getAge());

//        ReflectionUtil.showAllConstructors(person);
//        Person person2 = (Person) ReflectionUtil.createNewObject(person);
//
//        System.out.println(person2.getName());
//        System.out.println(person2.getAge());

        Person person3 = (Person) ReflectionUtil.createNewObjectPublic(person);

        System.out.println(person3.getName());
        System.out.println(person3.getAge());

    }
}
