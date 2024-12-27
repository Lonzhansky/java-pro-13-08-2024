package ua.hillel.lessons.lesson31;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public User save(User user) throws SQLException {
        if (user == null || !user.isValid()) {
            throw new IllegalArgumentException("Invalid user data");
        }

        String query = "INSERT INTO users (name, email) VALUES (?, ?) RETURNING id;";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user.setId(resultSet.getInt("id"));
            }
        }
        return user;
    }

    public Optional<User> findByEmail(String email) throws SQLException {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or black");
        }

        String query = "SELECT * FROM users WHERE email = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(
                        new User(resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email")));
            }
        }
        return Optional.empty();
    }


    public List<User> findAll() throws SQLException {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT * FROM users";
        List users = new ArrayList();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                users.add(new User(resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email")));
            }
        }
        return users;
    }

    public void deleteById(Long id) throws SQLException {
        if (id == null) {
            throw new DeleteUserException("123123123123ID cannot be null");
        }

        String query = "DELETE FROM users WHERE id = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }
    }

}
