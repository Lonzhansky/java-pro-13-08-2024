package ua.hillel.lessons.lesson26.grasp.demos._5_high_cohesion.good;

// ДОБРЕ.
// Клас викликає необхідні методи з
// спеціалізованих класів.
public class CohesiveDemoGood {

    public static void main(String[] args) {

        int a = 12;
        int b = 25;
        char c = 'd';
        char d = 'e';

        ArithmeticHandler arithmeticHandler = new ArithmeticHandler();
        CharHandler charHandler = new CharHandler();

        arithmeticHandler.addNums(a, b);
        charHandler.findVowel(c);
        charHandler.findVowel(d);
    }
}
