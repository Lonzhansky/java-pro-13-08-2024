package ua.hillel.lessons.lesson8.demos._07_throws_keyword._04;

// Клас, який має метод(и) валідації вхідних даних
public class AppValidator {

    private static final int WEIGHT_LIMIT = 450;

    // Метод, який виконує валідацію значення та оголошує виняток.
    // Валідація віку. Якщо вік менше певної кількості років,
    // генеруємо виняток IllegalArgumentException, інакше повертаємо
    // відповідне повідомлення.
    public String validateWeight(int weight) throws IllegalArgumentException {
        Cargo cargo = new Cargo();
        cargo.setWeight(weight);
        if (cargo.getWeight() > WEIGHT_LIMIT) {
            // Викидання винятку при спрацюванні умови
            throw new IllegalArgumentException("Weight " +
                    weight + " is unacceptable.");
        } else {
            // Повернення повідомлення при відсутності винятку
            return "Weight " + cargo.getWeight() + " is OK.";
        }
    }
}
