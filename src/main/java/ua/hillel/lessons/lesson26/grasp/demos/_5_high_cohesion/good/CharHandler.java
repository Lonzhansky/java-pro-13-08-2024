package ua.hillel.lessons.lesson26.grasp.demos._5_high_cohesion.good;

// Клас фокусується на одній роботі
public class CharHandler {
    // Метод перевірки голосних та приголосних
    public void findVowel(char ch) {
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' ->
                    System.out.println(ch + " - vowel.");
            case 'b', 'c', 'd', 'f', 'g' ->
                    System.out.println(ch + " - consonant.");
            default -> System.out.println(ch + " - not vowel.");
        }
    }
}
