
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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daica
 */
public class CTBH_JPanel extends javax.swing.JPanel {

    public CTBH_JPanel() {
        initComponents();
        this.insertTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new RSComponentShade.RSButtonShade();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuaTrinhBH = new rojeru_san.complementos.TableMetro();
        jLabel1 = new javax.swing.JLabel();
        MoTa = new javax.swing.JLabel();
        rSTextFieldShade1 = new RSComponentShade.RSTextFieldShade();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();

        setBackground(new java.awt.Color(102, 255, 255));

        backButton.setBackground(new java.awt.Color(153, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/goback2.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        PanelTable.setBackground(new java.awt.Color(153, 255, 255));
        PanelTable.setPreferredSize(new java.awt.Dimension(843, 507));

        tableQuaTrinhBH.setBackground(new java.awt.Color(153, 255, 255));
        tableQuaTrinhBH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhân viên thực hiện", "Mô Tả", "Thời gian"
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
        tableQuaTrinhBH.setColorFilasBackgound1(new java.awt.Color(255, 255, 204));
        tableQuaTrinhBH.setColorFilasBackgound2(new java.awt.Color(204, 255, 255));
        tableQuaTrinhBH.setFocusable(false);
        tableQuaTrinhBH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableQuaTrinhBH.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableQuaTrinhBH.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableQuaTrinhBH.setGridColor(new java.awt.Color(153, 255, 255));
        tableQuaTrinhBH.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 507));
        tableQuaTrinhBH.setPreferredSize(new java.awt.Dimension(945, 507));
        tableQuaTrinhBH.setRowHeight(30);
        tableQuaTrinhBH.setShowGrid(true);
        tableQuaTrinhBH.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableQuaTrinhBH);
        tableQuaTrinhBH.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tình trạng khi tiếp nhận:");

        MoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MoTa.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rSTextFieldShade1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        rSTextFieldShade1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSTextFieldShade1.setPlaceholder("Mã khung xe");

        rSButtonEffect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(MoTa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MoTa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyBaoHanh QLBH = new QuanLyBaoHanh();
        Main main = new Main();
        main.getMain().setForm(QLBH);
        main.setStatusBH(0);
    }//GEN-LAST:event_backButtonActionPerformed

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

    public void insertTable(){
        QuanLyBaoHanh QLBH = new QuanLyBaoHanh();
        String id_nhan = QLBH.getId_nhan();
        connectSQL conn = new connectSQL();
        ResultSet rs;
        DefaultTableModel dT = (DefaultTableModel) tableQuaTrinhBH.getModel();
        try {
            rs = conn.qua_trinh_bh(id_nhan);
            rs.next();
            MoTa.setText(rs.getString(1));
            dT.addRow(new Object[] {rs.getString(6), rs.getString(5), rs.getString(4)});
            while(rs.next()){
                dT.addRow(new Object[] {rs.getString(6), rs.getString(5), rs.getString(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTBH_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MoTa;
    private javax.swing.JPanel PanelTable;
    private RSComponentShade.RSButtonShade backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private RSComponentShade.RSTextFieldShade rSTextFieldShade1;
    private rojeru_san.complementos.TableMetro tableQuaTrinhBH;
    // End of variables declaration//GEN-END:variables
}
