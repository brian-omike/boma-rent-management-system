/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boma_Rentals;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.swing.JTextArea;

/**
 *
 * @author brian
 */
public class Boma_Rentals extends javax.swing.JFrame {

    /**
     * Creates new form Boma_Rentals
     */
    public Boma_Rentals() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtCustomer = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jtxtTown = new javax.swing.JTextField();
        jtxtDownPayment = new javax.swing.JTextField();
        jtxtDeposit = new javax.swing.JTextField();
        jcmbProofofID = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jtxtCost = new javax.swing.JTextField();
        jcmbNumberofRooms = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jrtReceipt = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtxtElectricity = new javax.swing.JTextField();
        jtxtWaterBill = new javax.swing.JTextField();
        jtxtLocalTax = new javax.swing.JTextField();
        jtxtTotalPayment = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Rent Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\brian\\Pictures\\Instagram_files\\106353161_363434541290540_5933614052277401146_n.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 20, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1320, 110));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Proof Of ID");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Customer Details");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Customer ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Firstname");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Surname");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Post Code");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Town");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Down Payment");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Deposit");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));
        jPanel2.add(jtxtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 30));
        jPanel2.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, 30));
        jPanel2.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 150, 130, 30));
        jPanel2.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, 30));
        jPanel2.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 140, 30));
        jPanel2.add(jtxtTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 150, 140, 30));
        jPanel2.add(jtxtDownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 100, 30));
        jPanel2.add(jtxtDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 140, 30));

        jcmbProofofID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcmbProofofID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilot License", "Driving License", "Student ID", "Passport " }));
        jPanel2.add(jcmbProofofID, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 850, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Rental Details");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Flat");
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("House");
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Number of Rooms");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Location");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Cost");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thika", "Juja", "Kahawa", "Roysambu", "Ruiru" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 181, 140, 30));

        jtxtCost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jtxtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 140, 30));

        jcmbNumberofRooms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcmbNumberofRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel3.add(jcmbNumberofRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 310));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrtReceipt.setColumns(20);
        jrtReceipt.setRows(5);
        jScrollPane1.setViewportView(jrtReceipt);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 360));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 460, 410));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Utility Bills");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 20, 200, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Electricity");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Local Tax");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Water Bill");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Total Payment");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jtxtElectricity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jtxtElectricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 120, 30));

        jtxtWaterBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jtxtWaterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, 30));

        jtxtLocalTax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jtxtLocalTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, 30));

        jtxtTotalPayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jtxtTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 420, 310));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Rental");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, -1, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 35, 80, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 35, 70, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 33, 80, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 460, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Rent Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            JTextField cleartext = null;
        
        for (Component c:jPanel2.getComponents()){
        if (c.getClass().toString().contains("javax.swing.JTextField")){
            cleartext =(JTextField)c;
            cleartext.setText("");
            jtxtCost.setText("");
            jrtReceipt.setText("");
    }
    }       
        //==========================================
        for (Component c:jPanel5.getComponents()){
        if (c.getClass().toString().contains("javax.swing.JTextField")){
            cleartext =(JTextField)c;
            cleartext.setText("");
    }
    }
        //==========================================
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cCustomer iCustomer = new cCustomer();
        cRental iRental = new cRental();
        cUtilities iUtilities = new cUtilities();
        
        double iCustDeposit, iCustPayment, icost, inumberofroom, ilocalTax, iwaterBill, ielectricity;
        String strCost;
        
        iCustDeposit = Double.parseDouble(jtxtDeposit.getText());
        iCustPayment = Double.parseDouble(jtxtDownPayment.getText());
        icost = Double.parseDouble(jtxtCost.getText());
        
        ielectricity = Double.parseDouble(jtxtElectricity.getText());
        iwaterBill = Double.parseDouble(jtxtWaterBill.getText());
        ilocalTax = Double.parseDouble(jtxtCost.getText());
   
        
        iCustomer.setDeposit(iCustDeposit);
        iCustomer.setDownPayment(iCustPayment);
        iRental.setCost(icost);
        iUtilities.setElectricity(ielectricity);
        iUtilities.setLocalTax(ilocalTax);
        iUtilities.setWaterBill(iwaterBill);
        
        strCost = String.format("KSh%.2f", iCustomer.getDeposit() + iCustomer.getDownPayment() + iRental.getCost() + 
                iUtilities.getElectricity() + iUtilities.getLocalTax() + iUtilities.getWaterBill());
        jtxtTotalPayment.setText(strCost);
        
        jrtReceipt.append("\tRent Management System" + "\n" + 
        "----------------------------------------------------------------------------------------" + "\n");
        jrtReceipt.append("Customer ID" + "\t\t\t" + jtxtCustomer.getText() + "\n");
        jrtReceipt.append("Firstname" + "\t\t\t" + jtxtFirstname.getText() + "\n");
        jrtReceipt.append("Surname" + "\t\t\t" + jtxtSurname.getText() + "\n");
        jrtReceipt.append("Address" + "\t\t\t" + jtxtAddress.getText() + "\n");
        jrtReceipt.append("Post Code" + "\t\t\t" + jtxtPostCode.getText() + "\n");
        jrtReceipt.append("Proof of ID" + "\t\t\t" + jcmbProofofID.getSelectedItem() + "\n");
        jrtReceipt.append("Town" + "\t\t\t" + jtxtTown.getText() + "\n");
        jrtReceipt.append("-------------------------------------------------------------------------" + "\n");
        jrtReceipt.append("Deposit" + "\t\t\t" + jtxtDeposit.getText() + "\n");
        jrtReceipt.append("Down Payment" + "\t\t\t" + jtxtDownPayment.getText() + "\n");
        jrtReceipt.append("Number of Rooms" + "\t\t" + jcmbNumberofRooms.getSelectedItem() + "\n");
        
        jrtReceipt.append("Electricity" + "\t\t\t" + jtxtElectricity.getText() + "\n");
        jrtReceipt.append("Local Tax" + "\t\t\t" + jtxtLocalTax.getText() + "\n");
        jrtReceipt.append("Water Bill" + "\t\t\t" + jtxtWaterBill.getText() + "\n");
        jrtReceipt.append("------------------------------------------------------------------------------------------" + "\n");
        jrtReceipt.append("Total Payment" + "\t\t\t" + jtxtTotalPayment.getText() + "\n");
        jrtReceipt.append("------------------------------------------------------------------------------------------" + "\n");
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            
            jrtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Boma_Rentals.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Boma_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boma_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boma_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boma_Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boma_Rentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmbNumberofRooms;
    private javax.swing.JComboBox<String> jcmbProofofID;
    private javax.swing.JTextArea jrtReceipt;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCost;
    private javax.swing.JTextField jtxtCustomer;
    private javax.swing.JTextField jtxtDeposit;
    private javax.swing.JTextField jtxtDownPayment;
    private javax.swing.JTextField jtxtElectricity;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtLocalTax;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalPayment;
    private javax.swing.JTextField jtxtTown;
    private javax.swing.JTextField jtxtWaterBill;
    // End of variables declaration//GEN-END:variables
}
