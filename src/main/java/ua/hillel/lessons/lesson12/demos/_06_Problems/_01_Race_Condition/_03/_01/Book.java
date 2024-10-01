package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._01;

public class Book {

    int tickets = 1;

    // Метод з логікою бронювання білетів
    void bookTicket(int request, String name) {
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
