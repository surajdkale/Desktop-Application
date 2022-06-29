/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.duplicatecopyofonline_reservation_stystem;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author SURAJ
 */
public class ReservationSystem extends javax.swing.JFrame {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        
        
    public ReservationSystem() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        conn = JConnector.Connect();
    }
    private void ClearFields(){
        
        pnr.setText("");
        age.setText(null);
        buttonGroup1.clearSelection();;
        Trainnumber.setText(null);
        Trainname.setSelectedIndex(0);
        Classtype.setSelectedIndex(0);
        Capital1.setSelectedIndex(0);
        Capital2.setSelectedIndex(0);
        State1.setSelectedIndex(0);
        State2.setSelectedIndex(0);
        Cityone.setText(null);
        Citytwo.setText(null);
        Date.setCalendar(null);
        name1.setText(null);
        noofpsng.setText(null);
        adult.setText(null);
        child.setText(null);
    }
    
    private void generatePNR(){
        String randNum=RandomStringUtils.randomNumeric(10);
        pnr.setText(randNum);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Trainnumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Citytwo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Classtype = new javax.swing.JComboBox<>();
        State2 = new javax.swing.JComboBox<>();
        Capital2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        State1 = new javax.swing.JComboBox<>();
        Capital1 = new javax.swing.JComboBox<>();
        pnr = new javax.swing.JTextField();
        Cityone = new javax.swing.JTextField();
        Trainname = new javax.swing.JComboBox<>();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sex = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        name1 = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        noofpsng = new javax.swing.JTextField();
        adult = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        child = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 51));
        jLabel2.setText("              Online Train Reservation System");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 24, 1570, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("To");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 49, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel4.setText("Train Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 119, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setText("Class Type :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 119, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setText("Date of Journey");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 171, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, 159, 30));

        Trainnumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Trainnumber.setToolTipText("Automatically Generated After selection Train name");
        Trainnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainnumberActionPerformed(evt);
            }
        });
        getContentPane().add(Trainnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 310, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, 260, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 160, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setText("Train Number :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setText("Name :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 32));

        Citytwo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Citytwo.setText("Enter City/Village");
        Citytwo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CitytwoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CitytwoFocusLost(evt);
            }
        });
        Citytwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CitytwoMouseClicked(evt);
            }
        });
        Citytwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitytwoActionPerformed(evt);
            }
        });
        getContentPane().add(Citytwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 160, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel11.setText("Age : ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 32));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setText("Sex :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 32));

        Classtype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Classtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FC(First Class)", "CC(AC Chair Class)", "SL(Sleeper Class)", "2S(Second Sitting)" }));
        getContentPane().add(Classtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        State2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        State2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        getContentPane().add(State2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        Capital2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Capital2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Capital", "Amaravati", "Itanagar", "Dispur", "Patna", "Raipur", "Gandhinagar", "Chandigarh", "Shimla", "Ranchi", "Bengaluru", "Thiruvananthapuram", "Bhopal", "Mumbai", "Imphal", "Shillong", "Aizawl", "Kohima", "Jaipur", "Gangtok", "Chennai", "Hyderabad", "Agartala", "Lucknow", "Dehradun (Winter)", "Gairsain (Summer)", "Kolkata", "Pune", "Solapur", "Sangli", "Satara", "Thane", "Madha", "Karmala", "Indpaur" }));
        getContentPane().add(Capital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel13.setText("From");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 70, 20));

        State1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        State1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        getContentPane().add(State1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        Capital1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Capital1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Capital", "Amaravati", "Itanagar", "Dispur", "Patna", "Raipur", "Gandhinagar", "Chandigarh", "Shimla", "Ranchi", "Bengaluru", "Thiruvananthapuram", "Bhopal", "Mumbai", "Imphal", "Shillong", "Aizawl", "Kohima", "Jaipur", "Gangtok", "Chennai", "Hyderabad", "Agartala", "Lucknow", "Dehradun (Winter)", "Gairsain (Summer)", "Kolkata", "Pune", "Solapur", "Sangli", "Satara", "Thane", "Madha", "Karmala", "Indpaur" }));
        getContentPane().add(Capital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        pnr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pnr.setForeground(new java.awt.Color(153, 102, 255));
        pnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnrActionPerformed(evt);
            }
        });
        getContentPane().add(pnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 270, 38));

        Cityone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cityone.setText("Enter City/Village");
        Cityone.setToolTipText("Enter City Name");
        Cityone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CityoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CityoneFocusLost(evt);
            }
        });
        Cityone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityoneMouseClicked(evt);
            }
        });
        Cityone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityoneActionPerformed(evt);
            }
        });
        Cityone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CityoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CityoneKeyTyped(evt);
            }
        });
        getContentPane().add(Cityone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 160, 30));

        Trainname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Trainname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Train", "Ajanta Express", "Ahilyanagari Express", "Akal Takht Express", "Ala Hazrat Express", "Amaravati Express", "Amarkantak Express", "Amritha Express", "Ananthapuri Express", "Barak Brahmaputra Express", "Deccan Express", "East Coast Express", "Flying Ranee", "Ganga Kaveri Express", "Goutami Express", "Karnataka Express", "Lok Shakti Express", "Rajdhani Express", "Sahyadri Express" }));
        Trainname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainnameActionPerformed(evt);
            }
        });
        getContentPane().add(Trainname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        Date.setDateFormatString("yyyy-MM-dd\n\n\n");
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 210, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setText("3) You Cannot able to retreive this ticket once it deleted.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 700, 750, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel14.setText("Number Of Passengers :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 220, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel15.setText("Adult :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 70, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setText("Child :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 70, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel17.setText("Create PNR Number -:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 190, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("Rule Before Cancellation Ticket-:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 380, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel19.setText("1) Once Ticket is cacelled New ticket will generated with other charges for current user.");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 750, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel20.setText("2) User Cannot recreate Current Ticket .");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 750, 30));

        sex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sex.setText("Male");
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        female.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        female.setText("Female");
        female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleMouseClicked(evt);
            }
        });
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        other.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        getContentPane().add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 480, 120));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 530, 38));

        age.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 90, 38));

        noofpsng.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noofpsng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofpsngActionPerformed(evt);
            }
        });
        getContentPane().add(noofpsng, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 90, 38));

        adult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultActionPerformed(evt);
            }
        });
        getContentPane().add(adult, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 90, 38));

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel21.setText("What is PNR ?");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 380, 30));

        child.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        child.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childActionPerformed(evt);
            }
        });
        getContentPane().add(child, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 90, 38));

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel22.setText("If you want to cancel the Ticket? Click here->");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 380, 30));

        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextPane1.setText("(Passenger Number Record )PNR is the abbreviation of Passenger Name Record and it is a digital certificate allowing passengers to do online check-in or manage their bookings in a short time. Also used as booking number, Passenger Name Record is a code with 6 alphanumeric characters (letters and numbers are used together).");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 560, 150));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setText("Generate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 290, 260, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TrainnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrainnumberActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new DislpayRecords().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(name1.getText().isEmpty() && age.getText().isEmpty() && sex.getText().isEmpty() && Trainnumber.getText().isEmpty() && Trainname.getSelectedItem()==null && Classtype.getSelectedItem()==null && State1.getSelectedItem()==null && State2.getSelectedItem()==null && Capital1.getSelectedItem()==null && Capital2.getSelectedItem()==null
             && Cityone.getText().isEmpty() && Citytwo.getText().isEmpty() && adult.getText().isEmpty() && child.getText().isEmpty() && pnr.getText().isEmpty() && Date.getDateEditor().getDate()==null){
            JOptionPane.showMessageDialog(null, "Fill in the Blanks");
        }else{
             try{
                Class.forName("com.mysql.jdbc.Driver");
                String sql = "insert into reservation(NAME,AGE,SEX,TRAINNUMBER,TRAINNAME,CLASSTYPE,FROMSTATE,TOSTATE,FROMCAPITAL,TOCAPITAL,FROMCITY,TOCITY,DATES,NOOFPSSNGRS,ADULT,CHILD,PNR)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinereservationsystem","root","");
                 pstmt = conn.prepareStatement(sql);
                 pstmt.setString(1,name1.getText()); 
                 pstmt.setString(2,age.getText());
                 pstmt.setString(3,sex.getText());
                 pstmt.setString(4,Trainnumber.getText());
                 String trainnam = Trainname.getSelectedItem().toString();
                 String classtype = Classtype.getSelectedItem().toString();
                 String state1 = State1.getSelectedItem().toString();
                 String state2 = State2.getSelectedItem().toString();
                 String capital1 = Capital1.getSelectedItem().toString();
                 String capital2 = Capital2.getSelectedItem().toString();
                 pstmt.setString(5,trainnam);
                 pstmt.setString(6,classtype);
                 pstmt.setString(7,state1);
                 pstmt.setString(8,state2);
                 pstmt.setString(9,capital1);
                 pstmt.setString(10,capital2);
                 pstmt.setString(11,Cityone.getText());
                 pstmt.setString(12,Citytwo.getText());
                 pstmt.setString(13,((JTextField)Date.getDateEditor().getUiComponent()).getText());
                 pstmt.setString(14,noofpsng.getText());
                 pstmt.setString(15,adult.getText());
                 pstmt.setString(16,child.getText());
                 pstmt.setString(17,pnr.getText());
                 
                 pstmt.executeUpdate();
                 System.out.println("Succsessfully data inserted!");
                 
                 JOptionPane.showMessageDialog(null,"Thank you for Reservation . Happy Journey!!");
                 ClearFields();
            }catch(SQLException | HeadlessException ex){
                System.out.println("Failed");
                JOptionPane.showMessageDialog(null,ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CitytwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitytwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitytwoActionPerformed

    private void pnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnrActionPerformed

    private void CityoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityoneActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void noofpsngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noofpsngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noofpsngActionPerformed

    private void adultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
          String  sex = "Male";
    }//GEN-LAST:event_sexActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        String sex = "Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
       String sex = "Other";
    }//GEN-LAST:event_otherActionPerformed

    private void TrainnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainnameActionPerformed
            String selectedvalue = Trainname.getSelectedItem().toString();
            String value = selectedvalue;
            if(value =="Ajanta Express"){
                Trainnumber.setText("45962");
            }else
                if(value =="Ahilyanagari Express"){
                    Trainnumber.setText("45756");
                }
            else
                if(value =="Akal Takht Express"){
                    Trainnumber.setText("64567");
                }
            else
                if(value =="Ala Hazrat Express"){
                    Trainnumber.setText("78979");
                }
            else
                if(value =="Amaravati Express"){
                    Trainnumber.setText("35446");
                }
            else
                if(value =="Amarkantak Express"){
                    Trainnumber.setText("89790");
                }
            else
                if(value =="Amritha Express"){
                    Trainnumber.setText("79787");
                }
            else
                if(value =="Ananthapuri Express"){
                    Trainnumber.setText("34577");
                }else
                if(value =="Barak Brahmaputra Express"){
                    Trainnumber.setText("67867");
                }
            else
                if(value =="Deccan Express"){
                    Trainnumber.setText("67867");
                }else
                if(value =="East Coast Express"){
                    Trainnumber.setText("67844");
                }
            else
                if(value =="Flying Ranee "){
                    Trainnumber.setText("64567");
                }
            else
                if(value =="Ganga Kaveri Express"){
                    Trainnumber.setText("88765");
                }
            else
                if(value =="Goutami Express"){
                    Trainnumber.setText("66447");
                }
            else
                if(value =="Karnataka Express"){
                    Trainnumber.setText("96785");
                }
            else
                if(value =="Lok Shakti Express"){
                    Trainnumber.setText("908756");
                }
            else
                if(value =="Rajdhani Express"){
                    Trainnumber.setText("5677");
                }
            else
                if(value =="Sahyadri Express"){
                    Trainnumber.setText("8975");
                }
            
            
        
    }//GEN-LAST:event_TrainnameActionPerformed

    private void childActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CityoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityoneFocusGained
        // TODO add your handling code here:
       Cityone.setText("");
    }//GEN-LAST:event_CityoneFocusGained

    private void CitytwoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CitytwoFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_CitytwoFocusLost

    private void CityoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityoneFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_CityoneFocusLost

    private void CitytwoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CitytwoFocusGained
       Citytwo.setText(null);
       
    }//GEN-LAST:event_CitytwoFocusGained

    private void CityoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityoneMouseClicked
        Cityone.setText("");
    }//GEN-LAST:event_CityoneMouseClicked

    private void CityoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityoneKeyReleased
        
    }//GEN-LAST:event_CityoneKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       generatePNR();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CityoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityoneKeyTyped
     
    }//GEN-LAST:event_CityoneKeyTyped

    private void CitytwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CitytwoMouseClicked
        Citytwo.setText(null);
    }//GEN-LAST:event_CitytwoMouseClicked

    private void femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleMouseClicked
        String sex = "Female";
    }//GEN-LAST:event_femaleMouseClicked

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
            java.util.logging.Logger.getLogger(ReservationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Capital1;
    private javax.swing.JComboBox<String> Capital2;
    private javax.swing.JTextField Cityone;
    private javax.swing.JTextField Citytwo;
    private javax.swing.JComboBox<String> Classtype;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> State1;
    private javax.swing.JComboBox<String> State2;
    private javax.swing.JComboBox<String> Trainname;
    private javax.swing.JTextField Trainnumber;
    private javax.swing.JTextField adult;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField child;
    private javax.swing.JRadioButton female;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField noofpsng;
    private javax.swing.JRadioButton other;
    private javax.swing.JTextField pnr;
    private javax.swing.JRadioButton sex;
    // End of variables declaration//GEN-END:variables
}
