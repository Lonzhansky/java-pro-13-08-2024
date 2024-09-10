package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// replace() замінює рядок за вказаними
// початковим та кінцевим індексом
public class StringBuild03Replace {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Orange");
        sb.replace(2,4,"App");
        System.out.println(sb);
    }
}
