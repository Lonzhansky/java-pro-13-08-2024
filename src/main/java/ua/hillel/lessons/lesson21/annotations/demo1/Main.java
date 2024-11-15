package ua.hillel.lessons.lesson21.annotations.demo1;


//@SuppressWarnings("ALL")
@SuppressWarnings("deprecation")
public class Main {

//    @MyAnnotation
//    public Main() {
//    }
//
//    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//
//
//
//        int age;
//
////        new Date(2024, 11, 15);
////
////        someMethod();
//
//
//        @SuppressWarnings({"rawtypes", "unchecked"})
//        List<String> list = new ArrayList();
//
//        printAllValue(1, 2, 3, 4, 5);
//        printAllValue("Apple", "Orange", "Banana");


        System.out.println(Person.class.getAnnotation(PersonAnnotation.class));
        System.out.println(PersonChild.class.getAnnotation(PersonAnnotation.class));


    }

//    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public static void someMethod() {
        System.out.println("qweqweqweqwewqe");
    }

    @SafeVarargs
    public static <T> void printAllValue(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

}
