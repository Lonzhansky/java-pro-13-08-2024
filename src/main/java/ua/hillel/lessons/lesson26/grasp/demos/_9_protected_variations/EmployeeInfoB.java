package ua.hillel.lessons.lesson26.grasp.demos._9_protected_variations;

public class EmployeeInfoB implements EmployeeInfo {

    @Override
    public void getInfo(Employee employee) {
        System.out.println(
                "Name: " + employee.getName() + "\n" +
                "Position: " + employee.getPosition()
        );
    }
}