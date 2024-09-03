package ua.hillel.lessons.lesson6.demo;

public class Demo {

    // Щорічний бонус у вигляді фіксованої
    // кількості грошових одиниць
    private static final int BONUS = 300;

    public static void main(String[] args) {

        // Створення об'єкта Employee з певними вхідними даними
        Employee emp = new Employee("Tom", "seller", 2000);
        // Кількість відпрацьваних років
        int workedYears = 4;

        Demo demo = new Demo();
        demo.handleSalary(emp, workedYears);
        demo.changePosition(emp, "manager");
        // Виведення інформації після обробки даних
        System.out.println("Employee: " + emp.getName() +
                ", position is " + emp.getPosition() +
                ", salary is EUR " + emp.getSalary());
    }

    // Обробка даних щодо заробітної платні
    public void handleSalary(Employee employee, int wrkYrs) {
        int totalBonus = wrkYrs * BONUS;
        int newSalary = employee.getSalary() + totalBonus;
        employee.setSalary(newSalary);
    }

    // Обробка даних щодо посади
    public void changePosition(Employee employee, String pos) {
        employee.setPosition(pos);
    }
}
