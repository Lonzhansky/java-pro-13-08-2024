package ua.hillel.lessons.lesson25.demos._06_flyweight;

public class DeltaMedicine implements Medicine {

    @Override
    public void drink() {
        System.out.println("Get Delta Medicine " +
                System.identityHashCode(this));
    }
}
