package ua.hillel.lessons.lesson22.app;

import ua.hillel.lessons.lesson22.app.model.User;
import ua.hillel.lessons.lesson22.app.model.UserRole;
import ua.hillel.lessons.lesson22.app.repository.LocalRepository;
import ua.hillel.lessons.lesson22.app.service.RegistrationService;
import ua.hillel.lessons.lesson22.app.validator.UserValidator;

public class Main {
    public static void main(String[] args) {

        LocalRepository repository = new LocalRepository();
        UserValidator validator = new UserValidator();
        RegistrationService registrationService = new RegistrationService(repository, validator);

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
