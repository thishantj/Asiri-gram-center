/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asiri_gram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author thishantj
 */
public class update_scale extends javax.swing.JFrame {

    /**
     * Creates new form update_scale
     */
    public update_scale() {
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
        jPanel9 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        txtscalename = new javax.swing.JTextField();
        jLabel_firstName = new javax.swing.JLabel();
        jLabel_parentName = new javax.swing.JLabel();
        cmbstatus = new javax.swing.JComboBox();
        jLabel_dob = new javax.swing.JLabel();
        cmblocation = new javax.swing.JComboBox();
        jLabel_firstName1 = new javax.swing.JLabel();
        jLabel_firstName2 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel_parentName1 = new javax.swing.JLabel();
        cmblicensestatus = new javax.swing.JComboBox();
        jdate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel_lastName = new javax.swing.JLabel();
        txtscaleid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(213, 245, 213));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnupdate.setBackground(new java.awt.Color(255, 255, 204));
        btnupdate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel9.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 140, 50));

        txtscalename.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel9.add(txtscalename, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 750, 50));

        jLabel_firstName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_firstName.setText("Scale name : ");
        jPanel9.add(jLabel_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel_parentName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_parentName.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_parentName.setText("Status");
        jPanel9.add(jLabel_parentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        cmbstatus.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Working", "New", "Broken", "Repairing", "Repaired", " " }));
        jPanel9.add(cmbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 750, 50));

        jLabel_dob.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_dob.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_dob.setText("Current location : ");
        jPanel9.add(jLabel_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        cmblocation.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmblocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stores", "Factory", "IDH", "Eriyawetiya", "Kiribathgoda", "Makola", "Mawaramandiya", "Delgoda", "Kokiskade", "Baththaramulla", "Athurugiriya", "Hendala", "Weliweriya", "Homagama", "Dalugama", "Wenappuwa", "Nagahamula", "Weyangoda", "Maligawatta", "Kaduwela", "Malabe", "Biyagama", "Kolonnawa", "Arangala", "Welisara", "Nugegoda", "Minuwangoda", "Kandana", "Arcade" }));
        jPanel9.add(cmblocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 750, 50));

        jLabel_firstName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName1.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_firstName1.setText("Purchase date :");
        jPanel9.add(jLabel_firstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel_firstName2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_firstName2.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_firstName2.setText("Price :");
        jPanel9.add(jLabel_firstName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpriceKeyTyped(evt);
            }
        });
        jPanel9.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 750, 50));

        jLabel_parentName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_parentName1.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_parentName1.setText("License status");
        jPanel9.add(jLabel_parentName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        cmblicensestatus.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmblicensestatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Licensed", "Not licensed" }));
        jPanel9.add(cmblicensestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 750, 50));

        jdate.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel9.add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 750, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_lastName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_lastName.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_lastName.setText("Scale ID : ");

        txtscaleid.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtscaleid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscaleidActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(204, 255, 255));
        btnsearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-30.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel_lastName)
                .addGap(18, 18, 18)
                .addComponent(txtscaleid, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_lastName)
                    .addComponent(txtscaleid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnhome.setBackground(new java.awt.Color(255, 255, 255));
        btnhome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-48.png"))); // NOI18N
        btnhome.setText("Home");
        btnhome.setBorder(null);
        btnhome.setBorderPainted(false);
        btnhome.setContentAreaFilled(false);
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.setFocusPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=asiri;user=admin;password=123456");
            
            String sql = "update scales set scalename=?, pdate=?, price=?, lstatus=?, status=?, location=? where scaleID = '"+txtscaleid.getText()+"'";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
//            pst.setString(1, txtscaleid.getText() );
            pst.setString(1, txtscalename.getText() );
            pst.setString(2, new SimpleDateFormat("MMM d, yyyy").format(jdate.getDate() ) );
            pst.setString(3, txtprice.getText() );
            pst.setString(4, cmblicensestatus.getSelectedItem().toString() );
            pst.setString(5, cmbstatus.getSelectedItem().toString());
            pst.setString(6, cmblocation.getSelectedItem().toString() );
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updated successfully");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtscaleidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscaleidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtscaleidActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        if(txtscaleid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a scale id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=asiri;user=admin;password=123456");
        
            String sql = "select * from scales where scaleID = ?";
        
        
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, txtscaleid.getText() );
            
            ResultSet rs = pst.executeQuery();
             
            if(rs.next() )
            {
                txtscalename.setText(rs.getString("scalename"));
                jdate.setDate(rs.getDate("pdate"));
                txtprice.setText(rs.getString("price"));
                cmblicensestatus.setSelectedItem("lstatus");
                cmbstatus.setSelectedItem(rs.getString("status"));
                cmblocation.setSelectedItem(rs.getString("location"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No record found");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        
        Homepage h = new Homepage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void txtpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpriceKeyTyped
        
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) && !evt.isAltDown() )
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtpriceKeyTyped

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
            java.util.logging.Logger.getLogger(update_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_scale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmblicensestatus;
    private javax.swing.JComboBox cmblocation;
    private javax.swing.JComboBox cmbstatus;
    private javax.swing.JLabel jLabel_dob;
    private javax.swing.JLabel jLabel_firstName;
    private javax.swing.JLabel jLabel_firstName1;
    private javax.swing.JLabel jLabel_firstName2;
    private javax.swing.JLabel jLabel_lastName;
    private javax.swing.JLabel jLabel_parentName;
    private javax.swing.JLabel jLabel_parentName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtscaleid;
    private javax.swing.JTextField txtscalename;
    // End of variables declaration//GEN-END:variables
}
