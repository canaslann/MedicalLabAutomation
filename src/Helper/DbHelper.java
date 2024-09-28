package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String dbUsername = "username";
    private String dbPassword = "password";
    private String dbUrl = "jdbc:mysql://localhost:3306/database_name";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void showErrorMessage(Exception exception) {
        System.out.println(exception.getMessage());
    }

}
