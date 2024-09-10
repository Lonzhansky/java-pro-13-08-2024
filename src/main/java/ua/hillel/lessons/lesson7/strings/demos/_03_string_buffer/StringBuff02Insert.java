package ua.hillel.lessons.lesson7.strings.demos._03_string_buffer;

// insert() вставляє певний рядок
// у задану позицію
public class StringBuff02Insert {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Orange ");
        sb.insert(2,"App");
        System.out.println(sb);
    }
}
