package ua.hillel.lessons.lesson29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void initializeDatabase() {

        try(Connection connection = DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
            Statement statement = connection.createStatement()) {

            Class.forName("org.postgresql.Driver");


            String createUserTableSQL = "CREATE TABLE IF NOT EXISTS users(" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100)," +
                    "age INTEGER, " +
                    "email VARCHAR(150));";
            statement.execute(createUserTableSQL);


            String createOrderTableSQL = "CREATE TABLE IF NOT EXISTS orders(" +
                    "id SERIAL PRIMARY KEY, " +
                    "user_id INTEGER, " +
                    "product_name VARCHAR(100)," +
                    "quantity INTEGER, " +
                    "price DECIMAL, " +
                    "CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE);";
            statement.execute(createOrderTableSQL);


            String createUserOrderViewSQL = "CREATE OR REPLACE VIEW user_order_view AS " +
                    "SELECT o.id AS order_id, " +
                    "o.product_name, " +
                    "o.quantity, " +
                    "o.price, " +
                    "u.id AS user_id, " +
                    "u.name AS user_name, " +
                    "u.age AS user_age, " +
                    "u.email AS user_email " +
                    "FROM orders o " +
                    "INNER JOIN users u ON o.user_id = u.id;";

            statement.execute(createUserOrderViewSQL);

            System.out.println("Database initialized.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
    }
}
