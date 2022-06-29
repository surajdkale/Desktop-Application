/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author suraj
 */
public class DeleteTable {
    public static void main(String[] args) {
        
         try{
            
                 Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suraj","root","sssss");
                //Creating an query
                String q="insert into kale(Name,City) values (?,?)";
                //getting The prpared statement
                PreparedStatement stmnt=con.prepareStatement(q);
                
                //setting the values into it by using the variables..
                
                
           
            
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
