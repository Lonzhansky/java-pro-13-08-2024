package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._023;

// Кастомний виняток - як приклад реалізації будь-якого
// стандартного неперевіряємого винятку, тому успадковуємося
// від RuntimeException
public class QuotaException extends RuntimeException {

    // Конструктор має String параметр (повідомлення про виняток)
    // та Throwable параметр (причина винятку),
    // та встановлює їх для суперкласу.
    // Причиною може бути будь-який підклас Throwable.
    public QuotaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
