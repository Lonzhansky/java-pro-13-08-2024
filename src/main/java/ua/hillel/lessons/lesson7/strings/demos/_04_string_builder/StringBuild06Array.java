package ua.hillel.lessons.lesson7.strings.demos._04_string_builder;

// Формування переліку даних
public class StringBuild06Array {

    public static void main(String[] args) {
        getOutput(getData(provideData()));
    }

    private static String[] provideData() {
        return new String[]{"orange", "plum", "lemon", "cherry"};
    }

    private static String getData(String[] items) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String name : items) {
            count++;
            // Застосування append()
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
