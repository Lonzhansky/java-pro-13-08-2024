package ua.hillel.lessons.lesson26.grasp.demos._5_high_cohesion.bad;

public class CohesiveDemoBad {

    public static void main(String[] args) {

        int a = 12;
        int b = 25;
        char c = 'd';
        char d = 'e';

        CohesiveDemoBad demo = new CohesiveDemoBad();
        demo.addNums(a, b);
        demo.findVowel(c);
        demo.findVowel(d);
    }

    // Метод складання 2-х чисел
    public void addNums(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Метод перевірки голосних та приголосних
    public void findVowel(char a) {
        switch (a) {
            case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println(a + " - vowel.");
            default ->
                    System.out.println(a + " - not vowel.");
        }
    }
}
