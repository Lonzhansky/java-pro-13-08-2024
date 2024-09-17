package ua.hillel.lessons.lesson9.demos._01_generics_intro;

public class Main01 {

    public static void main(String[] args) {

        // id - число
        ContainerB c1 = new ContainerB(2334, 5000);
        // id - рядок
//        ContainerB c1 = new ContainerB("2345", 5000);
        String c1Id = (String) c1.getId();
        System.out.println("Id is " + c1Id);

        // id - рядок
        ContainerB c2 = new ContainerB("abc5523", 5000);
        System.out.println("Id is " + c2.getId());
    }
}
