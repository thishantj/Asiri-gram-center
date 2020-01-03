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
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author thishantj
 */
public class view_scale extends javax.swing.JFrame {

    /**
     * Creates new form view_scale
     */
    public view_scale() {
        initComponents();
        
        tableload();
    }

    public void tableload(){
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asiri","root","admin");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=asiri;user=admin;password=123456");
            
            PreparedStatement pst = null;
            ResultSet res = null;
            
            String sql = "SELECT * FROM scales";
            pst = con.prepareStatement(sql);
            res = pst.executeQuery();
            
            scaleTable.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch (Exception e){
            System.out.println(e);
        }
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
        btnhome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_lastName = new javax.swing.JLabel();
        txtscaleid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel_lastName1 = new javax.swing.JLabel();
        cmblstatus = new javax.swing.JComboBox();
        cmbstatus = new javax.swing.JComboBox();
        cmblocation = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        scaleTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 219, 232));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_lastName.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_lastName.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_lastName.setText("Filter by : ");

        txtscaleid.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txtscaleid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtscaleidActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(204, 255, 255));
        btnsearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel_lastName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel_lastName1.setForeground(new java.awt.Color(132, 132, 132));
        jLabel_lastName1.setText("Scale ID : ");

        cmblstatus.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmblstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "License status", "Licensed", "Not licensed" }));
        cmblstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmblstatusItemStateChanged(evt);
            }
        });

        cmbstatus.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Working", "New", "Broken", "Repairing", "Repaired" }));
        cmbstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbstatusItemStateChanged(evt);
            }
        });

        cmblocation.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        cmblocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Location", "Stores", "Factory", "IDH", "Eriyawetiya", "Kiribathgoda", "Makola", "Mawaramandiya", "Delgoda", "Kokiskade", "Baththaramulla", "Athurugiriya", "Hendala", "Weliweriya", "Homagama", "Dalugama", "Wenappuwa", "Nagahamula", "Weyangoda", "Maligawatta", "Kaduwela", "Malabe", "Biyagama", "Kolonnawa", "Arangala", "Welisara", "Nugegoda", "Minuwangoda", "Kandana", "Arcade" }));
        cmblocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmblocationItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_lastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmblocation, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtscaleid, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel_lastName1)
                    .addContainerGap(621, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtscaleid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmblstatus)
                        .addComponent(cmbstatus)
                        .addComponent(cmblocation))
                    .addComponent(jLabel_lastName))
                .addGap(8, 8, 8))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel_lastName1)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        scaleTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scaleTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scaleTable.setRowHeight(40);
        scaleTable.setRowMargin(5);
        jScrollPane1.setViewportView(scaleTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnprint.setBackground(new java.awt.Color(212, 133, 212));
        btnprint.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        btnprint.setText("Print");
        btnprint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed

        Homepage h = new Homepage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        if(txtscaleid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a scale id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{

            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/asiri","root","admin");
                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=asiri;user=admin;password=123456");

                PreparedStatement pst = null;
                ResultSet res = null;
                String search = txtscaleid.getText();

                String sql = "Select * from scales where scaleID LIKE '%"+search+"%' ";

                pst = con.prepareStatement(sql);
                res = pst.executeQuery();

                scaleTable.setModel(DbUtils.resultSetToTableModel(res));

            }

            catch (Exception e){

            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtscaleidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtscaleidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtscaleidActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try{
            scaleTable.print();
        }
        catch (Exception e){
          System.out.println(e);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void cmblstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmblstatusItemStateChanged
        String query = cmblstatus.getSelectedItem().toString();
        
        filterlstatus(query);
    }//GEN-LAST:event_cmblstatusItemStateChanged

    private void cmbstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbstatusItemStateChanged
        String query = cmbstatus.getSelectedItem().toString();
        
        filterstatus(query);
    }//GEN-LAST:event_cmbstatusItemStateChanged

    private void cmblocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmblocationItemStateChanged
        String query = cmblocation.getSelectedItem().toString();
        
        filterlocation(query);
    }//GEN-LAST:event_cmblocationItemStateChanged

    public void filterlstatus(String query){
        DefaultTableModel dtm = (DefaultTableModel) scaleTable.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        scaleTable.setRowSorter(tr);
        
        if(query != "License status"){
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    
    public void filterstatus(String query){
        DefaultTableModel dtm = (DefaultTableModel) scaleTable.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        scaleTable.setRowSorter(tr);
        
        if(query != "Status"){
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    
    public void filterlocation(String query){
        DefaultTableModel dtm = (DefaultTableModel) scaleTable.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        scaleTable.setRowSorter(tr);
        
        if(query != "Location"){
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    
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
            java.util.logging.Logger.getLogger(view_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_scale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_scale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cmblocation;
    private javax.swing.JComboBox cmblstatus;
    private javax.swing.JComboBox cmbstatus;
    private javax.swing.JLabel jLabel_lastName;
    private javax.swing.JLabel jLabel_lastName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scaleTable;
    private javax.swing.JTextField txtscaleid;
    // End of variables declaration//GEN-END:variables
}
