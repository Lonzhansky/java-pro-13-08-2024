package ua.hillel.lessons.lesson25.demos._06_flyweight;

public class AlphaMedicine implements Medicine {

    @Override
    public void drink() {
        System.out.println("Get Alpha Medicine " +
                System.identityHashCode(this));
    }
}
