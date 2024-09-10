package ua.hillel.lessons.lesson7.strings.demos._03_string_buffer;

// replace() замінює рядок за вказаними
// початковим та кінцевим індексом
public class StringBuff03Replace {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Orange");
        sb.replace(2,4,"App");
        System.out.println(sb);
    }
}
