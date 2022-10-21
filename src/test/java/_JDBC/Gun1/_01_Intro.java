package _JDBC.Gun1;
import org.testng.annotations.Test;
import java.sql.*;
public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";    // hostname, port/ db adını
        String username="root"; // username
        String password="'\"-LhCB'.%k[4S]z"; // password

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement(); // sorguları çalıştırmak için page açıldı. statement sorgu demek
        ResultSet rs =statement.executeQuery("select * from actor"); // sorgu sonucu oluştu ama DB de bekliyor.

        rs.next();
        //1.satir

        String first_name=rs.getString("first_name");
        String last_name=rs.getString("last_name");

        System.out.println("first_name= "+first_name);
        System.out.println("last_name= "+last_name);

        //2.satir
        rs.next();

        first_name=rs.getString("first_name");
        last_name=rs.getString("last_name");

        System.out.println("first_name= "+first_name);
        System.out.println("last_name= "+last_name);

        connection.close();
    }
}
