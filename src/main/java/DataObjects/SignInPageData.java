package DataObjects;

import java.sql.*;

public class SignInPageData {

    public String email;
    public String password;

    public void main() throws SQLException {

        Connection conn = DriverManager.getConnection(
                "jdbc:sqlserver://localhost\\SQLEXPRESS",
                "TestAutomation", "TestAutomation123");
        Statement stmt = conn.createStatement();

        String strSelect = "select firstName, lastName, email, address, state, city, password," +
                "phone, zip from [users].[dbo].[users]";

        ResultSet rset = stmt.executeQuery(strSelect);
        while(rset.next()) {
            email = rset.getString("email");
            password = rset.getString("password");
        }
    }
}
