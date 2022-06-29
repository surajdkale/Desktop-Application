/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SURAJ
 */
public class SelectFromAccountType extends javax.swing.JFrame {

     public Statement st;
    java.sql.Connection cn;
    java.sql.Connection conn = null;
    java.sql.PreparedStatement pstmt = null;
    public SelectFromAccountType() {
        
        
        initComponents();
      Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            st = cn.createStatement();
            System.out.println("Connected!");
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Make Sure that you properly connected to the Internet!");
           JOptionPane.showMessageDialog(null, e);
        }
         
           
         
    }
    
   private void getaccnumber(){
        try{
            String sql = "select * from atmreg where PIN='"+enterpin.getText()+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String accnum = rst.getString("ACCNUM");
            FANText.setText(accnum);
            
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AR = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        CONFIRM = new javax.swing.JLabel();
        CS = new javax.swing.JLabel();
        FAT = new javax.swing.JLabel();
        TAN = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        FANText = new javax.swing.JTextField();
        TANText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enterpin = new javax.swing.JTextField();
        Usnname = new javax.swing.JLabel();
        UsBalance = new javax.swing.JLabel();
        deb = new javax.swing.JLabel();
        userbackname = new javax.swing.JLabel();
        intb = new javax.swing.JLabel();
        inta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAKE TRANSFER");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1210, -1));

        AR.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        AR.setForeground(new java.awt.Color(0, 0, 0));
        AR.setText("AMOUNT  -");
        jPanel3.add(AR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 140, 50));

        C.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        C.setForeground(new java.awt.Color(0, 0, 0));
        C.setText("CANCEL");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        jPanel3.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, -1, 30));

        CONFIRM.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CONFIRM.setForeground(new java.awt.Color(0, 0, 0));
        CONFIRM.setText(" CONFIRM");
        CONFIRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONFIRMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CONFIRMMouseEntered(evt);
            }
        });
        jPanel3.add(CONFIRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, 30));

        CS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CS.setForeground(new java.awt.Color(0, 0, 0));
        CS.setText("Enter PIN to get AC -");
        jPanel3.add(CS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 240, 50));

        FAT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FAT.setForeground(new java.awt.Color(0, 0, 0));
        FAT.setText("FROM ACCOUNT NUMBER -");
        jPanel3.add(FAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 340, 50));

        TAN.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TAN.setForeground(new java.awt.Color(0, 0, 0));
        TAN.setText("TO ACCOUNT NUMBER -");
        jPanel3.add(TAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 300, 50));

        Amount.setBackground(new java.awt.Color(255, 255, 255));
        Amount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 0));
        Amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AmountFocusLost(evt);
            }
        });
        jPanel3.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 150, 40));

        FANText.setBackground(new java.awt.Color(255, 255, 255));
        FANText.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        FANText.setForeground(new java.awt.Color(0, 0, 0));
        FANText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FANText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FANTextFocusGained(evt);
            }
        });
        jPanel3.add(FANText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 440, 50));

        TANText.setBackground(new java.awt.Color(255, 255, 255));
        TANText.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TANText.setForeground(new java.awt.Color(0, 0, 0));
        TANText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TANText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TANTextKeyPressed(evt);
            }
        });
        jPanel3.add(TANText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 440, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Account Number should be 15 digits");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 430, 70));

        enterpin.setBackground(new java.awt.Color(255, 255, 255));
        enterpin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        enterpin.setForeground(new java.awt.Color(0, 0, 0));
        enterpin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        enterpin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterpinFocusLost(evt);
            }
        });
        enterpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterpinKeyPressed(evt);
            }
        });
        jPanel3.add(enterpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 440, 50));

        Usnname.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Usnname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Usnname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 150, 50));

        UsBalance.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        UsBalance.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(UsBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, 270, 50));
        jPanel3.add(deb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 130, 20));

        userbackname.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(userbackname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 40));

        intb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(intb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 200, 60, 30));

        inta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(inta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 60, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Bank of Union Nation PVT. LTD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1000, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Satya Niketan, South West New Delhi, India - 110021");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 580, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact@UnionNation.In Services.UnionNation@Gmail.Com");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 690, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        
            new MainPage().setVisible(true);
            dispose();
          
       
    }//GEN-LAST:event_CMouseClicked

    private void CONFIRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONFIRMMouseClicked
          if(FANText.getText().isEmpty() && TANText.getText().isEmpty() && Amount.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"FIll in the blanks");
      }else{
          //TotalAmount 
          try{
            String sql = "select * from atmreg where PIN='"+enterpin.getText()+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String username = rst.getString("ID");
                String tamount = rst.getString("BALANCE");
                String debitcardnum = rst.getString("DEBITCARD");
                  Usnname.setText(username);
                  UsBalance.setText(tamount);
                  deb.setText(debitcardnum);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
          //inserting data into db
          int a = Integer.parseInt(UsBalance.getText());
           int b = Integer.parseInt(Amount.getText());
         int  totalamount =a-b;
         String Procedure = "Transfer";
         UsBalance.setText(String.valueOf(totalamount)); 
        try{
                Class.forName("com.mysql.jdbc.Driver");
                String sql = "INSERT INTO history(USERID,PROCEDURES,DEV,FACCOUNTNUM,TACCOUNTNUM, TBALANCE) VALUES (?,?,?,?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
                 pstmt = conn.prepareStatement(sql); 
                 pstmt.setString(1,Usnname.getText());
                 pstmt.setString(2,Procedure);
                 pstmt.setString(3,deb.getText());
                pstmt.setString(4,FANText.getText());
                pstmt.setString(5,TANText.getText());
                pstmt.setString(6,UsBalance.getText());
                
                pstmt.executeUpdate();
                 System.out.println("Succsessfully data inserted!");
                 new TransferCompleteAccountDisplay().setVisible(true);
                 dispose();
                 
            }catch(SQLException | HeadlessException ex){
                System.out.println("Failed");
                JOptionPane.showMessageDialog(null,ex);
            } catch (ClassNotFoundException ex) { 
            java.util.logging.Logger.getLogger(SelectFromAccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
      }
        
         
        
    }//GEN-LAST:event_CONFIRMMouseClicked

    private void enterpinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterpinFocusLost
        // TODO add your handling code here:
        
        getaccnumber();
        FANText.setEditable(false);
    }//GEN-LAST:event_enterpinFocusLost

    private void enterpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterpinKeyPressed
        // TODO add your handling code here:
         //Only allowed digits...
        String phoneNumber = enterpin.getText();
        int length = phoneNumber.length();
        //check for length not more than 4 
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=3){
                enterpin.setEditable(true);
            }else{
                enterpin.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed 
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                enterpin.setEditable(true);
            }else{
                enterpin.setEditable(false);
            }
        }
    }//GEN-LAST:event_enterpinKeyPressed

    private void FANTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FANTextFocusGained
        // TODO add your handling code here:
        FANText.setEditable(false);
    }//GEN-LAST:event_FANTextFocusGained

    private void TANTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TANTextKeyPressed
       
         //Only allowed digits...
        String phoneNumber = TANText.getText();
        int length = phoneNumber.length();
        //check for length not more than 4 
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=14){
                TANText.setEditable(true);
            }else{
                TANText.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed 
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                TANText.setEditable(true);
            }else{
                TANText.setEditable(false);
            }
        }
    }//GEN-LAST:event_TANTextKeyPressed

    private void AmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AmountFocusLost
        
    }//GEN-LAST:event_AmountFocusLost

    private void CONFIRMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONFIRMMouseEntered
