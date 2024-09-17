package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._01;

public class Main {

    public static void main(String[] args) {
//        //Приклад з використанням ?
//        Box<Integer> integerBox = new Box<>(123);
//        Box<String> stringBox = new Box<>("Hello");
//
//        // Використовуємо метод з wildcard
//        printBox(integerBox);  // Box contains: 123
//        printBox(stringBox);   // Box contains: Hello



//        // Приклад з використанням ? extends
//        Box<Integer> integerBox = new Box<>(123);
//        Box<Double> doubleBox = new Box<>(45.67);
//        Box<String> stringBox = new Box<>("Hello");
//        Box<Object> objBox = new Box<>(new Object());
//
//        printBoxNumber(integerBox);  // Box contains a number: 123
//        printBoxNumber(doubleBox);   // Box contains a number: 45.67
////        printBoxNumber(stringBox);   // Помилка




//        //Приклад з використанням ? super
//        Box<Integer> integerBox = new Box<>(0);
//        Box<Long> longBox = new Box<>(0L);
//        Box<Number> numberBox = new Box<>(0);
//        Box<Object> objectBox = new Box<>(new Object());
//        Box<String> stringBox = new Box<>("Hello");
//
//        addToBox(integerBox, 1);  // Додає Integer у Box<Number>
//        addToBox(numberBox, 123);  // Додає Integer у Box<Number>
//        addToBox(objectBox, 456);  // Додає Integer у Box<Object>
////        addToBox(longBox, 456);  // Додає Integer у Box<Object>
////        addToBox(stringBox, 789);  // Помилка
//
//        // Виведення значень
//        System.out.println("IntegerBox box contains: " + integerBox.getValue());
//        System.out.println("Number box contains: " + numberBox.getValue());
//        System.out.println("Object box contains: " + objectBox.getValue());




//        //Приклад використання wildcard для поля класу
//        Box<Integer> intBox = new Box<>(123);
//        Box<String> strBox = new Box<>("Hello");
//
//        Container intContainer = new Container(intBox);
//        Container strContainer = new Container(strBox);
//
//        System.out.println("Integer box contains: " + intContainer.getBoxValue());
//        System.out.println("String box contains: " + strContainer.getBoxValue());



        // Приклад використання wildcard для локальної змінної
        Box<Integer> integerBox = new Box<>(100);
        Box<Double> doubleBox = new Box<>(99.99);

        // Локальна змінна з wildcard
        Box<?> unknownBox;

        // Присвоюємо їй коробку з Integer
        unknownBox = integerBox;
        System.out.println("Value in unknownBox: " + unknownBox.getValue());

        // Присвоюємо їй коробку з Double
        unknownBox = doubleBox;
        System.out.println("Value in unknownBox: " + unknownBox.getValue());

        // Неможливо додати нове значення, оскільки точний тип невідомий
//         unknownBox.setValue(123);  // Помилка компіляції
    }

    // Метод, що використовує wildcard
    public static void printBox(Box<?> box) {
        // Помилка
        // Оскільки тип T невідомий, ми не можемо змінювати значення
        // але можемо отримувати значення і виводити його
//        box.setValue(111);


        System.out.println("Box contains: " + box.getValue());
    }

    // Метод приймає Box з будь-яким типом, який є підкласом Number (Integer, Double і т.д.)
    public static void printBoxNumber(Box<? extends Number> box) {
        Number number = box.getValue();

        // Помилка
        // Оскільки тип ? extends Number може представляти будь-який підклас Number,
        // компілятор не дозволяє вам вставляти значення у контейнер.
        // Це тому, що він не знає, чи точно цей підтип буде саме Number.
        // Це обмеження виникає через принцип коваріантності узагальнень.
//        box.setValue(100);

        System.out.println("Box contains a number: " + number);
    }

    // Метод приймає Box, який може містити будь-який тип, що є супертипом Integer
    public static void addToBox(Box<? super Integer> box, Integer value) {
        // Ми можемо додавати Integer або його підкласи в коробку
        box.setValue(value);
        System.out.println("Added value: " + value);
    }

}