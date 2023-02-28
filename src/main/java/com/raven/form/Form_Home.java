package com.raven.form;

import com.raven.component.WelcomeJFrame;
import com.raven.main.Main;
import com.raven.model.Nhan_Vien;
import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
public class Form_Home extends javax.swing.JPanel {

    private static connectSQL conn;
    public Form_Home() {
        initComponents();
        conn = new connectSQL();
        WelcomeJFrame welcom = new WelcomeJFrame();
        String tk = welcom.getTK();
        ResultSet rs = conn.timnv_bang_tk(tk);
        String name = null, email = null, SDT = null, gioi = null, ngaySinh = null, ngayVaoLam = null;
        try {
            name = rs.getString(2) + " " + rs.getString(3);
            ngaySinh = rs.getString(4);
            SDT = rs.getString(5);
            email = rs.getString(6);
            gioi = rs.getString("Gioi");
            ngayVaoLam = rs.getString("TgVao");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        card1.setData(new Nhan_Vien(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), name, email, ngaySinh, SDT, gioi, ngayVaoLam, "------------", "Increased by 60%"));
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
    private static com.raven.component.Card card1;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
