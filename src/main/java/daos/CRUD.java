package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class CRUD<T> implements CRUDmethods<T> {

    public List<T> findAll() {
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select * from MyTable");
//        while(rs.next())
//            System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
//        con.close();
        return null;
    }

    public T update(String make, String model, Integer vin) {
//        String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";

//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, "123456789");
//        statement.setString(2, "William Henry Bill Gates");
//        statement.setString(3, "bill.gates@microsoft.com");
//        statement.setString(4, "bill");
//
//        int rowsUpdated = statement.executeUpdate();
//        if (rowsUpdated > 0) {
//            System.out.println("An existing user was updated successfully!");
//        }
        return null;
    }

    public T create(Integer id, String make, String model, Integer vin) {
        return null;
    }

    public T findById(Integer id) {
      return null;
    }

    public T delete(Integer id) {
     return null;
    }
}

