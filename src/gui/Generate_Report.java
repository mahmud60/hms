/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author Tusher
 */
public class Generate_Report extends javax.swing.JFrame {

    String file;
    String user;
    
    public void getUser(String u)
    {
        user = u;
    }
    
    public Generate_Report() {
        initComponents();
        setIcon();
    }

    private void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ReportBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        MedsBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        StartDate = new com.toedter.calendar.JDateChooser();
        EndDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Record Management System");
        setLocation(new java.awt.Point(250, 30));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main_welcome_header.png"))); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        label1.setText("Generate Report");

        jButton5.setText("jButton5");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        ReportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_report.png"))); // NOI18N
        ReportBtn.setText(" ");
        ReportBtn.setBorderPainted(false);
        ReportBtn.setContentAreaFilled(false);
        ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtnActionPerformed(evt);
            }
        });

        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        BackBtn.setBorderPainted(false);
        BackBtn.setContentAreaFilled(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        MedsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medicine.png"))); // NOI18N
        MedsBtn.setBorderPainted(false);
        MedsBtn.setContentAreaFilled(false);
        MedsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReportBtn)
                    .addComponent(BackBtn)
                    .addComponent(MedsBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ReportBtn)
                .addGap(53, 53, 53)
                .addComponent(MedsBtn)
                .addGap(77, 77, 77)
                .addComponent(BackBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setText("Generate Doc File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel2.setText("Starting Date");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setText("Ending Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(StartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(StartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(EndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        welcome_main m = new welcome_main();
        m.getUser(user);
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFrame parentFrame = new JFrame();
 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            file = fileToSave.getAbsolutePath();
            generate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MedsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedsBtnActionPerformed
        Add_med a = new Add_med();
        a.getUser(user);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_MedsBtnActionPerformed

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtnActionPerformed
        Health_report h = new Health_report();
        h.getUser(user);
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_ReportBtnActionPerformed

    private void generate()
    {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String host = "jdbc:derby://localhost:1527/proj";
        String uname = "kratos";
        String upass = "kratos123";
        
        java.util.Date date = StartDate.getDate();
        java.util.Date date1 = EndDate.getDate();
        String sdate = DateFormat.getDateInstance().format(date);
        String edate = DateFormat.getDateInstance().format(date1);
        
        try {

            XWPFDocument document= new XWPFDocument();
            XWPFTable table = document.createTable();
            Connection con = DriverManager.getConnection(host,uname,upass);
            Statement stmt = con.createStatement();
            String sql = "SELECT * from reports WHERE name='"+user+"' and date BETWEEN '"+sdate+"' and '"+edate+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            XWPFTableRow tableRowOne = table.getRow(0);
            tableRowOne.getCell(0).setText("Sugar Level");
            tableRowOne.addNewTableCell().setText("Blood Pressure");
            tableRowOne.addNewTableCell().setText("Time");
            tableRowOne.addNewTableCell().setText("Date");
            
            
            while(rs.next())
            {
                
                String sugar = rs.getString("sugar");
                String blood = rs.getString("blood");
                String d = rs.getString("date");
                String t = rs.getString("time");
                
                XWPFTableRow r = table.createRow();
                r.getCell(0).setText(sugar);
                r.getCell(1).setText(blood);
                r.getCell(3).setText(d);
                r.getCell(2).setText(t);
                
                FileOutputStream out;
                try {
                    out = new FileOutputStream(file+".docx");
                    document.write(out);
                    out.close();
                } catch (FileNotFoundException ex) {
                    showMessageDialog(null, "ERROR SAVING FILE!");
                } catch (IOException ex) {
                    Logger.getLogger(Generate_Report.class.getName()).log(Level.SEVERE, null, ex);
                }              
            }
            this.setCursor(Cursor.getDefaultCursor());
            showMessageDialog(null, "Report Saved");
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage());
        } 
    }
    
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
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Generate_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private com.toedter.calendar.JDateChooser EndDate;
    private javax.swing.JButton MedsBtn;
    private javax.swing.JButton ReportBtn;
    private com.toedter.calendar.JDateChooser StartDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
