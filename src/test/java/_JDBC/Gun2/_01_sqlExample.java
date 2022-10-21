package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_sqlExample extends JDBCParent {
    // last/ getRow, getDouble

    @Test
    public void test1() throws SQLException
    {
        ResultSet rs=statement.executeQuery("select city_id, city, country_id from city");
        rs.last(); // sonucu row a gider

        String id=rs.getString(1); // city_id
        System.out.println("id = "+id);

        int idInt= rs.getInt(1);
        System.out.println("idInt = "+id);

        String name=rs.getString(1); // city_id
        System.out.println("name = "+name);

       // int  nameInt= rs.getInt(2);
        // System.out.println("nameInt = "+nameInt);
        // tipi uygun olan dönüsümle, mesala hepsini String olarak alabilirsin.
        // ancak tipi uygun olmayanm mesala isimleri, int olarak zaten alınamaz

        int kacinciSatir=rs.getRow();
        // dolayisiyla bir sorgunun sonucunda kac satir geldigini
        // rs.last() dedikten sonra rs.getRow() ile alabilirim.

        rs.first(); // ilk satira gidir

    }
}
