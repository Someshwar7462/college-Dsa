package WiproTraining.oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckJDBC {
    public static void main(String[] args) {
        // Change these details according to your DB
        String jdbcURL = "jdbc:mysql://localhost:3306/user"; // DB URL
        String username = "root";  // DB username
        String password = "Someshwar@7462"; // DB password

        Connection connection = null;

        try {
            // Load MySQL JDBC Driver (optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("✅ JDBC Connection Successful!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found. Add it to the project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Connection Failed! Check URL, username, or password.");
            e.printStackTrace();
        } finally {
            // Close connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("🔒 Connection Closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

