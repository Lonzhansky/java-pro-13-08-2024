package ua.hillel.lessons.lesson7.strings.demos._03_string_buffer;

// Зміна рядка через append()
public class StringBuff01Append {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Orange ");
        sb.append("is very tasty");
        System.out.println(sb);
    }
}
