package ua.hillel.lessons.lesson6;

import ua.hillel.lessons.lesson5.interfaces.Interface1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        DemoAbstractImpl demoAbstract = new DemoAbstractImpl();

//        demoAbstract.abstractMethod1();
//        demoAbstract.abstractMethod2();

//        class Anonimous extends DemoAbstract {
//
//            @Override
//            public void abstractMethod1() {
//                System.out.println("demo anon class 1");
//            }
//
//            @Override
//            public void abstractMethod2() {
//                System.out.println("demo anon class 2");
//            }
//        }
//        Anonimous anonimous = new Anonimous();
//        anonimous.abstractMethod1();


//        DemoAbstract obj = new DemoAbstract() {
//
//            @Override
//            public void abstractMethod1() {
//                System.out.println("demo anon class 1");
//            }
//
//            @Override
//            public void abstractMethod2() {
//                System.out.println("demo anon class 2");
//            }
//        };
//
//        obj.abstractMethod1();
//        obj.abstractMethod2();

//        DemoInterface obj = new DemoInterface() {
//            @Override
//            public void abstractMethod1() {
//                System.out.println("demo anon class 1");
//            }
//
//            @Override
//            public void abstractMethod2() {
//                System.out.println("demo anon class 2");
//            }
//        };
//
//        obj.abstractMethod1();
//        obj.abstractMethod2();


//        Person person = new Person();
//        person.name = "Denys";
//        person.age = 30;
//        person.printName();
//
//        person = new Person();
//
//
//        Person[] arrPeople = new Person[1000000000];
//
//
//        for (int i = 0; i < arrPeople.length; i++) {
//            arrPeople[i] = new Person();
//        }
//
//        demoRecursion();


        Object[] arr = new Object[200_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Object();
        }


        arr = new Object[10_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Object();
        }

        System.out.println(1);
    }

    static void demoRecursion() {
        demoRecursion();
    }


}
