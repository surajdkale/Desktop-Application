package atm.machine;


import atm.machine.MainPage;
import atm.machine.UserRegistration;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UserLOGIN extends javax.swing.JFrame {

    public Statement st;
    public Connection cn;
    ResultSet rs = null;
    public UserLOGIN() {
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
           System.out.println("Not Connected!");
        }
         
    }
   
   //Playing Sound Effects....
    //effect for button Click....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        pin1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        idtext = new javax.swing.JTextField();
        pinpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 160, 40));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome To UnionNation ATM");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, -1));

        id1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 0, 0));
        id1.setText("Enter User-ID :");
        jPanel3.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 40));

        OK.setBackground(new java.awt.Color(255, 255, 255));
        OK.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        OK.setForeground(new java.awt.Color(0, 0, 0));
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        jPanel3.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 140, 50));

        pin1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        pin1.setForeground(new java.awt.Color(0, 0, 0));
        pin1.setText("PIN :");
        jPanel3.add(pin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 210, 50));

        idtext.setBackground(new java.awt.Color(255, 255, 255));
        idtext.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        idtext.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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
        jPanel3.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 370, 50));

        pinpass.setBackground(new java.awt.Color(255, 255, 255));
        pinpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        pinpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pinpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinpassActionPerformed(evt);
            }
        });
        pinpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinpassKeyPressed(evt);
            }
        });
        jPanel3.add(pinpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 370, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Forgot PIN ?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1210, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
           mp3player1.play();
        if(idtext.getText().isEmpty() && pinpass.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"FIll in the blanks");
       }else{
           try{
            String sql = "select * from atmreg where ID='"+idtext.getText()+"'and PIN='"+String.valueOf(pinpass.getPassword())+"'";
            ResultSet rst=st.executeQuery(sql);
            if(rst.next()){          
              new MainPage(jLabel1.getText()).setVisible(true);
              dispose();
            }else{
                idtext.setText(null);
                pinpass.setText(null);
                JOptionPane.showMessageDialog(null, "Wrong ID or Password!");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       }
        
        
    }//GEN-LAST:event_OKActionPerformed

    private void pinpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinpassActionPerformed
        if(!pinpass.size().equals(4)){
            JOptionPane.showMessageDialog(null, "Please Enter Valid PIN");
            pinpass.setText(null);
        }
    }//GEN-LAST:event_pinpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mp3player1.play();
        new UserRegistration().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtextFocusLost
        // TODO add your handling code here:
        jLabel1.setText(idtext.getText());
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

    private void pinpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinpassKeyPressed
        // TODO add your handling code here:
        //Only allowed digits...
        String pin = pinpass.getText();
        int length = pin.length();
        //check for length not more than 4 
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<=3){
                pinpass.setEditable(true);
            }else{
                pinpass.setEditable(false);
            }
        }else{
            //BackSpace Delete are Allowed 
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                pinpass.setEditable(true);
            }else{
                pinpass.setEditable(false);
            }
        }
    }//GEN-LAST:event_pinpassKeyPressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
      jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
   new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(UserLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pin1;
    private javax.swing.JPasswordField pinpass;
    // End of variables declaration//GEN-END:variables
}
