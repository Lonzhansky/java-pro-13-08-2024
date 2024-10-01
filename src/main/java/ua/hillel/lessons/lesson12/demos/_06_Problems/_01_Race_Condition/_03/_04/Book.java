package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._04;

public class Book {

    static int tickets = 1;

    // Статичний синхронізований метод
    // з логікою бронювання білетів
    static synchronized void bookTicket(int request, String name) {
        if (tickets >= request) {
            System.out.println(name + " booked " + request
                    + " ticket.");
            tickets = tickets - 1;
            System.out.println("Tickets left: " + tickets);
        } else {
            System.out.println("No tickets are available.");
        }
    }
}
