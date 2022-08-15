package daos;

import java.sql.*;

public class App {
    public static final String URL = "jdbc:mysql://localhost:3306/MyDatabase";
    public static final String USER = "james89";
    public static final String PASS = "SQL63?ttjL0l";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        App server = new App();
        server.getConnect();
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(URL, USER, PASS);
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select * from MyTable");
//        while(rs.next())
//            System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
//        con.close();
//    }
    }

    public void getConnect() throws ClassNotFoundException, SQLException {
//        try {
//            DriverManager.registerDriver(new Driver());
//            return DriverManager.getConnection(URL, USER, PASS);
//        } catch (SQLException ex) {
//            throw new RuntimeException("Error can not connect", ex);
//        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from MyTable");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
        con.close();
    }
}
