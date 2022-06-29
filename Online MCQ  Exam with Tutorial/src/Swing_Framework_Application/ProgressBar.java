/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing_Framework_Application;

import java.awt.Font;
import javax.swing.JProgressBar;

/**
 *
 * @author suraj
 */
public class ProgressBar extends javax.swing.JFrame {
public String rollno;
    pbThead t1;
    
      public ProgressBar(String rollNo1) {
       initComponents();
       
       rollno = rollNo1;
       
    }
    public ProgressBar() {
        initComponents();
        t1=new pbThead(progress);
        t1.start();
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
                    sleep(20);
                    if(i>=0 && i>=10){
                       
                        progress.setString("Loading Classes...");
                    }
                    if(i>=10 && i>=20){
                       
                        progress.setString("Initalizing...");
                    }
                    if(i>=20 && i<=30){
                      
                        progress.setString("Please Wait...");
                    }
                   
                    if(i>=30 && i<=70){
                       
                        progress.setString("gathering up all files..");
                    }
                    if(i>=70 && i<=90){
                       
                        progress.setString("Almost There..");
                    }
                    if(i>=90 && i<=99)
                    {
                       
                        progress.setString("Completed...");
                    }
                     if(i==100){  
                         Tutorial t=new Tutorial();
                         t.setVisible(true);
                        dispose();
                    }
                }
                catch(Exception e){
                    
                    
                }
               
            }
        }
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 690, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing_Framework_Application/ProgressBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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
            java.util.logging.Logger.getLogger(ProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
