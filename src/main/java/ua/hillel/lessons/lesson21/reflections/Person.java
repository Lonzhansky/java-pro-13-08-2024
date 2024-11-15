package ua.hillel.lessons.lesson21.reflections;

public class Person {

    public String name;
    private int age;
    boolean defaulBoolean;
    protected boolean protectedBoolean;

    private Person() {
    }

    private Person(int age) {
        setAge(age);
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void test(int a, int b, boolean c, String d) {
//        this.age = age;
    }
}
