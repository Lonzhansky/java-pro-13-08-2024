package ua.hillel.lessons.lesson25.demos._06_flyweight;

public class EpsilonMedicine implements Medicine {

    @Override
    public void drink() {
        System.out.println("Get Epsilon Medicine " +
                System.identityHashCode(this));
    }
}
