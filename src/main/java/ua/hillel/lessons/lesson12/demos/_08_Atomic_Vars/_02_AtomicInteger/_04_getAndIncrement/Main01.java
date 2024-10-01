package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._04_getAndIncrement;

import java.util.concurrent.atomic.AtomicInteger;

// Метод getAndIncrement() збільшує задане значення
// на одиницю та повертає значення до оновлення,
// що має тип даних int.
public class Main01 {

    public static void main(String[] args) {
        int initVal = 3;
        String[] items = new String[] {"orange", "mango",
                "kiwi", "apple"};
        getOutput(handleVar(initVal));
        getOutput(handleArray(items));
    }

    public static String handleVar(int initVal) {
        AtomicInteger val = new AtomicInteger(initVal);
        int prevVal = val.getAndIncrement();
        return "Previous value is " + prevVal +
                "\nUpdated value is "  + val;
    }

    public static String handleArray(String[] items) {
        // AtomicInteger як лічильник
        AtomicInteger counter = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(String.format("%d) %s%n",
                    counter.getAndIncrement(), item));
        }
        return "DATA:\n" + sb;
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
