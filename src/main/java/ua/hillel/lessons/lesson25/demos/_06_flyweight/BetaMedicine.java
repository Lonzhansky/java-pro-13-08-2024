package ua.hillel.lessons.lesson25.demos._06_flyweight;

public class BetaMedicine implements Medicine {

    @Override
    public void drink() {
        System.out.println("Get Beta Medicine " +
                System.identityHashCode(this));
    }
}
