package ua.hillel.lessons.lesson25.demos._07_proxy;

// Проксі, який контролює доступ до BoatReal
public class BoatRealProxy implements IBoat {

    private static final int PERSONS_ALLOWED_NUM = 3;

    private int personsNum;

    private final IBoat iBoat;

    public BoatRealProxy(IBoat iBoat) {
        this.iBoat = iBoat;
    }

    @Override
    public void enter(Person person) {
        if (personsNum < PERSONS_ALLOWED_NUM) {
            iBoat.enter(person);
            personsNum++;
        } else {
            System.out.println(person + " is not allowed to enter!");
        }
    }
}
