package ua.hillel.lessons.lesson7.strings.demos._01_strings;

public class String06Case {

    static String str1;
    static String str2;

    public static void main(String[] args) {

        // toLowerCase() повертає рядок у нижньому регістрі
        str1 = "ORANGE is good";
        str2 = str1.toLowerCase();
        System.out.println("1) " + str2);

        // toUpperCase() повертає рядок у верхньому регістрі
        str1 = "orange IS GOOD";
        str2 = str1.toUpperCase();
        System.out.println("2) " + str2);

        // Робимо першу літеру рядка великою
        str1 = "orange is good";
        str2 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        System.out.println("3) " + str2);

        // Робимо першу літеру рядка великою, інші маленькими
        str1 = "orange IS Good";
        str2 = str1.substring(0, 1).toUpperCase() +
                str1.substring(1).toLowerCase();
        System.out.println("4) " + str2);
    }
}
