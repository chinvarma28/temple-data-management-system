/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Hp
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
      
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temple","root","S1234sf20cs137");
            System.out.println("connected");
            return con;
        }
        catch(Exception e)
        {
           return null;
        }
    }
}
