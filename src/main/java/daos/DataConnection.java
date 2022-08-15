package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
    private static Connection con = null;

    static {
        String url = "jdbc:mysql:// localhost:3306/org";
        String user = "james89";
        String pass = "SQL63?ttjL0l";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return con;
    }
}
