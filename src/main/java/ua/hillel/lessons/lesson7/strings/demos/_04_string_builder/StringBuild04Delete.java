package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// delete() видаляє рядок за вказаними
// початковим та кінцевим індексом
public class StringBuild04Delete {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Orange");
        sb.delete(2,4);
        System.out.println(sb);
    }
}
