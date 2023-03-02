
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
        phieunhan = new javax.swing.JLabel();
        searchBar = new RSComponentShade.RSTextFieldShade();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        listSearch = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel3 = new javax.swing.JLabel();
        MoTa = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(153, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/goback2.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 3, 66, 51));

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
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(PanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 798, 440));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Số phiếu nhận:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 35));

        phieunhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phieunhan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(phieunhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 568, 35));

        searchBar.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        searchBar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBar.setPlaceholder("Nhập kí tự");
        add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 0, 256, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 0, 69, 45));

        listSearch.setBackground(new java.awt.Color(153, 255, 153));
        listSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nhân viên thực hiện", "Mô tả", "Thời gian" }));
        add(listSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 5, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tình trạng khi tiếp nhận:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 35));

        MoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MoTa.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(MoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 568, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        QuanLyBaoHanh QLBH = new QuanLyBaoHanh();
        Main main = new Main();
        main.getMain().setForm(QLBH);
        main.setStatusBH(0);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = listSearch.getSelectedIndex();
        String searchStr = search.getText();
        System.out.println(searchStr);
        DefaultTableModel dT = (DefaultTableModel) tableQuaTrinhBH.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableQuaTrinhBH.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

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
        phieunhan.setText(id_nhan);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private javax.swing.JLabel phieunhan;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private rojeru_san.complementos.TableMetro tableQuaTrinhBH;
    // End of variables declaration//GEN-END:variables
}
