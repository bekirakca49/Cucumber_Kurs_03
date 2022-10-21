package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    private static Connection connection;
    protected static Statement statement;

    public static void DBConnectionOpen()
    {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement= connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void DBConnectionClose()
    {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) { // test main
        List<List<String>> tablo=getListData("select * from actor");

        for(List<String> satir: tablo){
            System.out.println("satir= "+satir);
        }
    }
    public static <list> List<List<String>> getListData(String query){
        List<List<String>> tablo=new ArrayList<>();

        DBConnectionOpen();

        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) // bir sonraki
            {
                List<String> satir=new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }
        }
        catch(Exception ex)
        {
            System.out.println("ex.Message"+ex.getMessage());
        }

        DBConnectionClose();
        return tablo;
    }
}
