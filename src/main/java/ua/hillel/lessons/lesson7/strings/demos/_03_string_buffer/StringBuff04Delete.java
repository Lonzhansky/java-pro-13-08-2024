package ua.hillel.lessons.lesson7.strings.demos._03_string_buffer;

// delete() видаляє рядок за вказаними
// початковим та кінцевим індексом
public class StringBuff04Delete {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Orange");
        sb.delete(2, 4);
        System.out.println(sb);
    }
}
