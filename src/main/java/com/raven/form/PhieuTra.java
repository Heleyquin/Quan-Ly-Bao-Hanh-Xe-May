
package com.raven.form;

import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PhieuTra extends javax.swing.JFrame {

    private JTable table;
    private static String tk = new com.raven.main.WelcomeJFrame().getTK();
    public PhieuTra(JTable table) {
        this.setUndecorated(true);
        this.table = table;
        initComponents();
        nVTra.setText(tk);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mapn = new javax.swing.JLabel();
        nVTra = new javax.swing.JLabel();
        moTa = new javax.swing.JTextField();
        xacnhan = new javax.swing.JButton();
        clock1 = new com.raven.component.Clock();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thông tin phiếu trả");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 6, 226, 43));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mô tả thêm:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 182, 46));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mã phiếu nhận:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 46));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nhân viên trả:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 182, 46));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Thời gian trả:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 182, 46));

        mapn.setBackground(new java.awt.Color(204, 204, 255));
        mapn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mapn.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mapn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 560, 50));

        nVTra.setBackground(new java.awt.Color(204, 204, 255));
        nVTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nVTra.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nVTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 560, 50));

        moTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        moTa.setPreferredSize(new java.awt.Dimension(105, 25));
        jPanel1.add(moTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 560, 50));

        xacnhan.setBackground(new java.awt.Color(255, 51, 51));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xacnhan.setText("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });
        jPanel1.add(xacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 40));

        clock1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(clock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 560, 40));

        thoat.setBackground(new java.awt.Color(102, 153, 255));
        thoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        jPanel1.add(thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setMapn(String maPN){
        this.mapn.setText(maPN);
    }
    public String getMapn(){
        return this.mapn.getText();
    }
    
    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        int phieuNhan = Integer.parseInt(mapn.getText());
        String nv = nVTra.getText();
        Date tg = clock1.getDate();
        String mota = moTa.getText();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không, không thể hoàn tác", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.them_phieu_tra(phieuNhan, tg, mota,nv);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Hoàn tất chỉnh sửa", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                ResultSet rs = conn.ds_pbh_nhan();
                try {
                    while (rs.next()) {
                        this.dispose();
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBaoHanh.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }//GEN-LAST:event_xacnhanActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_thoatActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuTra(new QuanLyBaoHanh().getTable()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Clock clock1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel mapn;
    private javax.swing.JTextField moTa;
    private javax.swing.JLabel nVTra;
    private javax.swing.JButton thoat;
    private javax.swing.JButton xacnhan;
    // End of variables declaration//GEN-END:variables
}
