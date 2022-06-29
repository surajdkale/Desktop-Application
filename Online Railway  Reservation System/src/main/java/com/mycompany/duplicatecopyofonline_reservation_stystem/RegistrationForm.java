/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.duplicatecopyofonline_reservation_stystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SURAJ
 */
public class RegistrationForm extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        
    public RegistrationForm() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        conn = JConnector.Connect();
    }

     private void ClearFields(){
        
        name.setText(null);
        email.setText(null);
        id.setText(null);
        password.setText(null);
        Repassword.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Repassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("                User Registration Panel");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 980, 79));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("User Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 105, 33));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Email-ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 105, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("              ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 300, 160, 33));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 350, 130, 33));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 380, 33));

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 377, 33));

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 377, 33));

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 377, 33));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 110, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 80, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 80, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 180, 40));

        Repassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Repassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RepasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RepasswordKeyReleased(evt);
            }
        });
        getContentPane().add(Repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 377, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Re-Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 400, 130, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name.getText().isEmpty() && email.getText().isEmpty() && id.getText().isEmpty() && password.getText().isEmpty() && Repassword.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fill In The Blanks");
        }    else{
        try{
                Class.forName("com.mysql.jdbc.Driver");
                String sql = "insert into userreg(NAME,EMAIL,ID, PASSWORD, REPASSWORD)values(?,?,?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinereservationsystem","root","");
                 pstmt = conn.prepareStatement(sql);
                 pstmt.setString(1,name.getText()); 
                 pstmt.setString(2,email.getText());
                 pstmt.setString(3,id.getText());         
                 pstmt.setString(4,password.getText());
                 pstmt.setString(5,Repassword.getText());
                 pstmt.executeUpdate();
                 System.out.println("Succsessfully data inserted!");
                 JOptionPane.showMessageDialog(null,"Succsessfully Registerd");
                 new ReservationSystem().setVisible(true);
                 dispose();
            }catch(SQLException | HeadlessException ex){
                System.out.println("Failed");
                JOptionPane.showMessageDialog(null,ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              ClearFields();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
      
        
    }//GEN-LAST:event_emailKeyPressed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
//        String pattern="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-z]{0,5}$";
//         Pattern patt = Pattern.compile(pattern);
//        Matcher match=patt.matcher(email.getText());
//        if(!match.matches()){
//            pass1.setText("Email is Incorrect!");
//        }else{
//            pass1.setVisible(false);
//        }
    }//GEN-LAST:event_emailKeyReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
//        String PATTERN ="^[a-zA-Z0-9]{0,30}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(name.getText());
//        if(!match.matches()){
//            names.setText("Incorrect Naming");
//        }else{
//            names.setVisible(false);
//        }
    }//GEN-LAST:event_nameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here: ""
//        String PATTERN ="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(password.getText());
//        if(!match.matches()){
//            password1.setText("Minimum eight characters, at least one letter and one number");
//        }else{
//            password1.setVisible(false);
//        }
    }//GEN-LAST:event_passwordKeyReleased

    private void RepasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepasswordKeyPressed

    private void RepasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RepasswordKeyReleased

        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Repassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
