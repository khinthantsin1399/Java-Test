package ojtJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h2>CreateTable Class</h2>
 * <p>
 * Process for Displaying CreateTable
 * </p>
 * 
 * @author khinthantsin
 */
public class CreateTable {
    /**
     * <h2>dbUrl</h2>
     * <p>
     * Database Url
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
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE TABLE employee " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
                    + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
            //execute a query
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
