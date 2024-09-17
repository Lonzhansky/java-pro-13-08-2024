package ua.hillel.lessons.lesson9.demos._01_generics_intro;

public class Main02 {

    public static void main(String[] args) {

        ContainerC<String> c1 = new ContainerC<>("A-698", 5000);
        String c1Id = c1.getId(); // <- тип String
        int c1Quota = c1.getQuota();
        System.out.println("Id is " + c1Id + ", quota is " + c1Quota);

        ContainerC<Integer> c2 = new ContainerC<>(2345, 5000);
        Integer c2Id = c2.getId(); // <- тип Integer
        int c2Quota = c2.getQuota();
        System.out.println("Id is " + c2Id + ", quota is " + c2Quota);
    }
}
