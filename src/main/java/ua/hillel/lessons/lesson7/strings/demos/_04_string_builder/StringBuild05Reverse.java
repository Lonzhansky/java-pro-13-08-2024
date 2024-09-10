package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// reverse() змінює рядок на зворотнє
public class StringBuild05Reverse {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Orange");
        sb.reverse();
        System.out.println(sb);
    }
}
