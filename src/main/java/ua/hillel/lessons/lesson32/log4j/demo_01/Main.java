package ua.hillel.lessons.lesson32.log4j.demo_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DatabaseInitializer.initializeDatabase();

        UserDAO userDAO = new UserDAO();
        OrderDAO orderDAO = new OrderDAO();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nDatabase Menu");
            System.out.println("1. Add user");
            System.out.println("2. View All Users");
            System.out.println("3. View User by ID");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Add Order");
            System.out.println("7. View All Order");
            System.out.println("8. Delete Order");
            System.out.println("0. Exit");
            System.out.println("Please choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();

                    userDAO.addUser(new User(0, name, age, email));
                    break;
                case 2:
                    userDAO.viewAllUsers();
                    break;
                case 3:
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    userDAO.viewUserById(id);
                    break;
                case 4:
                    System.out.println("Enter user ID to change: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();

                    userDAO.updateUser(new User(updateId, newName, newAge, newEmail));
                    break;
                case 5:
                    System.out.println("Enter user ID to delete:");
                    int deleteUserID = scanner.nextInt();
                    scanner.nextLine();
                    userDAO.deleteUser(deleteUserID);
                    break;
                case 6:
                    System.out.println("Enter user ID for the order: ");
                    int userIdForOrder = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.println("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter price: ");
                    double price = scanner.nextDouble();

                    orderDAO.addOrder(new Order(0, userIdForOrder, productName, quantity, price));
                    break;
                case 7:
                    orderDAO.viewAllOrder();
                    break;
                case 8:
                    System.out.println("Enter order ID to delete:");
                    int deleteOrderID = scanner.nextInt();
                    scanner.nextLine();
                    orderDAO.deleteOrder(deleteOrderID);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }

    }

}
