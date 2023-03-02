
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NV_SUA_PBH_NHAN extends javax.swing.JFrame {

    private JTable table;
    public NV_SUA_PBH_NHAN(JTable table) {
        this.table = table;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sua_pbh = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maTBH = new javax.swing.JComboBox<>();
        NvTra = new javax.swing.JLabel();
        MaNhan = new javax.swing.JLabel();
        NvNhan = new javax.swing.JLabel();
        ngayNhan = new javax.swing.JLabel();
        ngayTra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        xacnhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sua_pbh.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mã thẻ bảo hành:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ngày trả:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nhân viên nhận:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mã phiếu nhận:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Ngày nhận:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nhân viên trả:");

        maTBH.setBackground(new java.awt.Color(255, 204, 204));
        maTBH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        NvTra.setBackground(new java.awt.Color(0, 0, 0));
        NvTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NvTra.setForeground(new java.awt.Color(255, 255, 255));

        MaNhan.setBackground(new java.awt.Color(0, 0, 0));
        MaNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MaNhan.setForeground(new java.awt.Color(255, 255, 255));

        NvNhan.setBackground(new java.awt.Color(0, 0, 0));
        NvNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NvNhan.setForeground(new java.awt.Color(255, 255, 255));

        ngayNhan.setBackground(new java.awt.Color(0, 0, 0));
        ngayNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngayNhan.setForeground(new java.awt.Color(255, 255, 255));

        ngayTra.setBackground(new java.awt.Color(0, 0, 0));
        ngayTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngayTra.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sua_pbhLayout = new javax.swing.GroupLayout(sua_pbh);
        sua_pbh.setLayout(sua_pbhLayout);
        sua_pbhLayout.setHorizontalGroup(
            sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sua_pbhLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sua_pbhLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NvTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sua_pbhLayout.createSequentialGroup()
                        .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NvNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ngayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ngayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maTBH, 0, 414, Short.MAX_VALUE))))
                .addGap(116, 116, 116))
        );
        sua_pbhLayout.setVerticalGroup(
            sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sua_pbhLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maTBH, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NvNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NvTra, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(sua_pbhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_tbh();
        try{
            while(rs.next()){
                maTBH.addItem(rs.getString(1));
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        xacnhan.setBackground(new java.awt.Color(0, 153, 255));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xacnhan.setForeground(new java.awt.Color(255, 255, 0));
        xacnhan.setLabel("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xacnhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sua_pbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sua_pbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        String tbh = maTBH.getSelectedItem().toString();
        System.out.println(tbh);
        String id_nhan = new QuanLyBaoHanh().getId_xoa();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không, không thể hoàn tác", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.nv_updates_pbh_nhan(tbh, id_nhan);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Hoàn tất chỉnh sửa", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                this.setVisible(false);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                ResultSet rs = conn.ds_pbh_nhan();
                try {
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyBaoHanh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
        }
    }//GEN-LAST:event_xacnhanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NV_SUA_PBH_NHAN(new QuanLyBaoHanh().getTable()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaNhan;
    private javax.swing.JLabel NvNhan;
    private javax.swing.JLabel NvTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> maTBH;
    private javax.swing.JLabel ngayNhan;
    private javax.swing.JLabel ngayTra;
    private javax.swing.JPanel sua_pbh;
    private javax.swing.JButton xacnhan;
    // End of variables declaration//GEN-END:variables
}
