
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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Form_CTKH extends javax.swing.JPanel {

    private static String makh;

    public Form_CTKH(){
        initComponents();
    }
    public String getMaKH(){
        return makh;
    }
    
    public void setMaKH(String makh){
        this.makh = makh;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new RSComponentShade.RSButtonShade();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();
        rSTextFieldShade1 = new RSComponentShade.RSTextFieldShade();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();

        setBackground(new java.awt.Color(51, 255, 255));

        backButton.setBackground(new java.awt.Color(153, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/goback2.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Khách hàng: ");
        jLabel1.setPreferredSize(new java.awt.Dimension(111, 10));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        PanelTable.setBackground(new java.awt.Color(153, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableMetro1.setBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khung xe", "Thời gian tiếp nhận", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMetro1.setColorFilasBackgound1(new java.awt.Color(153, 255, 255));
        tableMetro1.setColorFilasBackgound2(new java.awt.Color(204, 255, 255));
        tableMetro1.setFocusable(false);
        tableMetro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableMetro1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setGridColor(new java.awt.Color(153, 255, 255));
        tableMetro1.setOpaque(false);
        tableMetro1.setPreferredSize(new java.awt.Dimension(450, 400));
        tableMetro1.setRowHeight(30);
        tableMetro1.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMetro1);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );

        rSTextFieldShade1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        rSTextFieldShade1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSTextFieldShade1.setPlaceholder("Mã khung xe");

        rSButtonEffect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                    .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Form_KH KH = new Form_KH();
        Main main = new Main();
        main.getMain().setForm(KH);
        main.setStatusKH(0);
    }//GEN-LAST:event_backButtonActionPerformed

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

    public void insertCTKH(){
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.sp_ct_kh(makh);
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        try {
            rs.next();
            name.setText(rs.getString(1));
            dT.addRow(new Object[] {rs.getString(3), rs.getString(4), rs.getString(6)});
            while(rs.next()){
                dT.addRow(new Object[] {rs.getString(3), rs.getString(4), rs.getString(6)});
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTable;
    private RSComponentShade.RSButtonShade backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private RSComponentShade.RSTextFieldShade rSTextFieldShade1;
    private rojeru_san.complementos.TableMetro tableMetro1;
    // End of variables declaration//GEN-END:variables
}
