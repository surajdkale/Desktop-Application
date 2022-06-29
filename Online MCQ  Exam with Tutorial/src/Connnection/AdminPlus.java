/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connnection;

import Swing_Framework_Application.LoginPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author suraj
 */
public class AdminPlus {
    public static void main(String[] args) {
        try{
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root","sssss");
                //Creating an query
                String q="insert into admin(Name,Password) values (?,?)";
                //getting The prpared statement
                PreparedStatement stmnt=con.prepareStatement(q);
                
                String username="Amol Nandiwale";
                String passcode="Amol";
              
                //setting the values into it by using the variables..
                stmnt.setString(1,username);
                stmnt.setString(2,passcode);
                
                stmnt.executeUpdate();
           
                System.out.println("Values inserted....");
               
               
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
          }
    }

