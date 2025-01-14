package ua.hillel.lessons.lesson33.demos._01;

import java.net.InetAddress;
import java.net.UnknownHostException;

// Class InetAddress немає public-конструкторів.
// Створити об'єкт класу можна за допомогою статичних
// методів.
// Метод getLocalHost() повертає об'єкт Class InetAddress,
// містить IP-адресу та ім'я комп'ютера, на якому виконується
// програма.
// Метод getByName(String host) повертає об'єкт Class InetAddress,
// містить IP-адресу за ім'ям комп'ютера, використовуючи простір
// імен DNS.
// Метод getHostAddress() повертає IP-адресу в рядковому форматі.
public class InetLogic {

    public static void main(String[] args) {
        // Визначення IP-адреси у програмі можна
        // за допомогою об'єкта Class InetAddress.
        try {
            // Визначення IP-адреси локального компьютера.
//            InetAddress currentIP = InetAddress.getLocalHost();
//            System.out.println("Local device IP is " +
//                    currentIP.getHostAddress());
            // IP-адреса UkrNet
            InetAddress ukrNetIP =
                    InetAddress.getByName("www.ukr.net");
            System.out.println("UkrNet IP is " +
                    ukrNetIP.getHostAddress());
        } catch (UnknownHostException e) {
            // Якщо не вдається знайти IP
            System.err.println("Exception: " +
                    e.getMessage());
        }
    }
}
