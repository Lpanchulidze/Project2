package DataObjects;

import java.sql.*;

public class SignUpPageData {

    public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String password;
    public String phone;
    public int zip;

    public void main() throws SQLException{

        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost\\SQLEXPRESS",
                "TestAutomation", "TestAutomation123");
        Statement stmt = conn.createStatement();

        String strSelect = "select firstName, lastName, email, address, state, city, password," +
                "phone, zip from [users].[dbo].[users]";

        ResultSet rset = stmt.executeQuery(strSelect);
        while(rset.next()) {

            firstName = rset.getString("firstName");
            lastName = rset.getString("lastName");
            address = rset.getString("address");
            state = rset.getString("state");
            city = rset.getString("city");
            password = rset.getString("password");
            phone = rset.getString("phone");
            zip = rset.getInt("zip");
        }
    }
}




