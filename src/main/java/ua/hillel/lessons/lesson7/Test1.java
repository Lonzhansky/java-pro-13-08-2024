package ua.hillel.lessons.lesson7;

public class Test1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String str1 = "Orange";

        for (int i = 0; i < 200_000; i++) {
            str1 += i;
        }

        System.out.println(str1);

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
