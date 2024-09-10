package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// Зміна рядка через append()
public class StringBuild01Append {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Orange ");
        sb.append("is very tasty");
        System.out.println(sb);
    }
}
