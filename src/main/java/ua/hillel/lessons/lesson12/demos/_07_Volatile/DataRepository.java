package ua.hillel.lessons.lesson12.demos._07_Volatile;

public class DataRepository {

    // Без volatile виведення має бути іншим
    // та програма може зависнути
//    public static int INT_VALUE = 0;
    public static volatile int INT_VALUE = 0;

}
