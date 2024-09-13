package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._013;

// Кастомний виняток - як приклад реалізації будь-якого
// стандартного неперевіряємого винятку, тому успадковуємося
// від RuntimeException
public class AgeException extends RuntimeException {

    // Конструктор має String параметр (повідомлення про виняток)
    // та Throwable параметр (причина винятку),
    // та встановлює їх для суперкласу.
    // Причиною може бути будь-який підклас Throwable.
    public AgeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
