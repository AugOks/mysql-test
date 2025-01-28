package org.example;
import java.sql.*;
public class Main {

    public static void main(String args[]){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/exc","ado","google");
//here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select studname from students");
        while(rs.next())
          System.out.println(rs.getString(1));
        con.close();
      }catch(Exception e){ System.out.println(e);}
    }
  }
