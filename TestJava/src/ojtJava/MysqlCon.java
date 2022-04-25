package ojtJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * <h2>MysqlCon Class</h2>
 * <p>
 * Process for Displaying MysqlCon
 * </p>
 * @author khinthantsin
 */
class MysqlCon {
    /**
     * <h2>main</h2>
     * <p>
     * Main Method
     * </p>
     * @param args
     */
    public static void main(String args[]) {
        try {
            // driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //open a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "khinthantsin");
            Statement stmt = con.createStatement();
            //execute a query
            ResultSet rs = stmt.executeQuery("select * from person");

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