//       if(Amount.getText().isEmpty()){
//           CONFIRM.setEnabled(false);
//       }else{
//         try{
//            String sql = "select * from atmreg where PIN='"+enterpin.getText()+"'";
//            ResultSet rst=st.executeQuery(sql);
//            if(rst.next()){ 
//                String bal = rst.getString("BALANCE");
//                int a = Integer.parseInt(bal);
//                int b = Integer.parseInt(Amount.getText());
//                inta.setText(bal);
//                intb.setText(Amount.getText());
//                
//                if(a<=b){
//                    CONFIRM.setEnabled(true);
//                    System.out.println("record balance = "+a+"Amount Entered by User is ="+b);
//                } 
//            }else{
//                Amount.setDisabledTextColor(Color.red);
//                CONFIRM.setEnabled(false);
//                Amount.setText(null);
////                JOptionPane.showMessageDialog(null, "Not Enough Balance!");
//            }
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        } 
//         
//       }
        
    }//GEN-LAST:event_CONFIRMMouseEntered

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
            java.util.logging.Logger.getLogger(SelectFromAccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectFromAccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectFromAccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectFromAccountType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectFromAccountType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AR;
    private javax.swing.JTextField Amount;
    private javax.swing.JLabel C;
    private javax.swing.JLabel CONFIRM;
    private javax.swing.JLabel CS;
    private javax.swing.JTextField FANText;
    private javax.swing.JLabel FAT;
    private javax.swing.JLabel TAN;
    private javax.swing.JTextField TANText;
    private javax.swing.JLabel UsBalance;
    private javax.swing.JLabel Usnname;
    private javax.swing.JLabel deb;
    private javax.swing.JTextField enterpin;
    private javax.swing.JLabel inta;
    private javax.swing.JLabel intb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel userbackname;
    // End of variables declaration//GEN-END:variables
}
