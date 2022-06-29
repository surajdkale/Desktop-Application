
package Swing_Framework_Application;

import java.sql.*;
import javax.swing.*;
import java.util.Date;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ES extends javax.swing.JFrame {
 public String questionId ="1";
    public String answer;
    public int min =0;
    public int sec =0;
    public int marks =0;
    Timer time;
    
    
     public void answerCheck(){
        String studentAnswer="";
        if(jRadioButton3.isSelected()){
            studentAnswer = jRadioButton3.getText();
        }
        else if(jRadioButton4.isSelected()){
            studentAnswer = jRadioButton4.getText();
        }
         else if(jRadioButton5.isSelected()){
            studentAnswer = jRadioButton5.getText();
        }
        else{
             studentAnswer = jRadioButton6.getText();
        }
        if(studentAnswer.equals(answer)){
            marks = marks+1;
            String marks1 = String.valueOf(marks);
            jLabel19.setText(marks1);  
        }
        
        // Question number change
        int questionId1 = Integer.parseInt(questionId);
        questionId1 = questionId1+1;
        questionId = String.valueOf(questionId1);
        
        //Clear jRadiobutton 
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        
        //last question hide next button
        
        if(questionId.equals("20")){
            jButton1.setVisible(false);//nxt
        }       

         // Submit button hide
         if(!questionId.equals("20")){
            
            jButton2.setVisible(false);
        }
        else{
            jButton2.setVisible(true);
         }
    }

    
     public void question(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root","root");
            Statement st = con.createStatement();
            ResultSet rs1 = st.executeQuery("select * from question where ID='"+questionId+"'");
            while(rs1.next()){
                jLabel17.setText(rs1.getString(1));
                jLabel21.setText(rs1.getString(2));
                jRadioButton3.setText(rs1.getString(3));
                jRadioButton4.setText(rs1.getString(4));
                jRadioButton5.setText(rs1.getString(5));
                jRadioButton6.setText(rs1.getString(6));
                answer=rs1.getString(7);
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(ES.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
     public void submit(){
         
        String RollNo=String.valueOf(studRollno.getText());
//        System.out.println(studRollno);
//
        //String Name = studname.getText();
        answerCheck();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root","root");
                
             String q="update student set marks='"+marks+"' where RollNo='"+RollNo+"'";
             
            PreparedStatement st = con.prepareStatement(q);
            st.executeUpdate();
            String marks1=String.valueOf(marks);
//            JOptionPane.showMessageDialog(null,"Your Marks :"+marks1);
            
            setVisible(false);
            new SuccessfullySubmitted(marks1).setVisible(true);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(ES.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
     public ES(String passcode) {
        initComponents();
       
        studRollno.setText(passcode);
        System.out.println(studRollno);
          //date
        SimpleDateFormat sdFormat = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        jLabel20.setText(sdFormat.format(date));
        
         // time program
        setLocationRelativeTo(this);
        time = new Timer(1000,new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                
                if(sec==60){
                    sec=0;
                    min++;
                
                    if(min==10){
                        time.stop();
                        answerCheck();
                        submit();
                    }
                    
                }sec++;
            }
                
        });
         time.start();  
        
        //First question and student Details
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where RollNo='"+passcode+"'");
            
            while(rs.next()){
                 studname.setText(rs.getString(1));
            }
            ResultSet rs1 = st.executeQuery("select * from question where ID='"+questionId+"'");
            while(rs1.next()){
                jLabel17.setText(rs1.getString(1));
                jLabel21.setText(rs1.getString(2));
                jRadioButton3.setText(rs1.getString(3));
                jRadioButton4.setText(rs1.getString(4));
                jRadioButton5.setText(rs1.getString(5));
                jRadioButton6.setText(rs1.getString(6));
                answer=rs1.getString(7);
            }  
                
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
       } catch (ClassNotFoundException ex) {
         Logger.getLogger(ES.class.getName()).log(Level.SEVERE, null, ex);
     }
         
    }
   
     
    public ES() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        studRollno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        studname = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0,0,0,1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Question:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 108, 160, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("20");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 108, 48, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Question Number:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 151, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("00");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 151, 40, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Your Marks:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 194, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("00");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 194, 40, -1));

        studRollno.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        studRollno.setForeground(new java.awt.Color(255, 255, 255));
        studRollno.setText("jLabel4");
        jPanel2.add(studRollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 14, 88, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student RollNo :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Name :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 65, 164, -1));

        studname.setFont(new java.awt.Font("Yu Gothic Medium", 1, 21)); // NOI18N
        studname.setForeground(new java.awt.Color(255, 255, 255));
        studname.setText("Amol");
        jPanel2.add(studname, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 65, 162, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 255, 51));
        jPanel2.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 630));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 320, 630));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Question Demo?");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 910, 70));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Option 1");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 900, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Option 2");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 900, -1));

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Option 3");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 910, -1));

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Option 4");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 910, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1047, 12, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time Taken");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1047, 55, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("20 min");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1171, 12, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 55, 34, -1));

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("jLabel20");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 67, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT EXAM PORTAL");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 50));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 570, 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("00");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 34, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 150, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing_Framework_Application/Hands - Analytics.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 420, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){

            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){

            jRadioButton3.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton5.isSelected()){

            jRadioButton4.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton6.isSelected()){

            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do really want to submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            answerCheck();
            submit();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel studRollno;
    private javax.swing.JLabel studname;
    // End of variables declaration//GEN-END:variables
}
