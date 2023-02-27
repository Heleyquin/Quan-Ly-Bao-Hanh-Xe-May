
package com.mycompany.warranty;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class JPanelMenuNhanVien extends javax.swing.JPanel {

    public JPanelMenuNhanVien() {
        initComponents();
        setOpaque(false);
//        jPanelMenuCover2.initMoving(JPanelMenuNhanVien.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuCover2 = new com.mycompany.warranty.JPanelMenuCover();

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenuCover2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 618, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuCover2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    protected void paintCoponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.warranty.JPanelMenuCover jPanelMenuCover2;
    // End of variables declaration//GEN-END:variables
}
