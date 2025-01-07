package ua.hillel.lessons.lesson32.log4j.demo_01;

import java.io.IOException;
import java.sql.*;

import org.apache.log4j.Logger;

public class UserDAO {

    private static final Logger LOGGER = Logger.getLogger(UserDAO.class.getName());

    public void addUser(User user) {

        String insertUserSQL = "IN123SERT INTO users(name, age, email) VALUES (?, ?, ?);";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());

            preparedStatement.executeUpdate();

            LOGGER.info("User added successfully.");
            System.out.println("User added successfully.");

        } catch (SQLException e) {
            System.out.println("Something went wrong");
//            System.out.println(e.getMessage());
            LOGGER.error("Error adding user: " + user.getName(), e);
        }

    }

    public void viewAllUsers() {
        String selectAllUsersSQL = "SELECT * FROM users;";

        try (Connection connection = DatabaseInitializer.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectAllUsersSQL);

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email")
                );
                LOGGER.debug("User found: " + user.getName());
                System.out.println(user);
            }

        } catch (SQLException e) {
//            System.out.println(e.getMessage());
            System.out.println("Something went wrong");
            LOGGER.error("Error retrieving users", e);

        }

    }

    public void viewUserById(int id) {
        String selectUserByID = "SELECT * FROM users WHERE id = ?;";

        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectUserByID)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("email")
                    );
                    LOGGER.debug("User found: " + user.getName());
                    System.out.println(user);
                } else {
                    LOGGER.warn("User with id: " + id + " not found ");
                    System.out.println("User with id " + id + " not found. ");
                }
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateUser(User user) {
        String updateUserSQL = "UPDATE users SET name = ?, age = ?, email = ? WHERE id = ?;";

        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateUserSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getId());

            int countRow = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + countRow);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteUser(int id) {
        String deleteUserSQL = "DELETE FROM users WHERE id = ?;";

        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteUserSQL)) {
            preparedStatement.setInt(1, id);

            int countRow = preparedStatement.executeUpdate();
            System.out.println("Rows deleted: " + countRow);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
