package ua.hillel.lessons.lesson32.log4j.demo_01;

import java.sql.*;

public class OrderDAO {

    public void addOrder(Order order) {
        String insertUserSQL = "INSERT INTO orders(user_id, product_name, quantity, price) VALUES (?, ?, ?, ?);";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL)) {
            preparedStatement.setInt(1, order.getUserId());
            preparedStatement.setString(2, order.getProductName());
            preparedStatement.setInt(3, order.getQuantity());
            preparedStatement.setDouble(4, order.getPrice());

            preparedStatement.executeUpdate();

            System.out.println("Order added successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewAllOrder() {
        String selectAllUsersSQL = "SELECT * FROM user_order_view;";

        try (Connection connection = DatabaseInitializer.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectAllUsersSQL);

            while (resultSet.next()) {
                System.out.println("Order ID: " + resultSet.getInt("order_id"));
                System.out.println("Product Name: " + resultSet.getString("product_name"));
                System.out.println("Quantity: " + resultSet.getInt("quantity"));
                System.out.println("Price: " + resultSet.getDouble("price"));
                System.out.println("User ID: " + resultSet.getInt("user_id"));
                System.out.println("User Name: " + resultSet.getString("user_name"));
                System.out.println("User Age: " + resultSet.getInt("user_age"));
                System.out.println("User Email: " + resultSet.getString("user_email"));
                System.out.println("---------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteOrder(int id) {
        String deleteUserSQL = "DELETE FROM orders WHERE id = ?;";

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
