package _JDBC.Gun1;

import org.testng.annotations.*;
import java.sql.*;
public class _02_BeforeAfter {

    private static Connection connection;
    private static Statement statement;

    @BeforeTest
    public void DBConnectionOpen() throws SQLException // bağlantı işlemleri
    {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";    // hostname, port/ db adını
        String username = "root"; // username
        String password = "'\"-LhCB'.%k[4S]z"; // password
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(); // sorguları çalıştırmak için page açıldı.
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void DBConnectionClose()  // close
        {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Test
    public void test1() throws SQLException
    {
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String dilAdi=rs.getString("name");
        System.out.println("dilAdi= "+dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi= "+dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi= "+dilAdi);
    }

    @Test
    public void test2() throws SQLException
    {
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);
    }
    @Test
    public void test3() throws SQLException
    {
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);

        rs.previous();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi= "+dilAdi);
    }
}
