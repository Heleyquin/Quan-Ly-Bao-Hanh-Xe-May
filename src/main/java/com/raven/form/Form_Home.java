package com.raven.form;

import com.raven.model.Model_Card;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "Name Here", "CCCD", "Ngày Sinh", "Số điện thoại", "Giới tính", "Ngày vào", "Ngày nghỉ", "Increased by 60%"));
        //  add row table
        JPanel p = new JPanel();
        p.setBackground(getBackground());
    }

    public void setCardForm_Home(String name, String email, String NgaySinh, String SDT, String Gioi, String NgayVaoLam){
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), name, email, NgaySinh, SDT, Gioi, NgayVaoLam, "-----------------", "Increased by 60%"));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.raven.component.Card();

        setBackground(new java.awt.Color(204, 204, 255));

        panel.setBackground(new java.awt.Color(255, 204, 255));
        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
