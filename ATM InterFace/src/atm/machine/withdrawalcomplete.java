/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author SURAJ
 */
public class withdrawalcomplete extends javax.swing.JFrame {

    public Statement st;
    java.sql.Connection cn;
    java.sql.Connection conn = null;
    java.sql.PreparedStatement pstmt = null;
    String user,typeam;
    public withdrawalcomplete() {
//        ID.hide();
//        ACC.hide();
//        VAL.hide();
//        randomatmid.hide();
//        txn.hide();
//        responce.hide();
//        mod.hide();
//        debc.hide();
   
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
public withdrawalcomplete(String usernames,String typeamount){
//        ID.hide();
//        ACC.hide();
//        VAL.hide();
//        randomatmid.hide();
//        txn.hide();
//        responce.hide();
//        mod.hide();
//        debc.hide();
     
    this.user = usernames;
    this.typeam = typeamount;
    initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
         try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            st = cn.createStatement();
            System.out.println("Connected with printing page");
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Make Sure that you properly connected to the Internet!");
           JOptionPane.showMessageDialog(null, e);
        }
        
         
}

   
   
 //effect for beep....
    public static final String SONG13 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player3 = new MP3Player(new File(SONG13));
    
     //effect for beep....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\Printing.mp3";
    MP3Player mp3player2 = new MP3Player(new File(SONG11));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        select = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        select1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        ID = new javax.swing.JLabel();
        ACC = new javax.swing.JLabel();
        VAL = new javax.swing.JLabel();
        mod = new javax.swing.JLabel();
        randomatmid = new javax.swing.JLabel();
        txn = new javax.swing.JLabel();
        responce = new javax.swing.JLabel();
        debc = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        select.setForeground(new java.awt.Color(0, 0, 0));
        select.setText("Please select a Reciept Option..");
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 550, 70));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Withdrawal");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, -1));

        select1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        select1.setForeground(new java.awt.Color(0, 0, 0));
        select1.setText("Your Withdrawal is completed.");
        jPanel3.add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 530, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/noreciept.PNG"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 330, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/paperreciept.PNG"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 210, 170));

        area.setEditable(false);
        area.setBackground(new java.awt.Color(255, 255, 255));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        area.setForeground(new java.awt.Color(0, 0, 0));
        area.setRows(5);
        area.setBorder(null);
        jScrollPane1.setViewportView(area);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 510, 440));

        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 110, 20));

        ACC.setForeground(new java.awt.Color(255, 255, 255));
        ACC.setText("ACCNUM");
        jPanel3.add(ACC, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 110, 20));

        VAL.setForeground(new java.awt.Color(255, 255, 255));
        VAL.setText("BAL");
        jPanel3.add(VAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 110, 20));

        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setText("MOD ");
        jPanel3.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 120, 20));

        randomatmid.setForeground(new java.awt.Color(255, 255, 255));
        randomatmid.setText("RamdomATMID");
        jPanel3.add(randomatmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 120, 20));

        txn.setForeground(new java.awt.Color(255, 255, 255));
        txn.setText("TXN");
        jPanel3.add(txn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 120, 20));

        responce.setForeground(new java.awt.Color(255, 255, 255));
        responce.setText("RESPONCE");
        jPanel3.add(responce, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 120, 20));

        debc.setForeground(new java.awt.Color(255, 255, 255));
        debc.setText("DebitCard");
        jPanel3.add(debc, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 90, 20));

        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("jLabel8");
        jPanel3.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 60, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      mp3player3.play();
        new GreetingCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        mp3player2.play();
        mp3player3.play();
        //fetching records from history table from database ...

//select * from atmreg where ID='"+user+"'
         try{
             
            String sql = "SELECT * FROM history ORDER BY SRNO DESC";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String accnum = rst.getString("FACCOUNTNUM");
                String id = rst.getString("USERID");
                String bal = rst.getString("TBALANCE");
                String atmnum = rst.getString("DEV");
            ACC.setText(accnum);
            VAL.setText(bal);
            ID.setText(id);
            debc.setText(atmnum);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
         //fetching available balance from history table database...
         try{
            String sql = "select * from history where USERID='"+user+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){
                String bal = rst.getString("TBALANCE");
                VAL.setText(bal);
            }
             System.out.println("completed balance operation...");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        //generating random atm ID
        String randNum=RandomStringUtils.randomNumeric(10);
      randomatmid.setText(randNum);
        
        //generating random txn number
        String randNum1=RandomStringUtils.randomNumeric(4);
      txn.setText(randNum1);
      
      //generating random repsonse number
      String randNumx=RandomStringUtils.randomNumeric(3);
      responce.setText(randNumx);
      
      //Generating random MOD nO
      String randNum2=RandomStringUtils.randomNumeric(2);
      mod.setText(randNum2);
        
      Date obj =new Date();
      String dates =obj.toString();
          area.setText("   ए टी एम ग्राहक सूचना /ATM Customer Advice\n\n");
          area.setText(area.getText()+"                 यूनियन नेशन बँक ऑफ इंडिया \n");
          area.setText(area.getText()+"            UNION NATION BANK OF INDIA \n");
          area.setText(area.getText()+"---------------------------------------------------------------------\n");
          area.setText(area.getText()+"      INDAPUR MAIN BRANCH\n\n");
          area.setText(area.getText()+"      DATE          TIME                          ATM ID \n");
          area.setText(area.getText()+"      "+dates+"    "+randomatmid.getText()+"\n");
          area.setText(area.getText()+"      CARD NUMBER        "+debc.getText()+"\n\n");
          area.setText(area.getText()+"      USER NAME          "+ID.getText()+"\n");
          area.setText(area.getText()+"      TXN NO             "+txn.getText()+"\n");
          area.setText(area.getText()+"      RESPONCE CODE      "+responce.getText()+"\n");
          area.setText(area.getText()+"      WITHDRAWAL         RS.  "+typeam+"\n");
          area.setText(area.getText()+"      FROM A/C           "+ACC.getText()+"\n");
          area.setText(area.getText()+"      MOD BAL            RS.          1."+mod.getText()+"\n");
          area.setText(area.getText()+"      AVAIL BAL          RS.          "  +VAL.getText()+"\n\n");
          area.setText(area.getText()+"---------------------------------------------------------------------\n");
          area.setText(area.getText()+"   MAKE YOUR PURCHASES WITH UNION NATION BANK \n");
          area.setText(area.getText()+"   DEBIT CARDS. EARN FREEDOM POINTS AND ALSO \n");
          area.setText(area.getText()+"   GET FREE GIFTS. CALL 1080020800080.\n\n");
          area.setText(area.getText()+"     Visit us www.unionnationbankofindia.com\n");
          area.setText(area.getText()+"---------------------------------------------------------------------\n");
          
        try {
            area.print();
//        new gettingreciept().setVisible(true);
//        dispose();
        } catch (PrinterException ex) {
            Logger.getLogger(withdrawalcomplete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(withdrawalcomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawalcomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawalcomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawalcomplete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawalcomplete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACC;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel VAL;
    private javax.swing.JTextArea area;
    private javax.swing.JLabel debc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mod;
    private javax.swing.JLabel randomatmid;
    private javax.swing.JLabel responce;
    private javax.swing.JLabel select;
    private javax.swing.JLabel select1;
    private javax.swing.JLabel txn;
    // End of variables declaration//GEN-END:variables
}
