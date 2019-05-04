
package gui;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;


public class Add_med extends javax.swing.JFrame {

    String user;
    
    public void getUser(String u)
    {
        user = u;
        
        String meds;
        String uname = "kratos";
        String upass = "kratos123";
        String host = "jdbc:derby://localhost:1527/proj";
        
        try {
            Connection con = DriverManager.getConnection(host,uname,upass);
            String sql = "SELECT * FROM meds WHERE username='"+user+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                meds = rs.getString("medicine");
                Meds.setText(meds);

            }
        } catch (SQLException ex) {
            showMessageDialog(null, ex.getMessage());
        }
    }
    
    public Add_med() {
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
        BackBtn = new javax.swing.JButton();
        ReportBtn = new javax.swing.JButton();
        GenerateBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Meds = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Record Management System");
        setLocation(new java.awt.Point(240, 30));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main_welcome_header.png"))); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        label1.setText("Prescribed Medicines");

        jButton5.setText("jButton5");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        BackBtn.setBorderPainted(false);
        BackBtn.setContentAreaFilled(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ReportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_report.png"))); // NOI18N
        ReportBtn.setBorderPainted(false);
        ReportBtn.setContentAreaFilled(false);
        ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtnActionPerformed(evt);
            }
        });

        GenerateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gen_report.png"))); // NOI18N
        GenerateBtn.setBorderPainted(false);
        GenerateBtn.setContentAreaFilled(false);
        GenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackBtn)
                    .addComponent(ReportBtn)
                    .addComponent(GenerateBtn))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReportBtn)
                .addGap(51, 51, 51)
                .addComponent(GenerateBtn)
                .addGap(68, 68, 68)
                .addComponent(BackBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        UpdateBtn.setBorderPainted(false);
        UpdateBtn.setContentAreaFilled(false);
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        Meds.setEditable(false);
        Meds.setColumns(20);
        Meds.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Meds.setRows(5);
        jScrollPane2.setViewportView(Meds);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(UpdateBtn)
                                        .addGap(215, 215, 215))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97))))))
                    .addComponent(jLabel1))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn)
                        .addGap(39, 39, 39))))
        );

        label1.getAccessibleContext().setAccessibleName("Prescribed Medicines");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        welcome_main m = new welcome_main();
        m.getUser(user);
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        Update_med u = new Update_med();
        u.getUser(user);
        u.setVisible(true);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void GenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateBtnActionPerformed
        Generate_Report g = new Generate_Report();
        g.getUser(user);
        this.setVisible(false);
        g.setVisible(true);
    }//GEN-LAST:event_GenerateBtnActionPerformed

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtnActionPerformed
        Health_report h = new Health_report();
        h.getUser(user);
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_ReportBtnActionPerformed


    
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
            java.util.logging.Logger.getLogger(Add_med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_med.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_med().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton GenerateBtn;
    private javax.swing.JTextArea Meds;
    private javax.swing.JButton ReportBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
