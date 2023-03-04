
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_KH extends javax.swing.JPanel {

    private static String ma_kh_xoa, sdt, cccd, ngaySinh, ho, ten, gioi, mail;
    
    
    private final static String regexCCCD = "\\d{12}";
    private final static String regexSDT = "0\\d{9}";
    private final static String regexMail = "[A-Za-z0-9]+@gmail\\.com";
    private final static String regexMaKH = "(KH\\d{1,8})";
    private final static Pattern pattern1CCCD = Pattern.compile(regexCCCD);
    private final static Pattern pattern1SDT = Pattern.compile(regexSDT);
    private final static Pattern pattern1Mail = Pattern.compile(regexMail);
    private final static Pattern pattern1MaKH = Pattern.compile(regexMaKH);
    
    public Form_KH() {
        initComponents();
        this.insertKH();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemKH = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1MAKH = new javax.swing.JLabel();
        jLabel1MAKH1 = new javax.swing.JLabel();
        jLabel1MAKH2 = new javax.swing.JLabel();
        jLabel1MAKH3 = new javax.swing.JLabel();
        jLabel1MAKH4 = new javax.swing.JLabel();
        jLabel1MAKH6 = new javax.swing.JLabel();
        jLabel1MAKH7 = new javax.swing.JLabel();
        jLabel1MAKH8 = new javax.swing.JLabel();
        saiSDT = new javax.swing.JLabel();
        saiMail = new javax.swing.JLabel();
        saiNgay = new javax.swing.JLabel();
        saiCCCD = new javax.swing.JLabel();
        hoKH = new javax.swing.JTextField();
        tenKH = new javax.swing.JTextField();
        ngaySinhKH = new com.toedter.calendar.JDateChooser();
        sdtKh = new javax.swing.JTextField();
        gioiKH = new javax.swing.JComboBox<>();
        mailKH = new javax.swing.JTextField();
        cccdKH = new javax.swing.JTextField();
        xacnhan = new javax.swing.JButton();
        maKHThem = new javax.swing.JTextField();
        maKHThem1 = new javax.swing.JLabel();
        saiKH = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();
        searchBar = new RSComponentShade.RSTextFieldShade();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        listSearch = new RSMaterialComponent.RSComboBoxMaterial();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        sua = new javax.swing.JButton();

        ThemKH.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ThemKH.setModal(true);
        ThemKH.setPreferredSize(new java.awt.Dimension(1100, 800));
        ThemKH.setResizable(false);
        ThemKH.setSize(new java.awt.Dimension(959, 678));
        ThemKH.setLocationRelativeTo(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1MAKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH.setText("CCCD:");
        jPanel2.add(jLabel1MAKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 56));

        jLabel1MAKH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH1.setText("EMAIL:");
        jPanel2.add(jLabel1MAKH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 200, 56));

        jLabel1MAKH2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH2.setText("TÊN:");
        jPanel2.add(jLabel1MAKH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 89, 56));

        jLabel1MAKH3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH3.setText("NGÀY SINH (yyyy-MM-dd):");
        jPanel2.add(jLabel1MAKH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 245, 56));

        jLabel1MAKH4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH4.setText("SỐ ĐIỆN THOẠI:");
        jPanel2.add(jLabel1MAKH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 200, 56));

        jLabel1MAKH6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH6.setText("GIỚI TÍNH:");
        jPanel2.add(jLabel1MAKH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 200, 56));

        jLabel1MAKH7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH7.setText("Thông tin khách hàng");
        jPanel2.add(jLabel1MAKH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 200, 40));

        jLabel1MAKH8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH8.setText("HỌ:");
        jPanel2.add(jLabel1MAKH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 124, 56));

        saiSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiSDT.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(saiSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 349, 18));

        saiMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiMail.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(saiMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 270, 18));

        saiNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgay.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(saiNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 349, 18));

        saiCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiCCCD.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(saiCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 349, 18));
        jPanel2.add(hoKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 267, 56));
        jPanel2.add(tenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 327, 50));

        ngaySinhKH.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(ngaySinhKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 470, 50));
        jPanel2.add(sdtKh, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 470, 50));

        gioiKH.setBackground(new java.awt.Color(102, 255, 255));
        gioiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel2.add(gioiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 130, 50));
        jPanel2.add(mailKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 550, 50));
        jPanel2.add(cccdKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 640, 50));

        xacnhan.setBackground(new java.awt.Color(102, 102, 255));
        xacnhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacnhan.setForeground(new java.awt.Color(255, 255, 102));
        xacnhan.setLabel("Xác nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });
        jPanel2.add(xacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 140, 40));
        jPanel2.add(maKHThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 640, 50));

        maKHThem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maKHThem1.setText("Mã khách hàng:");
        maKHThem1.setPreferredSize(new java.awt.Dimension(52, 25));
        jPanel2.add(maKHThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 160, 50));

        saiKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiKH.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(saiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 310, 20));

        javax.swing.GroupLayout ThemKHLayout = new javax.swing.GroupLayout(ThemKH.getContentPane());
        ThemKH.getContentPane().setLayout(ThemKHLayout);
        ThemKHLayout.setHorizontalGroup(
            ThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        ThemKHLayout.setVerticalGroup(
            ThemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableMetro1.setBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "CCCD", "Họ Tên", "Ngày sinh", "Số điện thoại", "Giới tính", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        tableMetro1.setRowHeight(30);
        tableMetro1.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMetro1);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableMetro1.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                ResultSet rs = conn.quyen_tk(new com.raven.main.WelcomeJFrame().getTK());
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String makh = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    String tenKh = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    Main main = new Main();
                    Form_CTKH CTKH = new Form_CTKH();
                    CTKH.setMaKH(makh);
                    CTKH.setTenKH(tenKh);
                    CTKH.insertCTKH();
                    main.getMain().setForm(CTKH);
                    main.setStatusKH(1);
                }else if(e.getClickCount() == 1){
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    cccd = tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    ngaySinh = tableTemp.getModel().getValueAt(indexRow, 3)+"";
                    sdt = tableTemp.getModel().getValueAt(indexRow, 4)+"";
                    gioi = tableTemp.getModel().getValueAt(indexRow, 5)+"";
                    mail = tableTemp.getModel().getValueAt(indexRow, 6)+"";
                    ma_kh_xoa = temp;
                    ResultSet rsTemp = conn.timKH(temp);
                    try{
                        rsTemp.next();
                        ho = rsTemp.getString(1);
                        ten = rsTemp.getString(2);

                    }catch(SQLException ex){
                        System.out.println(ex);
                    }
                    int a = conn.co_the_xoa_kh(temp);
                    if (a == 1){
                        try{
                            rs.next();
                            int quyen = rs.getInt(1);
                            if(quyen == 2){
                                sua.setVisible(true);
                            }
                            else if(quyen == 1){
                                sua.setVisible(true);
                                xoa.setVisible(true);
                            }
                        }
                        catch(SQLException ex){
                            System.out.println(ex);
                        }
                    }else{
                        sua.setVisible(true);
                        xoa.setVisible(false);
                    }
                }
            }
        });

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 791, 295));

        searchBar.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        searchBar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBar.setPlaceholder("Nhập kí tự");
        add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 256, -1));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 0, 69, 45));

        listSearch.setBackground(new java.awt.Color(255, 204, 204));
        listSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã khách hàng", "CCCD", "Họ Tên", "Ngày sinh", "Số điện thoại", "Giới tính", "Email" }));
        add(listSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 5, -1, -1));

        them.setBackground(new java.awt.Color(51, 255, 51));
        them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setLabel("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        add(them, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        xoa.setBackground(new java.awt.Color(255, 51, 51));
        xoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        add(xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));
        xoa.setVisible(false);

        sua.setBackground(new java.awt.Color(255, 102, 102));
        sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sua.setForeground(new java.awt.Color(255, 255, 255));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        add(sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));
        sua.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = listSearch.getSelectedIndex();
        String searchStr = searchBar.getText();
        System.out.println(searchStr);
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
            int result = conn.xoa_kh(ma_kh_xoa);
            if (result > 0){
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
                dT.setRowCount(0);
                this.insertKH();    
            }
        } else {

        }
    }//GEN-LAST:event_xoaActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        SUA_KH suakh = new SUA_KH(tableMetro1);
        suakh.setVisible(true);
        suakh.setLocationRelativeTo(null);
        suakh.setMKH(ma_kh_xoa);
        suakh.setTen(ten);
        suakh.setCCCD(cccd);
        suakh.setEmail(mail);
        suakh.setSDT(sdt);
        suakh.setHo(ho);
        suakh.setNgaySinh(ngaySinh);
        suakh.setGioi(gioi);
    }//GEN-LAST:event_suaActionPerformed

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không, không thể hoàn tác", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = pattern1CCCD.matcher(cccdKH.getText());
            Matcher matcher2 = pattern1SDT.matcher(sdtKh.getText());
            Matcher matcher3 = pattern1Mail.matcher(mailKH.getText());
            Matcher matcher4 = pattern1MaKH.matcher(maKHThem.getText());
            if (matcher4.matches() == false){
                saiKH.setText("Nhập mã khách hàng không đúng định dạng, phải có dạng 'KHc' với c là 1 số");
                saiCCCD.setText(null);
                saiSDT.setText(null);
                saiMail.setText(null);
            }
            if (ngaySinhKH.getDate() == null) {
                saiNgay.setText("Nhập sai đinh dạng ngày, định dạng là 'Năm-Tháng-Ngày'");
                saiKH.setText(null);
                saiCCCD.setText(null);
                saiSDT.setText(null);
                saiMail.setText(null);
            }
            if (matcher1.matches() == false) {
                saiCCCD.setText("Nhập sai định dạng CCCD");
                saiSDT.setText(null);
                saiMail.setText(null);
                saiNgay.setText(null);
                saiKH.setText(null);
            }
            if (matcher2.matches() == false && sdtKh.getText().equalsIgnoreCase("") == false) {
                saiCCCD.setText(null);
                saiSDT.setText("Nhập sai định dạng SĐT");
                saiMail.setText(null);
                saiNgay.setText(null);
                saiKH.setText(null);
            }
            if (matcher3.matches() == false && mailKH.getText().equalsIgnoreCase("") == false) {
                saiCCCD.setText(null);
                saiSDT.setText(null);
                saiMail.setText("Nhập sai định dạng email");
                saiNgay.setText(null);
                saiKH.setText(null);
            }
            if (matcher4.matches() && ngaySinhKH.getDate() != null && matcher1.matches() && (matcher2.matches() || sdtKh.getText().equalsIgnoreCase("")) && (matcher3.matches() || mailKH.getText().equalsIgnoreCase(""))) {
                connectSQL conn = new connectSQL();
                String maKH = maKHThem.getText();
                String StrCCCD = cccdKH.getText();
                String StrHo = hoKH.getText();
                String StrTen = tenKH.getText();
                Date StrNgaySinh = ngaySinhKH.getDate();
                String StrSDT = sdtKh.getText();
                String StrGioi = gioiKH.getSelectedItem().toString();
                String StrMail = mailKH.getText();
                int result = conn.them_kh(maKH, StrCCCD, StrHo, StrTen, StrNgaySinh, StrSDT, StrGioi, StrMail);
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Thêm hoàn tất", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    ThemKH.dispose();
                    DefaultTableModel model = (DefaultTableModel) tableMetro1.getModel();
                    model.setRowCount(0);
                    this.insertKH();
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {

        }
    }//GEN-LAST:event_xacnhanActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        ThemKH.setVisible(true);
    }//GEN-LAST:event_themActionPerformed

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

    public JTable getTable(){
        return tableMetro1;
    }
    
    public void insertKH(){
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_kh();
        String maKH, cCCD , tenn, ngay, email, so, gioiT;
        try {
            while(rs.next()){
                maKH = rs.getString("MaKH");
                cCCD =rs.getString("CCCD");
                tenn = rs.getString("Ho") + " " + rs.getString("Ten");
                ngay = rs.getString("NgaySinh");
                so = rs.getString("SDT");
                email = rs.getString("Email");
                gioiT = rs.getString("Gioi");
                dT.addRow(new Object[] {maKH, cCCD, tenn, ngay, so, gioiT, email});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_KH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ThemKH;
    private javax.swing.JTextField cccdKH;
    private javax.swing.JComboBox<String> gioiKH;
    private javax.swing.JTextField hoKH;
    private javax.swing.JLabel jLabel1MAKH;
    private javax.swing.JLabel jLabel1MAKH1;
    private javax.swing.JLabel jLabel1MAKH2;
    private javax.swing.JLabel jLabel1MAKH3;
    private javax.swing.JLabel jLabel1MAKH4;
    private javax.swing.JLabel jLabel1MAKH6;
    private javax.swing.JLabel jLabel1MAKH7;
    private javax.swing.JLabel jLabel1MAKH8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private javax.swing.JTextField maKHThem;
    private javax.swing.JLabel maKHThem1;
    private javax.swing.JTextField mailKH;
    private com.toedter.calendar.JDateChooser ngaySinhKH;
    private javax.swing.JLabel saiCCCD;
    private javax.swing.JLabel saiKH;
    private javax.swing.JLabel saiMail;
    private javax.swing.JLabel saiNgay;
    private javax.swing.JLabel saiSDT;
    private javax.swing.JTextField sdtKh;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private javax.swing.JButton sua;
    private rojeru_san.complementos.TableMetro tableMetro1;
    private javax.swing.JTextField tenKH;
    private javax.swing.JButton them;
    private javax.swing.JButton xacnhan;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
