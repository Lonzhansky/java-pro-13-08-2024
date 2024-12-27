package ua.hillel.lessons.lesson31;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserDAOTest {

    private static Connection connection;
    private static UserDAO userDAO;
    private User tempUser;

    @BeforeAll
    static void setUp() throws SQLException {
        System.out.println("BeforeAll");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson31", "postgres", "admin");
        userDAO = new UserDAO(connection);
        try (Statement statement = connection.createStatement()) {
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS users " +
                            "(id SERIAL PRIMARY KEY, " +
                            "name VARCHAR(100), " +
                            "email VARCHAR(150) UNIQUE);");
        }
    }

    @AfterAll
    static void cleaUp() throws SQLException {
        System.out.println("AfterAll");
        try (Statement statement = connection.createStatement()) {
            statement.execute("DROP TABLE users;");
        }
        connection.close();
    }

    @BeforeEach
    void beforeEachTest() throws SQLException {
        System.out.println("BeforeEach");
        tempUser = userDAO.save(new User("Temp User", "temp@gmail.com"));
    }

    @AfterEach
    void afterEachTest() throws SQLException {
        System.out.println("AfterEach");
        userDAO.deleteById(tempUser.getId());
    }

    @Test
    @Order(1)
    public void testCreateUser() throws SQLException {
        System.out.println("testCreateUser");
        User user = new User("John Doe", "john@gmail.com");
        User savedUser = userDAO.save(user);
        assertNotNull(savedUser.getId());
    }

    @Test
    @Order(2)
    public void testInvalidUserCreation() {
        System.out.println("testInvalidUserCreation");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userDAO.save(new User(null, "invalid@gmail.com"));
        });
        assertEquals("Invalid user data", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            userDAO.save(new User("Invalid User", null));
        });
        assertEquals("Invalid user data", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            userDAO.save(null);
        });
        assertEquals("Invalid user data", exception.getMessage());
    }

    @Test
    @Order(3)
    void testFindUserByEmail() throws SQLException {
        System.out.println("testFindUserByEmail");
        Optional<User> user = userDAO.findByEmail(tempUser.getEmail());
        assertTrue(user.isPresent());
        assertEquals(tempUser.getName(), user.get().getName());
    }

    @Test
    @Order(4)
    void testFindUserByInvalidEmail() {
        System.out.println("testFindUserByInvalidEmail");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            userDAO.findByEmail(null);
        });
        assertEquals("Email cannot be null or black", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            userDAO.findByEmail(" ");
        });
        assertEquals("Email cannot be null or black", exception.getMessage());
    }

    @Test
    @Order(5)
    void testListAllUsers() throws SQLException {
        System.out.println("testListAllUsers");
        List<User> allUsers = userDAO.findAll();
        assertFalse(allUsers.isEmpty());
    }

    @Test
    @Order(6)
    void testDeleteUser() throws SQLException {
        System.out.println("testDeleteUser");
        Optional<User> user = userDAO.findByEmail(tempUser.getEmail());
        user.ifPresent(value -> {
            try {
                userDAO.deleteById(value.getId());
            } catch (SQLException e) {
                System.out.println("Delete failed");
            }
        });

        Optional<User> deletedUser = userDAO.findByEmail(tempUser.getEmail());
        assertFalse(deletedUser.isPresent());
    }

    @Test
    @Order(7)
    @Disabled("it will be fix soon")
    void testDeleteWithIvalidId() {
        System.out.println("testDeleteWithIvalidId");
        DeleteUserException exception = assertThrows(DeleteUserException.class, () -> {
            userDAO.deleteById(null);
        });
        assertEquals("ID cannot be null", exception.getMessage());
    }

    @Test
    void testTimeout() {
        System.out.println("testTimeout");
        assertTimeout(Duration.ofSeconds(2), () -> {
            List<User> all = userDAO.findAll();
            assertNotNull(all);
            assertFalse(all.isEmpty());
        });
    }

    @DisplayName("Parameterized Test Example")
    @ParameterizedTest
    @ValueSource(strings = {"alex@gmail.com", "alice@gmail.com", "bob@gmail.com"})
    void testParametrized(String email) throws SQLException {
        System.out.println("testParametrized");
        System.out.println("email: " + email);
        User user = new User(email.split("@")[0], email);
        userDAO.save(user);
        Optional<User> fetchUser = userDAO.findByEmail(email);
        assertTrue(fetchUser.isPresent());
        assertEquals(email, fetchUser.get().getEmail());
    }


}
