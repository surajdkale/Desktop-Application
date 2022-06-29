/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author suraj
 */
public class CreateConnection {
    public static void main(String[] args) {
        try{
                //Opening Connection...
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root","sssss");
                
                if(con.isClosed()){
                    System.out.println("Not Connected");
                }
                else{
                    System.out.println("Connected!");
                }

                con.close();
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
