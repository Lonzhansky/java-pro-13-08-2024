package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._03;

// Кастомний виняток - як приклад реалізації
// стандартних перевіряємих винятків для роботи з файловим API,
// тому успадковуємося від Exception
public class FileWorkException extends Exception {

    // Конструктор має String параметр (повідомлення про виняток)
    // та Throwable параметр (причина винятку),
    // та встановлює їх для суперкласу.
    // Для цього прикладу, причиною може бути будь-який
    // підклас Throwable, який має викидати виняток щодо
    // роботи з файловим API.
    public FileWorkException(String message, Throwable cause) {
        super(message, cause);
    }
}
