package ua.hillel.lessons.lesson26.grasp.demos._9_protected_variations;

public class App {

    public static void main(String[] args) {

        Employee employee = new Employee("Tom");
        EmployeeInfo employeeInfoA = new EmployeeInfoA();
        employeeInfoA.getInfo(employee);

        System.out.println("----------------");

        Employee employee1 = new Employee("Tom", "manager");
        EmployeeInfo employeeInfoB = new EmployeeInfoB();
        employeeInfoB.getInfo(employee1);

        System.out.println("----------------");

        Employee employee2 = new Employee("Tom", "manager", 1200.55);
        EmployeeInfo employeeInfoC = new EmployeeInfoC();
        employeeInfoC.getInfo(employee2);
    }
}
