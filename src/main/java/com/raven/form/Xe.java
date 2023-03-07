
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.regex.*;

public class Xe extends javax.swing.JPanel {

    private static final String regexKX = "(KX\\d{1,8})";
    private static final String regexTBH = "(TBH\\d{1,17})";
    private final static Pattern patternKX = Pattern.compile(regexKX);
    private final static Pattern patternTBH = Pattern.compile(regexTBH);
    private String kx;
    private String maModel;
    private String maMau;
    private String ngay;
    public Xe() {
        initComponents();
        insertXe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suaTTXe = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        makx = new javax.swing.JLabel();
        listMau = new javax.swing.JComboBox<>();
        namSX = new com.toedter.calendar.JDateChooser();
        xacNhan = new javax.swing.JButton();
        saiNgay = new javax.swing.JLabel();
        themXe = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kxThem = new javax.swing.JTextField();
        ds_model = new javax.swing.JComboBox<>();
        dsMauThem = new javax.swing.JComboBox<>();
        ngayThem = new com.toedter.calendar.JDateChooser();
        xacnhan = new javax.swing.JButton();
        saiNgayThem = new javax.swing.JLabel();
        saiKX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbhThem = new javax.swing.JTextField();
        saiTBH = new javax.swing.JLabel();
        hanThem = new javax.swing.JLabel();
        hanNgay = new com.toedter.calendar.JDateChooser();
        hanSai = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableXe = new rojerusan.RSTableMetro();
        sua = new rojeru_san.rsbutton.RSButtonRoundRipple();
        them = new rojeru_san.rsbutton.RSButtonRoundRipple();
        searchBar = new rojeru_san.rsfield.RSTextField();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        listSearch = new javax.swing.JComboBox<>();

        suaTTXe.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        suaTTXe.setModal(true);
        suaTTXe.setSize(new java.awt.Dimension(801, 480));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mã khung xe:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Màu sắc");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Năm sản xuất:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Model:");

        model.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        makx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        listMau.setBackground(new java.awt.Color(255, 204, 153));
        listMau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        namSX.setDateFormatString("yyyy-MM-dd");

