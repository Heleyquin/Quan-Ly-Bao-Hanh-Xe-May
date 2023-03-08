
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.*;


public class CTBH_JPanel extends javax.swing.JPanel {
    private static final String regexGia = "[1-9]\\d{0,}$";
    private final static Pattern patternGia = Pattern.compile(regexGia);
    public CTBH_JPanel() {
        initComponents();
        this.insertTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capNhatQuaTrinh = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clock1 = new com.raven.component.Clock();
        moTaThem = new javax.swing.JTextField();
        chiPhiThem = new javax.swing.JTextField();
        xacnhan = new javax.swing.JButton();
        saiGia = new javax.swing.JLabel();
        saiMota = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        tong_tien = new javax.swing.JLabel();
        capnhat = new javax.swing.JButton();

        capNhatQuaTrinh.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        capNhatQuaTrinh.setModal(true);
        capNhatQuaTrinh.setSize(new java.awt.Dimension(847, 400));

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mô tả:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Thời gian:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Chi phí(Nếu có):");

        clock1.setBackground(new java.awt.Color(255, 153, 204));
        clock1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        moTaThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        chiPhiThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        xacnhan.setBackground(new java.awt.Color(255, 255, 0));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacnhan.setText("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });

        saiGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiGia.setForeground(new java.awt.Color(255, 51, 51));

        saiMota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiMota.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saiMota, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saiGia, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                            .addComponent(moTaThem)
                            .addComponent(chiPhiThem))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moTaThem, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(saiMota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chiPhiThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiGia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout capNhatQuaTrinhLayout = new javax.swing.GroupLayout(capNhatQuaTrinh.getContentPane());
        capNhatQuaTrinh.getContentPane().setLayout(capNhatQuaTrinhLayout);
        capNhatQuaTrinhLayout.setHorizontalGroup(
            capNhatQuaTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        capNhatQuaTrinhLayout.setVerticalGroup(
            capNhatQuaTrinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        capNhatQuaTrinh.setLocationRelativeTo(null);

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
                "Nhân viên thực hiện", "Mô Tả", "Thời gian", "Chi phí(Nếu có)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(PanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, 798, 390));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tổng tiền:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 30));

        tong_tien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(tong_tien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 690, 40));

        capnhat.setBackground(new java.awt.Color(204, 204, 255));
        capnhat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        capnhat.setText("Updates");
        capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatActionPerformed(evt);
            }
        });
        add(capnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 40));
        capnhat.setVisible(false);
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
        String searchStr = searchBar.getText();
        DefaultTableModel dT = (DefaultTableModel) tableQuaTrinhBH.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableQuaTrinhBH.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Xác nhận muốn thêm", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = patternGia.matcher(chiPhiThem.getText());
            if(moTaThem.getText().isEmpty()){
                saiMota.setText("Không được để trống");
                saiGia.setText(null);
            }
            if (matcher1.matches() == false && (chiPhiThem.getText().isEmpty() == false )){
                saiGia.setText("Giá tiền không hợp lệ");
                saiMota.setText(null);
            }if(moTaThem.getText().isEmpty() == false && (matcher1.matches() == true || chiPhiThem.getText().isEmpty() == true)){
            saiGia.setText(null);
            saiMota.setText(null);
            String id_nhan = phieunhan.getText();
            Date tg = clock1.getDate();
            String mota = moTaThem.getText();
            String chiphi = chiPhiThem.getText();
            String manv = new com.raven.main.WelcomeJFrame().getTK();
            connectSQL conn = new connectSQL();
            int result = conn.them_qua_trinh(id_nhan, tg, mota, manv, chiphi);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                capNhatQuaTrinh.dispose();
                DefaultTableModel model = (DefaultTableModel) tableQuaTrinhBH.getModel();
                model.setRowCount(0);
                this.insertTable();
                capNhatQuaTrinh.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Thêm thất bại", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }else{
            
        }
    }//GEN-LAST:event_xacnhanActionPerformed

    private void capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatActionPerformed
        // TODO add your handling code here:
        moTaThem.setText(null);
        chiPhiThem.setText(null);
        capNhatQuaTrinh.setVisible(true);
    }//GEN-LAST:event_capnhatActionPerformed

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

    public void showUpdate(){
        capnhat.setVisible(true);
    }
    public void hideUpdate(){
        capnhat.setVisible(false);
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
            tong_tien.setText(rs.getString(8));
            dT.addRow(new Object[] {rs.getString(6), rs.getString(5), rs.getString(4), rs.getString(7)});
            while(rs.next()){
                dT.addRow(new Object[] {rs.getString(6), rs.getString(5), rs.getString(4), rs.getString(7)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTBH_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MoTa;
    private javax.swing.JPanel PanelTable;
    private RSComponentShade.RSButtonShade backButton;
    private javax.swing.JDialog capNhatQuaTrinh;
    private javax.swing.JButton capnhat;
    private javax.swing.JTextField chiPhiThem;
    private com.raven.component.Clock clock1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private javax.swing.JTextField moTaThem;
    private javax.swing.JLabel phieunhan;
    private javax.swing.JLabel saiGia;
    private javax.swing.JLabel saiMota;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private rojeru_san.complementos.TableMetro tableQuaTrinhBH;
    private javax.swing.JLabel tong_tien;
    private javax.swing.JButton xacnhan;
    // End of variables declaration//GEN-END:variables
}
