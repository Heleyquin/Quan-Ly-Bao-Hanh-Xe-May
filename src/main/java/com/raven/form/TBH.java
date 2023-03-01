
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TBH extends javax.swing.JPanel {

    public TBH() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardTBH = new javax.swing.JPanel();
        mathebaohanh = new javax.swing.JLabel();
        ngaykichhoat = new javax.swing.JLabel();
        ngayhethan = new javax.swing.JLabel();
        remain = new javax.swing.JLabel();
        remainTime = new javax.swing.JLabel();
        mathebaohanh1 = new javax.swing.JLabel();
        ngaykichhoat1 = new javax.swing.JLabel();
        ngayhethan1 = new javax.swing.JLabel();
        khungXe = new rojeru_san.rsfield.RSTextFullRound();
        search = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardTBH.setBackground(new java.awt.Color(255, 255, 204));
        cardTBH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mathebaohanh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mathebaohanh.setForeground(new java.awt.Color(255, 0, 51));
        cardTBH.add(mathebaohanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 310, 44));

        ngaykichhoat.setBackground(new java.awt.Color(255, 0, 51));
        ngaykichhoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngaykichhoat.setForeground(new java.awt.Color(255, 0, 51));
        cardTBH.add(ngaykichhoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 310, 44));

        ngayhethan.setBackground(new java.awt.Color(255, 0, 51));
        ngayhethan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngayhethan.setForeground(new java.awt.Color(255, 0, 0));
        cardTBH.add(ngayhethan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 280, 44));

        remain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        remain.setText("CÒN LẠI:");
        remain.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cardTBH.add(remain, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 84, 39));

        remainTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        remainTime.setForeground(new java.awt.Color(255, 0, 51));
        remainTime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cardTBH.add(remainTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 153, 39));

        mathebaohanh1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mathebaohanh1.setText("MÃ THẺ BẢO HÀNH:");
        cardTBH.add(mathebaohanh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 44));

        ngaykichhoat1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ngaykichhoat1.setText("NGÀY KÍCH HOẠT BẢO HÀNH:");
        cardTBH.add(ngaykichhoat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 44));

        ngayhethan1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ngayhethan1.setText("NGÀY HẾT HẠN BẢO HÀNH:");
        cardTBH.add(ngayhethan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 44));

        add(cardTBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 791, 311));

        khungXe.setForeground(new java.awt.Color(0, 0, 0));
        khungXe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        khungXe.setPhColor(new java.awt.Color(204, 204, 204));
        khungXe.setPlaceholder("Số khung xe");
        add(khungXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 5, 710, 45));

        search.setBackground(new java.awt.Color(153, 255, 255));
        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 5, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String kx = khungXe.getText();
        ResultSet rs = null;
        connectSQL conn = new connectSQL();
        rs = conn.kiem_tra_bh(kx);
        try {
            while(rs.next()){
                mathebaohanh.setText(rs.getString(1));
                ngaykichhoat.setText(rs.getString(3));
                ngayhethan.setText(rs.getString(4));
                if (rs.getInt(5) < 0){
                    remainTime.setText("ĐÃ HẾT HẠN");
                }
                else{remainTime.setText(rs.getString(5) + " ngày");}
//                mathebaohanh.getText();
//                ngaykichhoat.setText(rs.getString(2));
//                ngayhethan.setText(rs.getString(1));
//                remainTime.setText(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TBH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

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
    private javax.swing.JPanel cardTBH;
    private rojeru_san.rsfield.RSTextFullRound khungXe;
    private javax.swing.JLabel mathebaohanh;
    private javax.swing.JLabel mathebaohanh1;
    private javax.swing.JLabel ngayhethan;
    private javax.swing.JLabel ngayhethan1;
    private javax.swing.JLabel ngaykichhoat;
    private javax.swing.JLabel ngaykichhoat1;
    private javax.swing.JLabel remain;
    private javax.swing.JLabel remainTime;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
