package ojtJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h2>UpdateRecord Class</h2>
 * <p>
 * Process for Displaying UpdateRecord
 * </p>
 * 
 * @author khinthantsin
 */
public class UpdateRecord {
    /**
     * <h2>dbUrl</h2>
     * <p>
     * database url
     * </p>
     */
    static String dbUrl = "jdbc:mysql://localhost:3306/testdb";
    /**
     * <h2>username</h2>
     * <p>
     * username
     * </p>
     */
    static String username = "root";
    /**
     * <h2>password</h2>
     * <p>
     * password
     * </p>
     */
    static String password = "khinthantsin";
    /**
     * <h2>sql</h2>
     * <p>
     * sql query
     * </p>
     */
    static String sql = "update person set name='Michael' where id=2";

    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {

        // open a connection
        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
                Statement stmt = conn.createStatement();) {
            // execute a query
            stmt.executeUpdate(sql);
            System.out.println("Database updated successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
