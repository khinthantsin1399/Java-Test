package ojtJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * <h2>InsertDb Class</h2>
 * <p>
 * Process for Displaying InsertDb
 * </p>
 * @author khinthantsin
 */
public class InsertDb {
    /**
     * <h2>DB_URL</h2>
     * <p>
     * Database URL
     * </p>
     */
    static final String dbUrl = "jdbc:mysql://localhost/testdb";
    /**
     * <h2>USER</h2>
     * <p>
     * Username
     * </p>
     */
    static final String username = "root";
    /**
     * <h2>PASS</h2>
     * <p>
     * Password
     * </p>
     */
    static final String password = "khinthantsin";
    
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * @param args
     */
    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
                Statement stmt = conn.createStatement();) {
            // Execute a query
            System.out.println("Inserting records into the table...");

            String sql = "INSERT INTO person VALUES (2, 'Mahnaz', 25)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO person VALUES (3, 'Zaid', 30)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO person VALUES(4,'Mittal', 28)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
