package org.example;
import java.sql.*;
public class Main {

    public static void main(String[] args){
      try(Connection con=DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/exc","ado","google")){
        Class.forName("com.mysql.cj.jdbc.Driver");
//here sonoo is database name, root is username and password
        ResultSet rs;
        try (Statement stmt = con.createStatement()) {
          rs = stmt.executeQuery("select studname from students");
        }
        while(rs.next())
          System.out.println(rs.getString(1));
      }catch(Exception e){ System.out.println(e);}
    }
  }
