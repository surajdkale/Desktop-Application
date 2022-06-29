/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duplicatecopyofonline_reservation_stystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SURAJ
 */
public class JConnector {

 public static Connection Connect(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinereservationsystem","root","");
         System.out.println("Connection Successfull!");
         return conn;
     }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showInternalMessageDialog(null, e);
         return null;
     }
 }   
}

