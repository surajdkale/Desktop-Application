/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;


/**
 *
 * @author SURAJ
 */
public class UserRegistration extends javax.swing.JFrame {
       public Statement st;
    java.sql.Connection cn;
    ResultSet rs = null;
     
    java.sql.Connection conn = null;
        java.sql.PreparedStatement pstmt = null;
    public UserRegistration() {
        initComponents();
        Toolkit toolkit =getToolkit();
        pin.setEditable(false);
        
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            st = cn.createStatement();
            System.out.println("Connected!");
        }catch(Exception e){
           System.out.println("Not Connected!");
        }
        
    }

    private void ClearFields(){
        pin.setText(null);
       
        balance.setText(null);
        id.setText(null);
        debitcard.setText(null);
        accountnum.setText(null);
        bankname.setSelectedIndex(0);
    }
    
    
    //Generating the random PIN for Customer ...
    private void generatePNR(){
        String randNum=RandomStringUtils.randomNumeric(4);
        pin.setText(randNum);

        
    }
    //Playing Sound Effects....
    //effect for button Click....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        accountnum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bankname = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        debitcard = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("                User Registration Panel");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 980, 79));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("User ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 105, 33));

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 380, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Account Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Bank Balance");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 140, 33));

        balance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 377, 40));

        pin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pinKeyReleased(evt);
            }
        });
        getContentPane().add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 483, 377, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Debit Card ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 105, 33));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 110, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 80, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Bank Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 105, 33));

        accountnum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        accountnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accountnumKeyPressed(evt);
            }
        });
        getContentPane().add(accountnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 380, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, -1, -1));

        bankname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bankname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bank", "Bank of Baroda", "Bank of India", "Bank of Maharashtra", "Canara Bank", "Central bank of India", "Inidan Bank", "Indian Overseas Bank", "Punjab National Bank", "State Bank of India", "Union Bank of India", "Axis Bank", "HDFC Bank", "ICICI Bank", "IDBI Bank", "IDFC Bank", "Maharashtra Gramin Bank" }));
        getContentPane().add(bankname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 380, 40));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 110, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("PIN");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 105, 33));

        debitcard.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        debitcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                debitcardKeyPressed(evt);
            }
        });
        getContentPane().add(debitcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 429, 380, 40));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setText("Generate PIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 485, 170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
       
    }//GEN-LAST:event_idKeyReleased

    private void pinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyReleased
       
    }//GEN-LAST:event_pinKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mp3player1.play();
      
           System.out.println("PINCODE MATCHING");
           if(id.getText().isEmpty()&& accountnum.getText().isEmpty() && balance.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Fill in the Blanks");
        }else{
        try{
                Class.forName("com.mysql.jdbc.Driver");
                String sql = "INSERT INTO atmreg(ID,BANKNAME,ACCNUM, BALANCE,DEBITCARD, PIN) VALUES (?,?,?,?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
                 pstmt = conn.prepareStatement(sql); 
                pstmt.setString(1,id.getText());
                pstmt.setString(2,bankname.getSelectedItem().toString());
                pstmt.setString(3,accountnum.getText());
                pstmt.setString(4,balance.getText());
                pstmt.setString(5,debitcard.getText());
                pstmt.setString(6,pin.getText());
                pstmt.executeUpdate();
                System.out.println("Succsessfully data inserted!");
                 
                 new UserLOGIN().setVisible(true);
                 dispose();
                 JOptionPane.showMessageDialog(null,"Succsessfully Registerd");
            }catch(SQLException | HeadlessException ex){
                System.out.println("Failed");
                JOptionPane.showMessageDialog(null,ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }   
           ClearFields(); 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          mp3player1.play();
        ClearFields();
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mp3player1.play();
       new UserLOGIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       mp3player1.play();
        generatePNR();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void accountnumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountnumKeyPressed
         //Only allowed digits...
        String phoneNumber = accountnum.getText();
        int length = phoneNumber.length();
        //check for length not more than 15 
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=14){
                accountnum.setEditable(true);
            }else{
                accountnum.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed 
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                accountnum.setEditable(true);
            }else{
                accountnum.setEditable(false);
            }
        }
    }//GEN-LAST:event_accountnumKeyPressed

    private void debitcardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debitcardKeyPressed
        //Only allowed digits...
        String phoneNumber = debitcard.getText();
        int length = phoneNumber.length();
        //check for length not more than 16 
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=15){
                debitcard.setEditable(true);
            }else{
                debitcard.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed 
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                debitcard.setEditable(true);
            }else{
                debitcard.setEditable(false);
            }
        }
    }//GEN-LAST:event_debitcardKeyPressed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
       char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
         //iso control for edit operation (delete key and backspace key allow)
         //if enter character is letter ,space and isocontrol then it allow edit
         id.setEditable(true);
        }else{
            id.setEditable(false);
        }
    }//GEN-LAST:event_idKeyPressed

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountnum;
    private javax.swing.JTextField balance;
    private javax.swing.JComboBox<String> bankname;
    private javax.swing.JTextField debitcard;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