        xacNhan.setBackground(new java.awt.Color(255, 51, 102));
        xacNhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacNhan.setText("Xác nhận");
        xacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanActionPerformed(evt);
            }
        });

        saiNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgay.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(74, 74, 74)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(listMau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(namSX, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(17, 17, 17)
                                    .addComponent(makx, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(saiNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(xacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(makx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listMau, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(namSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(xacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout suaTTXeLayout = new javax.swing.GroupLayout(suaTTXe.getContentPane());
        suaTTXe.getContentPane().setLayout(suaTTXeLayout);
        suaTTXeLayout.setHorizontalGroup(
            suaTTXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        suaTTXeLayout.setVerticalGroup(
            suaTTXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suaTTXeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        suaTTXe.setLocationRelativeTo(null);

        themXe.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        themXe.setModal(true);
        themXe.setSize(new java.awt.Dimension(744, 570));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(876, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mã khung xe:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 21, 157, 48));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mã model:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 97, 157, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Màu:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 165, 157, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Năm sản xuất:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 244, 251, 43));
        jPanel2.add(kxThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 21, 333, 48));

        ds_model.setBackground(new java.awt.Color(255, 255, 153));
        ds_model.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ds_model.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ds_modelItemStateChanged(evt);
            }
        });
        jPanel2.add(ds_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 97, 333, 50));
        connectSQL conModel = new connectSQL();
        ResultSet rs = conModel.ds_model();
        try {
            while (rs.next()) {
                ds_model.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        dsMauThem.setBackground(new java.awt.Color(255, 204, 204));
        dsMauThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(dsMauThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 165, 333, 51));

        ngayThem.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(ngayThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 244, 333, 43));

        xacnhan.setBackground(new java.awt.Color(255, 204, 102));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacnhan.setText("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });
        jPanel2.add(xacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 123, 46));

        saiNgayThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgayThem.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(saiNgayThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 293, 430, 16));

        saiKX.setBackground(new java.awt.Color(255, 51, 51));
        saiKX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiKX.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(saiKX, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 75, 510, 16));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Mã thẻ bảo hành:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 315, 157, 46));
        jPanel2.add(tbhThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 317, 333, 43));

        saiTBH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiTBH.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(saiTBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 367, 430, 16));

        hanThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hanThem.setText("Ngày hết hạn thẻ:");
        jPanel2.add(hanThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 389, 157, 45));

        hanNgay.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(hanNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 389, 333, 45));

        hanSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hanSai.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(hanSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 440, 400, 20));

        javax.swing.GroupLayout themXeLayout = new javax.swing.GroupLayout(themXe.getContentPane());
        themXe.getContentPane().setLayout(themXeLayout);
        themXeLayout.setHorizontalGroup(
            themXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        themXeLayout.setVerticalGroup(
            themXeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        themXe.setLocationRelativeTo(null);

        setBackground(new java.awt.Color(204, 204, 255));

        tableXe.setBackground(new java.awt.Color(255, 204, 204));
        tableXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khung xe", "Model", "Màu sắc", "Năm sản xuất"
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
        tableXe.setColorPrimary(new java.awt.Color(255, 255, 153));
        tableXe.setColorSecondary(new java.awt.Color(204, 204, 255));
        tableXe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableXe.setFontHead(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableXe.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableXe.setFontRowSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(tableXe);
        tableXe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableXe.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableXe.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                ResultSet rs = conn.quyen_tk(new com.raven.main.WelcomeJFrame().getTK());
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String temp = tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    Main main = new Main();
                    modelXe model = new modelXe();
                    model.setModel(temp);
                    model.fillText();
                    main.getMain().setForm(model);
                    main.setStatusXe(1);
                }else if(e.getClickCount() == 1){
                    kx = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    maModel =tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    maMau = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    ngay = tableTemp.getModel().getValueAt(indexRow, 3)+"";
                    try{
                        rs.next();
                        int quyen = rs.getInt(1);
                        if(quyen == 2){
                            sua.setVisible(false);
                        }else if(quyen == 1){
                            sua.setVisible(true);
                        }
                    }catch(SQLException ex){
                        System.out.println(ex);
                    }
                }else{
                    sua.setVisible(false);
                }
            }
        });

        sua.setBackground(new java.awt.Color(51, 255, 204));
        sua.setForeground(new java.awt.Color(255, 255, 153));
        sua.setText("Sửa");
        sua.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        them.setBackground(new java.awt.Color(51, 255, 51));
        them.setForeground(new java.awt.Color(255, 255, 153));
        them.setText("Thêm");
        them.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        searchBar.setBackground(new java.awt.Color(255, 255, 204));
        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setPlaceholder("Nhập vào đây");

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        listSearch.setBackground(new java.awt.Color(255, 204, 153));
        listSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khung xe", "Model", "Màu sắc", "Năm sản xuất" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        sua.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = listSearch.getSelectedIndex();
        String searchStr = searchBar.getText();
        DefaultTableModel dT = (DefaultTableModel) tableXe.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableXe.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

    private void xacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với thông tin đã nhập?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            ResultSet a = conn.kiem_tra_bh(kx);
            Date timeBatDau = new Date();
            try {
                a.next();
                timeBatDau = a.getDate(3);
            } catch (SQLException ex) {
                Logger.getLogger(Xe.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(namSX.getDate() == null || timeBatDau.before(namSX.getDate())){
                saiNgay.setText("Ngày không hợp lệ");
            }else{
                saiNgay.setText(null);
                int result = conn.sua_tt_xe(makx.getText(), namSX.getDate(), listMau.getSelectedItem().toString());
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    suaTTXe.dispose();
                    DefaultTableModel dt = (DefaultTableModel) tableXe.getModel();
                    dt.setRowCount(0);
                    insertXe();
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa không thành công", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
        
    }//GEN-LAST:event_xacNhanActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        ResultSet rs;
        connectSQL conModel = new connectSQL();
        rs = conModel.ds_model();
        kxThem.setText(null);
        ngayThem.setDate(null);
        tbhThem.setText(null);
        hanNgay.setDate(null);
        ds_model.setSelectedIndex(0);
        dsMauThem.setSelectedIndex(0);
        themXe.setVisible(true);

    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        makx.setText(kx);
        model.setText(maModel);
        connectSQL conn = new connectSQL();
        ResultSet ds = conn.ds_mau(maModel);
        try {
            listMau.removeAllItems();
            while(ds.next()){
                listMau.addItem(ds.getString(1));
            }
            listMau.setSelectedItem(maMau);
        } catch (SQLException ex) {
            Logger.getLogger(Xe.class.getName()).log(Level.SEVERE, null, ex);
        }
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(ngay);
            namSX.setDate(date);
        } catch (ParseException e) {
        }
        suaTTXe.setVisible(true);
    }//GEN-LAST:event_suaActionPerformed

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với thông tin vừa nhập chưa?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = patternKX.matcher(kxThem.getText());
            Matcher matcher2 = patternTBH.matcher(tbhThem.getText());
            if(ngayThem.getDate() == null || ngayThem.getDate().after(new Date()) == true){
                saiNgayThem.setText("Ngày sản xuất không hợp lệ");
                saiKX.setText(null);
                saiTBH.setText(null);
                hanSai.setText(null);
            }
            if(matcher1.matches() == false){
                saiNgayThem.setText(null);
                saiKX.setText("Mã khung xe phải là chuỗi dạng 'KXx' với x là 1 số");
                saiTBH.setText(null);
                hanSai.setText(null);
            }
            if(matcher2.matches() == false){
                saiTBH.setText("Định dạng thẻ bảo hành không đúng, phải có dạng 'TBHx' x là số");
                saiKX.setText(null);
                saiNgayThem.setText(null);
                hanSai.setText(null);
            }
            if (hanNgay.getDate() == null || (hanNgay.getDate().before(new Date()) == true)){
                hanSai.setText("Hạn bảo hành không hợp lệ");
                saiKX.setText(null);
                saiNgayThem.setText(null);
                saiTBH.setText(null);                
            }
            if(ngayThem.getDate() != null && matcher1.matches() == true && ngayThem.getDate().after(new Date()) == false && hanNgay.getDate().before(new Date()) == false){
                connectSQL conn = new connectSQL();
                int result = conn.them_xe_tbh(kxThem.getText(), ds_model.getSelectedItem().toString(), ngayThem.getDate(), dsMauThem.getSelectedItem().toString(), tbhThem.getText(), hanNgay.getDate());
                if (result > 0){
                    JOptionPane.showMessageDialog(null, "Thêm hoàn tất", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    themXe.dispose();
                    DefaultTableModel dt = (DefaultTableModel) tableXe.getModel();
                    dt.setRowCount(0);
                    insertXe();
                }else{
                    JOptionPane.showMessageDialog(null, "Thất bại", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_xacnhanActionPerformed

    private void ds_modelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ds_modelItemStateChanged
        // TODO add your handling code here:
        connectSQL conn = new connectSQL();
        dsMauThem.removeAllItems();
        ResultSet rs = conn.ds_mau(ds_model.getSelectedItem().toString());
        try {
            while (rs.next()) {
                dsMauThem.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_ds_modelItemStateChanged

    public void insertXe(){
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_xe();
        try {
            DefaultTableModel dt = (DefaultTableModel) tableXe.getModel();
            while(rs.next()){
                dt.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Xe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dsMauThem;
    private javax.swing.JComboBox<String> ds_model;
    private com.toedter.calendar.JDateChooser hanNgay;
    private javax.swing.JLabel hanSai;
    private javax.swing.JLabel hanThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kxThem;
    private javax.swing.JComboBox<String> listMau;
    private javax.swing.JComboBox<String> listSearch;
    private javax.swing.JLabel makx;
    private javax.swing.JLabel model;
    private com.toedter.calendar.JDateChooser namSX;
    private com.toedter.calendar.JDateChooser ngayThem;
    private javax.swing.JLabel saiKX;
    private javax.swing.JLabel saiNgay;
    private javax.swing.JLabel saiNgayThem;
    private javax.swing.JLabel saiTBH;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private rojeru_san.rsfield.RSTextField searchBar;
    private rojeru_san.rsbutton.RSButtonRoundRipple sua;
    private javax.swing.JDialog suaTTXe;
    private rojerusan.RSTableMetro tableXe;
    private javax.swing.JTextField tbhThem;
    private rojeru_san.rsbutton.RSButtonRoundRipple them;
    private javax.swing.JDialog themXe;
    private javax.swing.JButton xacNhan;
    private javax.swing.JButton xacnhan;
    // End of variables declaration//GEN-END:variables
}
