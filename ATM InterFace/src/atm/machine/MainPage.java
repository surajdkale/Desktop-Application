/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;
import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

/**
 *
 * @author SURAJ
 */
public class MainPage extends javax.swing.JFrame {

    String usernamefordeposit;
    public MainPage() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    
    }

    public MainPage(String jLabel1){
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        idofuse.setText(jLabel1);
       this.usernamefordeposit = jLabel1;
    }   

    //Playing Sound Effects....
    //effect for button Click....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\beep-07a.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));

    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UN1 = new javax.swing.JLabel();
        idofuse = new javax.swing.JLabel();
        backednameforwithdraw = new javax.swing.JLabel();
        namfromtrans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select your Transaction");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 420, 50));

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/TransactionHistorywhite.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        jPanel3.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 320, 70));

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/quitwhite.png"))); // NOI18N
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        jPanel3.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 290, 70));

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/depositwhite.png"))); // NOI18N
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        jPanel3.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 290, 70));

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/transforwhite.png"))); // NOI18N
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        jPanel3.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 210, 70));

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/withdrawwhite.png"))); // NOI18N
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        jPanel3.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 240, 70));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 200, 60));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available Transactions");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1210, -1));
        jPanel3.add(UN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 30));

        idofuse.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(idofuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 180, 30));
        jPanel3.add(backednameforwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 110, 30));
        jPanel3.add(namfromtrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1210, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/TransactionHistorycolor.png")));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/TransactionHistorywhite.png")));
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
       b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/withdrawcolor.jpg")));
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/withdrawwhite.png")));
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
      mp3player1.play();
        
        new Deposit(usernamefordeposit).setVisible(true);
        
    }//GEN-LAST:event_b3MouseClicked

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
         b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/depositcolor.png")));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
       b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/depositwhite.png")));
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
       b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/transforcolor.png")));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/transforwhite.png")));
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
       b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/quitcolor.png")));
    }//GEN-LAST:event_b5MouseEntered

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/quitwhite.png")));
    }//GEN-LAST:event_b5MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          mp3player1.play();
        new UserLOGIN().setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
      mp3player1.play();
        new withdrawal(idofuse.getText()).setVisible(true);
      
    }//GEN-LAST:event_b2MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
            mp3player1.play();    
        new SelectFromAccountType().setVisible(true);
      dispose();
    }//GEN-LAST:event_b4MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
         mp3player1.play();
         new EnterAccountDetails().setVisible(true);
         dispose();
    }//GEN-LAST:event_b1MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        mp3player1.play();
        dispose();
    }//GEN-LAST:event_b5MouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UN1;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel backednameforwithdraw;
    private javax.swing.JLabel idofuse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel namfromtrans;
    // End of variables declaration//GEN-END:variables
}
