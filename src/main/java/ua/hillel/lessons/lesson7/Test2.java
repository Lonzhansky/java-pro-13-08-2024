package ua.hillel.lessons.lesson7;

public class Test2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuilder str1 = new StringBuilder("Orange");

        for (int i = 0; i < 200_000; i++) {
            str1.append(i);
        }

        System.out.println(str1);

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
