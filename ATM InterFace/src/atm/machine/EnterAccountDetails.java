/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import static java.lang.Math.random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author SURAJ
 */
public class EnterAccountDetails extends javax.swing.JFrame {

   public Statement st;
    public Connection cn;
    ResultSet rs = null;
    public EnterAccountDetails() {
        initComponents();
        Toolkit toolkit =getToolkit();
        capchta.setEnabled(false);
        capchta.setEditable(false);
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        capchta.setText(getCaptcha());
         try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root","");
            st = cn.createStatement();
            System.out.println("Connected!");
        }catch(Exception e){
           System.out.println("Not Connected!");
        }
    }
 public EnterAccountDetails(String idofuse){
        namefrommainpage.setText(idofuse);
    }
    
      
   
//    Generating Captcha ....
    public String getCaptcha() {

    char data[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9','0'};
    char index[] = new char[4];

    Random r = new Random();
    int i = 0;

    for (i = 0; i < (index.length); i++) {
        int ran = r.nextInt(data.length);
        index[i] = data[ran];
    }
    return new String(index);
    
}
      //Playing Sound Effects....
    //effect for button Click....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        capchta1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        capchta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        transftername = new javax.swing.JLabel();
        namefrommainpage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 200, 60));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRANSACTION HISTORY VERIFICATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1210, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Enter Verification captcha :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 300, 40));

        capchta1.setBackground(new java.awt.Color(255, 255, 255));
        capchta1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        capchta1.setForeground(new java.awt.Color(0, 0, 0));
        capchta1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        capchta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                capchta1FocusLost(evt);
            }
        });
        capchta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                capchta1MouseEntered(evt);
            }
        });
        capchta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                capchta1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                capchta1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capchta1KeyTyped(evt);
            }
        });
        jPanel3.add(capchta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/refreshlogo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 60, 50));

        capchta.setBackground(new java.awt.Color(255, 255, 255));
        capchta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        capchta.setForeground(new java.awt.Color(0, 0, 0));
        capchta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(capchta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 200, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Enter USER ID :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, 40));

        idtext.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        idtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idtextFocusLost(evt);
            }
        });
        idtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idtextKeyPressed(evt);
            }
        });
        jPanel3.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 430, 40));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 200, 60));
        jPanel3.add(transftername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 20));
        jPanel3.add(namefrommainpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1200, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bank of Union Nation PVT. LTD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1000, 60));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Satya Niketan, South West New Delhi, India - 110021");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 580, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact@UnionNation.In Services.UnionNation@Gmail.Com");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 690, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mp3player1.play();
          
        if(idtext.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"FIll in the blanks");
       }else{
           try{
            String sql = "select * from atmreg where ID='"+idtext.getText()+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){ 
                String name = rst.getString("ID");
                transftername.setText(name);
                System.out.println(transftername);
              new ShowHistory(transftername.getText()).setVisible(true);
              dispose();
            }else{
                idtext.setText(null);
                 JOptionPane.showMessageDialog(null, "Please Check the USERID or Capchta Field!");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        capchta.setText(getCaptcha());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         mp3player1.play();
         new MainPage().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void capchta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capchta1KeyTyped
       
        
    }//GEN-LAST:event_capchta1KeyTyped

    private void capchta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_capchta1FocusLost
       
    }//GEN-LAST:event_capchta1FocusLost

    private void capchta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capchta1KeyPressed
        
    }//GEN-LAST:event_capchta1KeyPressed

    private void capchta1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capchta1KeyReleased
       
        
     
    }//GEN-LAST:event_capchta1KeyReleased

    private void capchta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capchta1MouseEntered
      
    }//GEN-LAST:event_capchta1MouseEntered

    private void idtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusLost
        transftername.setText(idtext.getText());
        System.out.println(transftername);
    }//GEN-LAST:event_idtextFocusLost

    private void idtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtextKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)){
         //iso control for edit operation (delete key and backspace key allow)
         //if enter character is letter ,space and isocontrol then it allow edit
         idtext.setEditable(true);
        }else{
            idtext.setEditable(false);
        }
    }//GEN-LAST:event_idtextKeyPressed

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
            java.util.logging.Logger.getLogger(EnterAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterAccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capchta;
    private javax.swing.JTextField capchta1;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel namefrommainpage;
    private javax.swing.JLabel transftername;
    // End of variables declaration//GEN-END:variables
}
