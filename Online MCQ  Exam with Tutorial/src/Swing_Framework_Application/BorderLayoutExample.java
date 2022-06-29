/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing_Framework_Application;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class frame extends JFrame{
    public frame(){
         Container c=getContentPane();
        
           BorderLayout bl=new BorderLayout(10,10);
        c.setLayout(bl);
        
        JButton b1=new JButton("PAGE_START");
        JButton b2=new JButton("PAGE_END");
        JButton b3=new JButton("LINE_START");
        JButton b4=new JButton("CENTER");
        JButton b5=new JButton("LINE_END");
        
        c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);
        
      
    }
}
public class BorderLayoutExample {
    public static void main(String[] args) {
        frame fa=new frame();
        fa.setTitle("Border Layout Example");
        fa.setVisible(true);
        fa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fa.setBounds(500,100,500,500);
        fa.setLocationRelativeTo(null);
        
       
        
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
