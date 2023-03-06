
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modelXe extends javax.swing.JPanel {

    private static String model;
    public modelXe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textModel = new javax.swing.JLabel();
        textLoai = new javax.swing.JLabel();
        textKl = new javax.swing.JLabel();
        textCao = new javax.swing.JLabel();
        textDai = new javax.swing.JLabel();
        textRong = new javax.swing.JLabel();
        textTen = new javax.swing.JLabel();
        textDt = new javax.swing.JLabel();
        textDongCo = new javax.swing.JLabel();
        backButton = new RSComponentShade.RSButtonShade();

        setBackground(new java.awt.Color(255, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Loại xe");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 69, 90, 45));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Khối lượng");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 120, 117, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Dài");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 174, 117, 44));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Rộng");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 224, 117, 46));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cao");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 280, 125, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Dung tích");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 326, 125, 46));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Loại động cơ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 379, 125, 43));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Tên xe");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 434, 125, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Model");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 6, 86, 57));

        textModel.setBackground(new java.awt.Color(255, 153, 153));
        textModel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textModel.setOpaque(true);
        add(textModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 6, 343, 57));

        textLoai.setBackground(new java.awt.Color(255, 255, 153));
        textLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 69, 322, 45));

        textKl.setBackground(new java.awt.Color(255, 153, 153));
        textKl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textKl, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 120, 322, 48));

        textCao.setBackground(new java.awt.Color(255, 153, 153));
        textCao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 276, 322, 44));

        textDai.setBackground(new java.awt.Color(255, 153, 153));
        textDai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textDai, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 174, 322, 44));

        textRong.setBackground(new java.awt.Color(255, 153, 153));
        textRong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textRong, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 226, 322, 44));

        textTen.setBackground(new java.awt.Color(255, 153, 153));
        textTen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 430, 322, 44));

        textDt.setBackground(new java.awt.Color(255, 153, 153));
        textDt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 328, 322, 44));

        textDongCo.setBackground(new java.awt.Color(255, 153, 153));
        textDongCo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(textDongCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 380, 322, 44));

        backButton.setBackground(new java.awt.Color(153, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/goback2.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 3, 66, 51));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Xe xeI = new Xe();
        Main main = new Main();
        main.getMain().setForm(xeI);
        main.setStatusXe(0);
    }//GEN-LAST:event_backButtonActionPerformed

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void fillText(){
        textModel.setText(model);
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.xem_model(model);
        try {
            while(rs.next()){
                textLoai.setText(rs.getString(2));
                textKl.setText(rs.getString(3));
                textDai.setText(rs.getString(4));
                textRong.setText(rs.getString(5));
                textCao.setText(rs.getString(6));
                textDt.setText(rs.getString(7));
                textDongCo.setText(rs.getString(8));
                textTen.setText(rs.getString(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelXe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSComponentShade.RSButtonShade backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel textCao;
    private javax.swing.JLabel textDai;
    private javax.swing.JLabel textDongCo;
    private javax.swing.JLabel textDt;
    private javax.swing.JLabel textKl;
    private javax.swing.JLabel textLoai;
    private javax.swing.JLabel textModel;
    private javax.swing.JLabel textRong;
    private javax.swing.JLabel textTen;
    // End of variables declaration//GEN-END:variables
}
