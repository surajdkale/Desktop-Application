/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.machine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SURAJ
 */
public class Db {
    public static Connection Connects(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
         System.out.println("Connection Successfull!");
         return conn;
     }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null, "Make Sure that you properly connected to the Internet!");
         JOptionPane.showInternalMessageDialog(null, e);
         return null;
     }
 }  
}
