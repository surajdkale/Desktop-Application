/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.machine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.io.*;

public class Dumm {
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.print("Enter Name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("_____________");
        System.out.print("Enter Email :");
        String email = sc.nextLine();
        System.out.println("_____________");
        System.out.print("Enter Roll NO :");
        Integer rollno = sc.nextInt();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            java.sql.Statement statement = conn.createStatement();
            int n = statement.executeUpdate("INSERT INTO dummy " + "VALUES (name, email,rollno)");
            if(n==1){
                System.out.println("Record Inserted Successfully");
            }else{
                System.out.println("Record Not Inserted!!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
