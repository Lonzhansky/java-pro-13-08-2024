package ua.hillel.lessons.lesson8.demos._06_throw_keyword._03;

// Сутність вантажу, який обмежений певним значенням.
// Неперевіряємий виняток IllegalArgumentException
// викидається в методі через throw, а далі, в іншому
// місті програми, обробляється через try-catch.
public class Cargo {

    private static final int WEIGHT_LIMIT = 450;

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        // Умова обмеження за певним значенням
        if (weight > WEIGHT_LIMIT) {
            // Викидання винятку при спрацюванні умови
            throw new IllegalArgumentException("Weight " +
                    weight + " is unacceptable.");
        }
        this.weight = weight;
    }
}