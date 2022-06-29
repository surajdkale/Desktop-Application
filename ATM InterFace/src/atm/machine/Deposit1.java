/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SURAJ
 */
public class Deposit1 extends javax.swing.JFrame {

    String usernamefromdeposit;
    String Toaccnum = "To Self Account";
      String componentName = "Deposit";
      
      public Statement st;
    java.sql.Connection cn;
    ResultSet rst;
    java.sql.Connection conn = null;
        java.sql.PreparedStatement pstmt;
    public Deposit1() {
       initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        amounttext.hide();
        buffer.hide();
         conn = Db.Connects();
         System.out.println(usernamefromdeposit);
    }

    public Deposit1(String jLabel3){
        this.usernamefromdeposit=jLabel3;
      System.out.println(usernamefromdeposit);
       initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        amounttext.hide();
        buffer.hide();
        diff.hide();
         conn = Db.Connects();
    }
    
    
    
    //Playing Sound Effects....
    //effect for button Click....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        select = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        diff = new javax.swing.JLabel();
        amounttext = new javax.swing.JTextField();
        withdra = new javax.swing.JButton();
        buffer = new javax.swing.JLabel();
        usernam = new javax.swing.JLabel();
        userbal = new javax.swing.JLabel();
        accnum = new javax.swing.JLabel();
        bnkname = new javax.swing.JLabel();
        debitcards = new javax.swing.JLabel();
        Dates = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel4.setText(" Bank of Union Nation PVT. LTD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1000, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Satya Niketan, South West New Delhi, India - 110021");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 580, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Contact@UnionNation.In Services.UnionNation@Gmail.Com");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 690, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        select.setText("Select an amount to Deposit");
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 530, 50));

        cancel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 60));

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deposit Cash");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, -1));

        b5.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b5.setText("₹5000");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel3.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 360, 60));

        b6.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b6.setText("₹10000");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel3.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 330, 60));

        b3.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b3.setText("₹1000");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel3.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 360, 60));

        b1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b1.setText("₹100");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel3.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 360, 60));

        b2.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b2.setText("₹500");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel3.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 330, 60));

        b4.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        b4.setText("₹2000");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel3.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 330, 60));

        diff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/differentamount.png"))); // NOI18N
        diff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diffMouseClicked(evt);
            }
        });
        jPanel3.add(diff, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 300, 70));

        amounttext.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        amounttext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amounttextFocusLost(evt);
            }
        });
        amounttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amounttextKeyPressed(evt);
            }
        });
        jPanel3.add(amounttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 230, 60));

        withdra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        withdra.setText("Deposit");
        withdra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraActionPerformed(evt);
            }
        });
        jPanel3.add(withdra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 180, 60));

        buffer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        buffer.setText("We Are Processing Your Cash....");
        jPanel3.add(buffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 470, 70));
        jPanel3.add(usernam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));
        jPanel3.add(userbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 30));
        jPanel3.add(accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 30));
        jPanel3.add(bnkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 30));
        jPanel3.add(debitcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 160, 30));

        Dates.setText("jLabel2");
        jPanel3.add(Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1210, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        mp3player1.play();
        
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        try{
            String sql = "select * from atmreg where ID='"+usernamefromdeposit+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String bal = rst.getString("BALANCE");
                System.out.println(bal);
                if(bal.equals("5000")){
                    withdra.setEnabled(true);
                }
            }else{
                withdra.setEnabled(false);
                amounttext.setText(null);
                JOptionPane.showMessageDialog(null, "Not Enough Balance!");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        amounttext.setText("5000");
        mp3player1.play();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        amounttext.setText("10000");
        mp3player1.play();
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        amounttext.setText("1000");
        mp3player1.play();
    }//GEN-LAST:event_b3ActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:

        amounttext.setText("100");

    }//GEN-LAST:event_b1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        amounttext.setText("100");
        
        mp3player1.play();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        amounttext.setText("500");
        mp3player1.play();
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        amounttext.setText("2000");
        mp3player1.play();
    }//GEN-LAST:event_b4ActionPerformed

    private void amounttextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amounttextFocusLost
        // TODO add your handling code here:
        try{
            String sql = "select * from atmreg where ID='"+usernamefromdeposit+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String bal = rst.getString("BALANCE");
                if(bal.equals(amounttext.getText())){
                    withdra.setEnabled(true);
                }
            }else{
                withdra.setEnabled(false);
                amounttext.setText(null);
                JOptionPane.showMessageDialog(null, "Not Enough Balance!");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_amounttextFocusLost

    private void amounttextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amounttextKeyPressed
        // TODO add your handling code here:
        //Only allowed digits...
        String phoneNumber = amounttext.getText();
        int length = phoneNumber.length();
        //check for length not more than 4
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=14){
                amounttext.setEditable(true);
            }else{
                amounttext.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                amounttext.setEditable(true);
            }else{
                amounttext.setEditable(false);
            }
        }
    }//GEN-LAST:event_amounttextKeyPressed

    private void withdraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraActionPerformed

        mp3player1.play();

        // There are totally Three Steps after clicking on withdrawal button
        // 1) first we fetch the information which is matched to received username who logged in
        // 2) Then we send this information to history database ..
        // 3) Now we Update the total balance after transaction to the atmreg database...
        //for fetching account number from atmreg...
        try{
            Statement stmt = conn.createStatement();
            String sql = "select * from atmreg where ID='"+usernamefromdeposit+"'";
            rst = stmt.executeQuery(sql);
            while(rst.next()){
                String t1 = rst.getString("ID");
                String t2 = rst.getString("BANKNAME");
                String t3 = rst.getString("ACCNUM");
                String t4 = rst.getString("DEBITCARD");
                String t5 = rst.getString("BALANCE");
                usernam.setText(t1);
                bnkname.setText(t2);
                debitcards.setText(t4);
                accnum.setText(t3);
                userbal.setText(t5);
                System.out.println(usernam);
                System.out.println(bnkname);
                System.out.println(accnum);
                System.out.println(userbal);
                System.out.println(debitcards);
            }
        }catch(Exception e){
            System.out.println(e+"Error While Fetching Account Details..");

        }
        //arithmatic op. for calculating total balance...
        int totals = Integer.parseInt(amounttext.getText()) + Integer.parseInt(userbal.getText());
        String maintotal = String.valueOf(totals);
        System.out.println(maintotal);
        //storing name account number and remaining balance in history database....
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "INSERT INTO history(USERID,PROCEDURES,DEV,FACCOUNTNUM,TACCOUNTNUM,TBALANCE) VALUES (?,?,?,?,?,?)";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,usernamefromdeposit);
            pstmt.setString(2,componentName);
            pstmt.setString(3,debitcards.getText());
            pstmt.setString(4,accnum.getText());
            pstmt.setString(5,Toaccnum);
            pstmt.setString(6,maintotal);
            //                pstmt.setString(7,Dates.getText());
            pstmt.executeUpdate();
            System.out.println("Inserted to History");
            System.out.println("This is value of amounttext= "+amounttext.getText());
            System.out.println("This is value of userbalance= "+userbal.getText());
            System.out.println("The totals value is "+totals);
            System.out.println("The value of main total is: "+maintotal);

        }catch(SQLException | HeadlessException ex){
            System.out.println("Failed");
            JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Sending total balance to atmreg at row called BALANCE....
        try{//write totalamount
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "UPDATE atmreg SET BALANCE ='"+maintotal+"'WHERE ID='"+usernamefromdeposit+"'";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            pstmt = conn.prepareStatement(sql);

            pstmt.execute();
            System.out.println("Succsessfully Updated ATMREG BALANCE!");
            pstmt.close();
        }catch(SQLException | HeadlessException ex){
            System.out.println("Failed to Update");
            JOptionPane.showMessageDialog(null,ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        new insertCashRequest().setVisible(true);
        dispose();
    }//GEN-LAST:event_withdraActionPerformed

    private void diffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diffMouseClicked
        amounttext.show();
        mp3player1.play();
    }//GEN-LAST:event_diffMouseClicked

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
            java.util.logging.Logger.getLogger(Deposit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dates;
    private javax.swing.JLabel accnum;
    private javax.swing.JTextField amounttext;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JLabel bnkname;
    private javax.swing.JLabel buffer;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel debitcards;
    private javax.swing.JLabel diff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel select;
    private javax.swing.JLabel userbal;
    private javax.swing.JLabel usernam;
    private javax.swing.JButton withdra;
    // End of variables declaration//GEN-END:variables
}
