package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// insert() вставляє певний рядок
// у задану позицію
public class StringBuild02Insert {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Orange ");
        sb.insert(2,"App");
        System.out.println(sb);
    }
}
