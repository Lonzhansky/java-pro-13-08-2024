package ua.hillel.lessons.lesson7.characters.demos;

// Формування рядка з набору кодів символів
public class Main03 {

    static int[] nums;

    public static void main(String[] args) {

        // Набір кодів символів
        nums = new int[]{79, 114, 97, 110, 103, 101};

        // Прохід по масиву кодів символів
        // із одночасним приведенням типу
        for (int num : nums) {
            char a = (char) num;
            System.out.print(a);
        }
    }
}
