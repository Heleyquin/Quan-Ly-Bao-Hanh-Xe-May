
package com.mycompany.warranty;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class JPanelMenuCover extends javax.swing.JPanel {

    public JPanelMenuCover() {
        initComponents();
        setOpaque(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        putName = new javax.swing.JLabel();

        panelMoving.setOpaque(false);

        putName.setBackground(new java.awt.Color(255, 255, 255));
        putName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        putName.setForeground(new java.awt.Color(255, 255, 204));
        putName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/kdmmaleuser_user_person_man_5919.png"))); // NOI18N
        putName.setText("NameHere");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(putName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(putName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphsc){
        Graphics2D g2=(Graphics2D) grphsc;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1A2980"), 0, getHeight(), Color.decode("#26D0CE"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(),getHeight());
        super.paintChildren(grphsc);
    }
    private int x;
    private int y;
    public void initMoving(JPanel panel){
        panelMoving.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x = me.getX();
                y = me.getY();
            }
        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                panel.setLocation(me.getXOnScreen()-x, me.getYOnScreen()-y);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMoving;
    private javax.swing.JLabel putName;
    // End of variables declaration//GEN-END:variables
}
