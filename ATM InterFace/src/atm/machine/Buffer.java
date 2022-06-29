/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package atm.machine;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author SURAJ
 */
public class Buffer extends javax.swing.JFrame {

pbThead t1;
    String usernames,typeamount;
    public Buffer() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        t1=new pbThead(progress);
        t1.start();
//        progress.hide();
        un.hide();
    }
    
    public Buffer(String usernamefromdeposit, String amounttext){
        this.usernames = usernamefromdeposit;
        this.typeamount = amounttext;
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        t1=new pbThead(progress);
        t1.start();
        un.setText(usernames);
        progress.hide();
        un.hide();
    }

    
 

    class pbThead extends Thread{
        
        JProgressBar bar;
        
        pbThead(JProgressBar bar){
            bar = progress;
        }
         
        public void run(){
            int min=0;
            int max=100;
            
            progress.setMaximum(min);
            progress.setMaximum(max);
            progress.setValue(0);
            progress.setStringPainted(true);
            progress.setFont(new Font("Arial",Font.PLAIN,25));
            for(int i=min;i<=max;i++){
                progress.setValue(i);
                
                try {
                    sleep(100);
                    if(i==0){
                        mp3player1.play();
                    }
                    if(i==50){
                        mp3player2.play();
                    }
                    if(i==87){
                        mp3player3.play();
                    }
                    if(i==90){
                        mp3player3.play();
                    }
                    if(i==93){
                        mp3player3.play();
                    }
                    if(i==96){
                        mp3player3.play();
                    }
                    if(i==99){
                         mp3player3.play();
                    }
                     if(i==100){  
                        
                         new withdrawalcomplete(usernames,typeamount).setVisible(true);
                        dispose();
                    }
                }
                catch(Exception e){
                    
                    
                }
               
            }
        }
    }
    
   
         
     
    //Playing Sound Effects....
    //effect for Cash Spinning....
    public static final String SONG11 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\CashSpinning.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG11));
    
    //effect for Cash Ejecting....
    public static final String SONG12 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\Ejecting.mp3";
    MP3Player mp3player2 = new MP3Player(new File(SONG12));
    
    //effect for beep simultaneously 4 times....
    public static final String SONG13 = "C:\\Users\\SURAJ\\Documents\\NetBeansProjects\\ATM Machine\\src\\atm\\machine\\ATM SOUNDS\\Barcode.mp3";
    MP3Player mp3player3 = new MP3Player(new File(SONG13));
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buffer = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        un = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Withdrawal");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 0, 730, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, -1));

        buffer.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        buffer.setForeground(new java.awt.Color(0, 0, 0));
        buffer.setText("We Are Processing Your Transaction....");
        jPanel3.add(buffer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 470, 70));
        jPanel3.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1210, 30));

        un.setText("jLabel2");
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 140, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1210, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buffer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables

}
