
package com.raven.form;

import connectToSQL.connectSQL;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.regex.*;
import javax.swing.JOptionPane;
public class doiPass extends javax.swing.JPanel {

    /**
     * Creates new form doiPass
     */
    public doiPass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_doiPass = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xacnhan = new rojeru_san.rsbutton.RSButtonMetro();
        saiPassCu = new javax.swing.JLabel();
        saiDinhDang = new javax.swing.JLabel();
        saiPassMoi = new javax.swing.JLabel();
        mkcu = new rojeru_san.rsfield.RSPassViewRound();
        mkmoi_nhaplai = new rojeru_san.rsfield.RSPassViewRound();
        mkmoi = new rojeru_san.rsfield.RSPassViewRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form_doiPass.setBackground(new java.awt.Color(204, 204, 255));
        form_doiPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nhập lại mật khẩu mới:");
        form_doiPass.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu cũ:");
        form_doiPass.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 210, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mật khẩu mới:");
        form_doiPass.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, 40));

        xacnhan.setBackground(new java.awt.Color(51, 153, 255));
        xacnhan.setForeground(new java.awt.Color(0, 0, 0));
        xacnhan.setText("Xác nhận");
        xacnhan.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });
        form_doiPass.add(xacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, 60));

        saiPassCu.setForeground(new java.awt.Color(255, 0, 51));
        form_doiPass.add(saiPassCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 320, 20));

        saiDinhDang.setForeground(new java.awt.Color(255, 0, 0));
        form_doiPass.add(saiDinhDang, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 330, 20));

        saiPassMoi.setForeground(new java.awt.Color(255, 0, 0));
        form_doiPass.add(saiPassMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 330, 20));

        mkcu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mkcu.setPhColor(new java.awt.Color(153, 153, 255));
        mkcu.setPlaceholder("A-z, 0-9, 1-20 kí tự");
        form_doiPass.add(mkcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 310, -1));

        mkmoi_nhaplai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mkmoi_nhaplai.setPhColor(new java.awt.Color(102, 102, 255));
        mkmoi_nhaplai.setPlaceholder("A-z, 0-9, 1-20 kí tự");
        form_doiPass.add(mkmoi_nhaplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 310, -1));

        mkmoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mkmoi.setPhColor(new java.awt.Color(102, 102, 255));
        mkmoi.setPlaceholder("A-z, 0-9, 1-20 kí tự");
        form_doiPass.add(mkmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 310, -1));

        add(form_doiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 780, 340));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NHẬP THÔNG TIN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        String regex = "^[A-Za-z0-9]{1,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher mat = pattern.matcher(String.valueOf(mkcu.getPassword()));
        int chon = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn đổi mật khẩu không", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            if (new com.raven.main.WelcomeJFrame().getMK().equals(String.valueOf(mkcu.getPassword())) == false) {
                saiDinhDang.setText(null);
                saiPassMoi.setText(null);
                saiPassCu.setText("Sai mật khảu");
            } else if (mat.matches() == false) {
                saiDinhDang.setText("Mật khẩu sai định dạng");
                saiPassMoi.setText(null);
                saiPassCu.setText(null);
            } else if (Arrays.equals(mkcu.getPassword(),mkmoi_nhaplai.getPassword())) {
                saiDinhDang.setText(null);
                saiPassMoi.setText("Mật khẩu nhập lại không đúng");
                saiPassCu.setText(null);
            } else {
                saiDinhDang.setText(null);
                saiPassMoi.setText(null);
                saiPassCu.setText(null);
                try {
                    connectSQL conn = new connectSQL();
                    ResultSet rs = conn.updatePass(String.valueOf(mkmoi.getPassword()));
                    rs.next();
                    int result = rs.getInt(1);
                    if (result == 1) {
                        JOptionPane.showMessageDialog(null, "Thay đổi mật khẩu thành công", "Thành công", JOptionPane.OK_OPTION);
                        new com.raven.main.WelcomeJFrame().setMK(String.valueOf(mkmoi.getPassword()));
                    }else{
                        JOptionPane.showMessageDialog(null, "Thay đổi mật khẩu không thành công", "Thất bại", JOptionPane.OK_OPTION);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            mkcu.setText(null);
            mkmoi_nhaplai.setText(null);
            mkmoi.setText(null);
        }else {
            mkcu.setText(null);
            mkmoi_nhaplai.setText(null);
            mkmoi.setText(null);
        }
    }//GEN-LAST:event_xacnhanActionPerformed
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#86A8E7"), 0, getHeight(), Color.decode("#91EAE4"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth(), 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel form_doiPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.rsfield.RSPassViewRound mkcu;
    private rojeru_san.rsfield.RSPassViewRound mkmoi;
    private rojeru_san.rsfield.RSPassViewRound mkmoi_nhaplai;
    private javax.swing.JLabel saiDinhDang;
    private javax.swing.JLabel saiPassCu;
    private javax.swing.JLabel saiPassMoi;
    private rojeru_san.rsbutton.RSButtonMetro xacnhan;
    // End of variables declaration//GEN-END:variables
}
