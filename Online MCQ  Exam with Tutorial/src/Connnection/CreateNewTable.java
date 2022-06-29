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
public class CreateNewTable {
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
                
                String q="create table question(ID int(20) primary key ,Question varchar(300), Opt1 varchar(500), Opt2 varchar(500), Opt3 varchar(500), Opt4 varchar(500), Answer varchar(500))";
                
                //Creating an statement..
                Statement stmt = con.createStatement();
                
                stmt.executeUpdate(q);
                
                System.out.println("Table is created successfully");
                
                con.close();
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}
