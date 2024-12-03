package ua.hillel.lessons.lesson25.demos._06_flyweight;

public class GammaMedicine implements Medicine {

    @Override
    public void drink() {
        System.out.println("Get Gamma Medicine " +
                System.identityHashCode(this));
    }
}
