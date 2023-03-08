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
import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author RAVEN
 */
public class QuanLyBaoHanh extends javax.swing.JPanel {

    private static String id_nhan;
    private static String id_xoa;
    private static String tbh;
    private static String nVNhan;
    private static String ngayNhan;
    private static String nVTra;
    private static String ngayTra;

    public QuanLyBaoHanh() {
        initComponents();
        this.insertTable();
    }

    public JTable getTable() {
        return tableMetro1;
    }

    public void setId_xoa(String id_xoa) {
        this.id_xoa = id_xoa;
    }

    public String getId_xoa() {
        return id_xoa;
    }

    public String getTBH(){
        return tbh;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemPBH = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chonTBH = new javax.swing.JComboBox<>();
        maKH = new javax.swing.JComboBox<>();
        themNVNhan = new javax.swing.JLabel();
        clock1 = new com.raven.component.Clock();
        xacnhan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tinhTrang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();
        searchBar = new RSComponentShade.RSTextFieldShade();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        listSearch = new RSMaterialComponent.RSComboBoxMaterial();
        them = new javax.swing.JButton();
        laptra = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        sua = new javax.swing.JButton();

        ThemPBH.setModal(true);
        ThemPBH.setResizable(false);
        ThemPBH.setSize(new java.awt.Dimension(815, 460));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(136, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin phiếu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nhân viên nhận:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mã thẻ bảo hành:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Thời gian nhận:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mã khách hàng:");

        chonTBH.setBackground(new java.awt.Color(255, 204, 255));
        chonTBH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chonTBH.setMaximumRowCount(30);

        maKH.setBackground(new java.awt.Color(255, 153, 153));
        maKH.setMaximumRowCount(30);

        themNVNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        clock1.setBackground(new java.awt.Color(204, 204, 255));

        xacnhan.setBackground(new java.awt.Color(255, 153, 51));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacnhan.setText("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Tình trạng nhận:");

        tinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chonTBH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(themNVNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(tinhTrang))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chonTBH)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(themNVNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(clock1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maKH)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        themNVNhan.setText(new com.raven.main.WelcomeJFrame().getTK());

        javax.swing.GroupLayout ThemPBHLayout = new javax.swing.GroupLayout(ThemPBH.getContentPane());
        ThemPBH.getContentPane().setLayout(ThemPBHLayout);
        ThemPBHLayout.setHorizontalGroup(
            ThemPBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        ThemPBHLayout.setVerticalGroup(
            ThemPBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        ThemPBH.setLocationRelativeTo(null);

        setBackground(new java.awt.Color(102, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableMetro1.setBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhận", "Mã thẻ bảo hành", "Nhân viên nhận", "Ngày tiếp nhận", "Nhân viên trả", "Ngày trả", "Mã khách hàng", "Tình trạng khi trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMetro1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableMetro1.setColorFilasBackgound1(new java.awt.Color(153, 255, 255));
        tableMetro1.setColorFilasBackgound2(new java.awt.Color(204, 255, 255));
        tableMetro1.setFocusable(false);
        tableMetro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableMetro1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setGridColor(new java.awt.Color(153, 255, 255));
        tableMetro1.setRowHeight(30);
        tableMetro1.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMetro1);
        if (tableMetro1.getColumnModel().getColumnCount() > 0) {
            tableMetro1.getColumnModel().getColumn(0).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(1).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(2).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(3).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(4).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(4).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(5).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(5).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(6).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(6).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(7).setMinWidth(150);
            tableMetro1.getColumnModel().getColumn(7).setPreferredWidth(200);
            tableMetro1.getColumnModel().getColumn(7).setMaxWidth(300);
        }
        tableMetro1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableMetro1.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                ResultSet rs = conn.quyen_tk(new com.raven.main.WelcomeJFrame().getTK());
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    String nvTra = tableTemp.getModel().getValueAt(indexRow, 4)+"";
                    Main main = new Main();
                    id_nhan = temp;
                    CTBH_JPanel CTBH = new CTBH_JPanel();
                    if(nvTra.equalsIgnoreCase("null")){
                        CTBH.showUpdate();
                    }else{
                        CTBH.hideUpdate();
                    }
                    main.getMain().setForm(CTBH);
                    main.setStatusBH(1);
                }else if(e.getClickCount() == 1){
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    tbh = tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    nVNhan = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    ngayNhan = tableTemp.getModel().getValueAt(indexRow, 3)+"";
                    nVTra = tableTemp.getModel().getValueAt(indexRow, 4)+"";
                    ngayTra = tableTemp.getModel().getValueAt(indexRow, 5) + "";
                    id_xoa = temp;
                    int a = conn.co_the_xoa_sua_pbh_nhan(temp);
                    if (a == 1){
                        try{
                            rs.next();
                            int quyen = rs.getInt(1);
                            if(quyen == 2){
                                laptra.setVisible(true);
                                sua.setVisible(true);
                            }
                            else if(quyen == 1){
                                laptra.setVisible(true);
                                xoa.setVisible(true);
                                sua.setVisible(true);
                            }
                        }
                        catch(SQLException ex){
                            System.out.println(ex);
                        }
                    }else{
                        laptra.setVisible(false);
                        xoa.setVisible(false);
                        sua.setVisible(false);
                    }
                }
            }
        });

        searchBar.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        searchBar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBar.setPlaceholder("Nhập kí tự");

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        listSearch.setBackground(new java.awt.Color(255, 204, 204));
        listSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã phiếu nhận", "Mã thẻ bảo hành", "Nhân viên nhận", "Ngày tiếp nhận", "Nhân viên trả", "Ngày trả", "Mã khách hàng", "Tình trạng khi trả", " " }));

        them.setBackground(new java.awt.Color(51, 255, 51));
        them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setLabel("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        laptra.setBackground(new java.awt.Color(153, 153, 255));
        laptra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        laptra.setForeground(new java.awt.Color(255, 255, 255));
        laptra.setText("Lập phiếu trả");
        laptra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptraActionPerformed(evt);
            }
        });

        xoa.setBackground(new java.awt.Color(255, 51, 51));
        xoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        sua.setBackground(new java.awt.Color(255, 102, 102));
        sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sua.setForeground(new java.awt.Color(255, 255, 255));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 204, Short.MAX_VALUE)
                                .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(laptra)
                                .addGap(89, 89, 89)
                                .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laptra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        laptra.setVisible(false);
        xoa.setVisible(false);
        sua.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = listSearch.getSelectedIndex();
        String searchStr = searchBar.getText();
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableMetro1.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa? Không thể hoàn tác!!!", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.xoa_pbh_nhan(id_xoa);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
                dT.setRowCount(0);
                this.insertTable();
            }
        } else {

        }
    }//GEN-LAST:event_xoaActionPerformed

    private void laptraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptraActionPerformed
        // TODO add your handling code here:
        PhieuTra themphieu = new PhieuTra(tableMetro1);
        themphieu.setLocationRelativeTo(null);
        themphieu.setVisible(true);
        themphieu.setMapn(id_xoa);
    }//GEN-LAST:event_laptraActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        connectSQL conTBH = new connectSQL();
        ResultSet reTBH = conTBH.ds_tbh();
        chonTBH.removeAllItems();
        try {
            while (reTBH.next()) {
                chonTBH.addItem(reTBH.getString(1));
            }
            chonTBH.setSelectedIndex(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        maKH.removeAllItems();
        ResultSet reKH;
        reKH = conTBH.ds_kh();
        try {
            while (reKH.next()) {
                maKH.addItem(reKH.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        tinhTrang.setText(null);
        ThemPBH.setVisible(true);
        
        
    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        NV_SUA_PBH_NHAN sua_pbh = new NV_SUA_PBH_NHAN(tableMetro1);
        chonTBH.removeAllItems();
        sua_pbh.setVisible(true);
        sua_pbh.setLocationRelativeTo(null);
        sua_pbh.setMaNhan(id_xoa);
        sua_pbh.setNVNhan(nVNhan);
        sua_pbh.setNgayNhan(ngayNhan);
        sua_pbh.setNVTra(nVTra);
        sua_pbh.setNgayTra(ngayTra);
        sua_pbh.setTBH(tbh);
    }//GEN-LAST:event_suaActionPerformed

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với thông tin đã chọn?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            String tbhThem = chonTBH.getSelectedItem().toString();
            String nv = themNVNhan.getText();
            Date ngay = clock1.getDate();
            String maKhThem = maKH.getSelectedItem().toString();
            String tT = tinhTrang.getText();
            int result = conn.them_pbh(tbhThem, nv, ngay, maKhThem, tT);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                ThemPBH.dispose();
                DefaultTableModel model = (DefaultTableModel) tableMetro1.getModel();
                model.setRowCount(0);
                this.insertTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_xacnhanActionPerformed

    public void setId_nhan(String id_nhan) {
        this.id_nhan = id_nhan;
    }

    public String getId_nhan() {
        return id_nhan;
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

    public QuanLyBaoHanh getQLH() {
        return this;
    }

    public void insertTable() {
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_pbh_nhan();
        try {
            while (rs.next()) {
                dT.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBaoHanh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ThemPBH;
    private javax.swing.JComboBox<String> chonTBH;
    private com.raven.component.Clock clock1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laptra;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private javax.swing.JComboBox<String> maKH;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private javax.swing.JButton sua;
    private static rojeru_san.complementos.TableMetro tableMetro1;
    private javax.swing.JButton them;
    private javax.swing.JLabel themNVNhan;
    private javax.swing.JTextField tinhTrang;
    private javax.swing.JButton xacnhan;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
