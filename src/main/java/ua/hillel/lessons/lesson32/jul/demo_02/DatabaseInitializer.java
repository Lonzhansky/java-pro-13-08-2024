package ua.hillel.lessons.lesson32.jul.demo_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseInitializer {

    private static final Logger LOGGER = Logger.getLogger(DatabaseInitializer.class.getName());

    public static void initializeDatabase() {

        try(Connection connection = DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
            Statement statement = connection.createStatement()) {

            Class.forName("org.postgresql.Driver");

            LOGGER.info("Database initialization started");

            String createUserTableSQL = "CREATE TABLE IF NOT EXISTS users(" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100)," +
                    "age INTEGER, " +
                    "email VARCHAR(150));";
            statement.execute(createUserTableSQL);
            LOGGER.info("Users table created or already exist");

            String createOrderTableSQL = "CREATE TABLE IF NOT EXISTS orders(" +
                    "id SERIAL PRIMARY KEY, " +
                    "user_id INTEGER, " +
                    "product_name VARCHAR(100)," +
                    "quantity INTEGER, " +
                    "price DECIMAL, " +
                    "CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE);";
            statement.execute(createOrderTableSQL);
            LOGGER.info("Orders table created or already exist");

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
            LOGGER.info("User_Order view created or already exist");

            System.out.println("Database initialized.");

        } catch (SQLException e) {
//            System.out.println(e.getMessage());
            System.out.println("Something went wrong");
//            LOGGER.severe("Database initialization failed");
            LOGGER.log(Level.SEVERE, "Database initialization failed " + e.getMessage());
        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
            System.out.println("Something went wrong");
            LOGGER.log(Level.SEVERE, "PostgreSQL driver not found " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
    }
}
