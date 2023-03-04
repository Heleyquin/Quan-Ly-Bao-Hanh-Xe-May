package com.raven.component;

import com.raven.model.Nhan_Vien;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Card extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }

    public void setData(Nhan_Vien data) {
        lbIcon.setIcon(data.getIcon());
        lbName.setText(data.getName());
        lbCCCD.setText(data.getMail());
        lbNgaySinh.setText(data.getNgaySinh());
        lbSDT.setText(data.getSDT());
        lbGioi.setText(data.getGioi());
        lbNgayVao.setText(data.getNgayVao());
        lbQuyen.setText(data.getQuyen());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        lbQuyen = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbGioi = new javax.swing.JLabel();
        lbNgayVao = new javax.swing.JLabel();
        lbName1 = new javax.swing.JLabel();
        lbCCCD1 = new javax.swing.JLabel();
        lbNgaySinh1 = new javax.swing.JLabel();
        lbSDT1 = new javax.swing.JLabel();
        lbGioi1 = new javax.swing.JLabel();
        lbNgayVao1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/stock.png"))); // NOI18N

        lbName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Name");

        lbCCCD.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD.setText("CCCD");

        lbQuyen.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbQuyen.setForeground(new java.awt.Color(255, 255, 255));
        lbQuyen.setText("Quyền");

        lbNgaySinh.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh.setText("Ngày Sinh");

        lbSDT.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(255, 255, 255));
        lbSDT.setText("Số điện thoại");

        lbGioi.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbGioi.setForeground(new java.awt.Color(255, 255, 255));
        lbGioi.setText("Giới tính");

        lbNgayVao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbNgayVao.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayVao.setText("Ngày vào làm");

        lbName1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbName1.setForeground(new java.awt.Color(255, 255, 255));
        lbName1.setText("HỌ TÊN");

        lbCCCD1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbCCCD1.setForeground(new java.awt.Color(255, 255, 255));
        lbCCCD1.setText("CCCD");

        lbNgaySinh1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbNgaySinh1.setForeground(new java.awt.Color(255, 255, 255));
        lbNgaySinh1.setText("NGÀY SINH");

        lbSDT1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbSDT1.setForeground(new java.awt.Color(255, 255, 255));
        lbSDT1.setText("SỐ ĐIỆN THOẠI");

        lbGioi1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbGioi1.setForeground(new java.awt.Color(255, 255, 255));
        lbGioi1.setText("GIỚI TÍNH");

        lbNgayVao1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbNgayVao1.setForeground(new java.awt.Color(255, 255, 255));
        lbNgayVao1.setText("NGÀY VÀO LÀM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbNgayVao1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbGioi1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbSDT1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbNgaySinh1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCCCD1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbName1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNgayVao)
                                    .addComponent(lbGioi)
                                    .addComponent(lbSDT)
                                    .addComponent(lbNgaySinh)
                                    .addComponent(lbCCCD)
                                    .addComponent(lbName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(lbIcon))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName1)
                            .addComponent(lbName)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCCCD1)
                            .addComponent(lbCCCD)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgaySinh1)
                            .addComponent(lbNgaySinh)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSDT1)
                            .addComponent(lbSDT)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGioi1)
                            .addComponent(lbGioi)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgayVao1)
                            .addComponent(lbNgayVao)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lbQuyen)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbCCCD1;
    private javax.swing.JLabel lbGioi;
    private javax.swing.JLabel lbGioi1;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbNgaySinh1;
    private javax.swing.JLabel lbNgayVao;
    private javax.swing.JLabel lbNgayVao1;
    private javax.swing.JLabel lbQuyen;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbSDT1;
    // End of variables declaration//GEN-END:variables
}
