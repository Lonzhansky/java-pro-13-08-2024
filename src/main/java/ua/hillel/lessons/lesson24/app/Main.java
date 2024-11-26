package ua.hillel.lessons.lesson24.app;

import ua.hillel.lessons.lesson24.app.model.User;
import ua.hillel.lessons.lesson24.app.model.UserRole;
import ua.hillel.lessons.lesson24.app.observer.AuditService;
import ua.hillel.lessons.lesson24.app.observer.EmailService;
import ua.hillel.lessons.lesson24.app.observer.TelegramService;
import ua.hillel.lessons.lesson24.app.repository.Repository;
import ua.hillel.lessons.lesson24.app.repository.factory.RepositoryFactory;
import ua.hillel.lessons.lesson24.app.service.RegistrationService;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a repository type: -local or -db");
            return;
        }

        Repository<User> repository = (Repository<User>) RepositoryFactory.getRepository(args[0]);
        RegistrationService registrationService = new RegistrationService(repository);

        EmailService emailService = new EmailService();
        registrationService.addObserver(emailService);
        registrationService.addObserver(new AuditService());
        registrationService.addObserver(new TelegramService());

        User user1 = new User("1", "Den", "qwe@gmail.com", UserRole.ADMIN);
        User user2 = new User("2", "Alex", "asd@gmail.com", UserRole.REGULAR);

        System.out.println("Registering users...");
        registrationService.registerUser(user1);
        registrationService.registerUser(user2);

        System.out.println("Find all users");
        registrationService.getAllUsers().forEach(System.out::println);

        System.out.println("Find user by id");
        registrationService.getUserById("1").ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found!")
        );

        registrationService.removeObserver(emailService);

        System.out.println("Update user2 to ADMIN");
        User newUser2 = new User("2", "Alex", "asd@gmail.com", UserRole.ADMIN);

        try {
//            registrationService.updateUser(new User("3", "sfsd", "were@w", UserRole.ADMIN));
            registrationService.updateUser(newUser2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        if (registrationService.deleteUser("1")) {
            System.out.println("User with id 1 deleted");
        } else {
            System.out.println("Failed to delete user");
        }



        System.out.println("Find all users");
        registrationService.getAllUsers().forEach(System.out::println);

    }
}
