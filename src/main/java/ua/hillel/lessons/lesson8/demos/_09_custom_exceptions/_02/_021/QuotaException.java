package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._021;

// Кастомний виняток - як приклад реалізації стандартного
// неперевіряємого винятку ArithmeticException, тому успадковуємося
// від RuntimeException
class QuotaException extends RuntimeException {

    // Конструктор має String параметр та встановлює його
    // для суперкласу
    public QuotaException(String msg) {
        super(msg);
    }
}
