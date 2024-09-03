package ua.hillel.lessons.lesson6;

public class DemoAbstractImpl extends DemoAbstract {

    @Override
    public void abstractMethod1() {
        System.out.println("abstractMethod1");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("abstractMethod2");


        if (true) {
            class DemoLocalClass {
                int age;
                String name;

                public void printName() {
                    System.out.println(name);
                }
            }

            DemoLocalClass demoLocalClass = new DemoLocalClass();
            demoLocalClass.name = "Denys";
            demoLocalClass.printName();

        } else {

        }
    }

}
