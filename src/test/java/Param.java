import org.testng.annotations.Test;

import java.sql.*;

public class Param {

    public static int InsertUserInfo(int id, String firstName, String lastName,
                                     String phone, String password, String address, String email, String state, String city, int zip) {

        ResultSet rs = null;
        int UserId = 0;

        String sql = " SET IDENTITY_INSERT [users].[dbo].[users] ON\n" +
                "insert into [users].[dbo].[users]\n" +
                "(id,firstName,lastName,phone,password,address,email,state,city,zip)\n" +
                "  values(?,?,?,?,?,?,?,?,?,?) SET IDENTITY_INSERT [users].[dbo].[users] OFF ";
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS";
        String user = "TestAutomation";
        String SQLpassword = "TestAutomation123";
        try (Connection conn = DriverManager.getConnection(url, user, SQLpassword);
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            conn.setAutoCommit(false);

            pstmt.setInt(1, id);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, phone);
            pstmt.setString(5, password);
            pstmt.setString(6, address);
            pstmt.setString(7, email);
            pstmt.setString(8, state);
            pstmt.setString(9, city);
            pstmt.setInt(10, zip);

            int rowAffected = pstmt.executeUpdate();
            if (rowAffected == 1) {
                rs = pstmt.getGeneratedKeys();
                if (rs.next())
                    UserId = rs.getInt(1);
            }
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return UserId;
    }

    @Test
    public static void InsertTest() {
        int id = Param.InsertUserInfo(1001, "Luka", "Panchulidze",
                "5554562222", "123456789", "Tbilisi", "lukaPanchulidze@gmail.com", "Georgia", "tbilisi", 14075);
        System.out.println(String.format("A new user with id %d has been inserted.", id));

    }
}