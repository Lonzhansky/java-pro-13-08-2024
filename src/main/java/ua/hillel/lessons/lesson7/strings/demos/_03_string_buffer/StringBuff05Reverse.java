package ua.hillel.lessons.lesson7.strings.demos._03_string_buffer;

// reverse() змінює рядок на зворотнє
public class StringBuff05Reverse {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Orange");
        sb.reverse();
        System.out.println(sb);
    }
}
