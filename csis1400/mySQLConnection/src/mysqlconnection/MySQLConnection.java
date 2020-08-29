/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnection;


import java.awt.*;
import java.util.*;
import java.sql.*;
/**
 *
 * @author tallan
 */
public class MySQLConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        try 
        {

            Class.forName("com.mysql.jdbc.Driver");  
            
            Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/record_store","root","purpskirtLHD5");  
                //here sonoo is database name, root is username and password  
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from emp");  
                while(rs.next())  
                System.out.println(rs.getInt(1)+ "  " + rs.getString(2) + "  " + rs.getString(3));  
                con.close();  
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }

    public static void forName(String className)throws ClassNotFoundException 
    {

    }

    public static Connection getConnection(String url,String name,String password) throws SQLException 
    {
        return null;
    }
    
    public Statement createStatement()throws SQLException
    {
        return null;
    }

    public ResultSet executeQuery(String sql)throws SQLException  
    {
        return null;
    }

    public void close()throws SQLException  
    {

    }
}
