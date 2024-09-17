package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._01;

class Container {
    // Поле з wildcard, яке може містити об'єкт будь-якого типу
    private Box<?> box;

    public Container(Box<?> box) {
        this.box = box;
    }

    // Метод для отримання значення з box
    public Object getBoxValue() {
        return box.getValue();  // Оскільки тип невідомий, повертається Object
    }

//    // Ми не можемо змінювати значення box, оскільки тип невідомий
//    public void setBoxValue(Object obj) {
//        return box.setValue(obj);
//    }
}