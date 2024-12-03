package ua.hillel.lessons.lesson25.main._06_observer;

public class EmailObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("EmailObserver received: " + message);
    }
}
