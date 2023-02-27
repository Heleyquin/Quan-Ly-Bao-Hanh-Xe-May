
package com.raven.form;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import com.raven.main.Main;
import com.raven.form.CTBH_JPanel;

/**
 *
 * @author RAVEN
 */
public class QuanLyBaoHanh extends javax.swing.JPanel {

    static QuanLyBaoHanh QLBH = new QuanLyBaoHanh();
    public QuanLyBaoHanh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new com.raven.component.Header();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();

        setBackground(new java.awt.Color(102, 255, 255));

        tableMetro1.setBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã thẻ bảo hành", "Nhân viên tiếp nhận", "Ngày tiếp nhận", "Nhân viên trả", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMetro1.setColorFilasBackgound1(new java.awt.Color(255, 255, 204));
        tableMetro1.setColorFilasBackgound2(new java.awt.Color(204, 255, 255));
        tableMetro1.setFocusable(false);
        tableMetro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableMetro1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setGridColor(new java.awt.Color(153, 255, 255));
        tableMetro1.setPreferredSize(new java.awt.Dimension(945, 1530));
        tableMetro1.setRowHeight(30);
        tableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMetro1);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Main main = new Main();
                    CTBH_JPanel CTBH = new CTBH_JPanel();
                    CTBH.reset();
                    main.getMain().setForm(CTBH.getCTBH());
                    main.setStatus(1);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
                        .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public QuanLyBaoHanh getQLBH(){
        return QLBH;
    }
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#00C9FF"), 0, getHeight(), Color.decode("#92FE9D"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth(), 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    public static void reset(){
        QLBH = new QuanLyBaoHanh();
        System.gc();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Header header1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.TableMetro tableMetro1;
    // End of variables declaration//GEN-END:variables
}
