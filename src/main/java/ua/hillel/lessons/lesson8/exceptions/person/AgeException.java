package ua.hillel.lessons.lesson8.exceptions.person;

// Кастомний виняток - як приклад реалізації стандартного
// неперевіряємого винятку ArithmeticException, тому успадковуємося
// від RuntimeException
public class AgeException extends RuntimeException {

    // Конструктор має String параметр та встановлює його
    // для суперкласу
    public AgeException(String msg) {
        super(msg);
    }
}
