
package com.raven.form;

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
import javax.swing.ListSelectionModel;;
import java.util.regex.*;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;


public class NangCao extends javax.swing.JPanel {
    private final static String regexSDT = "0\\d{9}";
    private final static String regexMail = "[A-Za-z0-9]+@gmail\\.com";
    private final static String regexMaNV = "(NV\\d{1,8})";
    private final static Pattern pattern1SDT = Pattern.compile(regexSDT);
    private final static Pattern pattern1Mail = Pattern.compile(regexMail);
    private final static Pattern pattern1MaKH = Pattern.compile(regexMaNV);
    
    
    private static int quyen;
    private static String tk;
    private static String Mk;
    private static String tt;
    
    private String maNVStr;
    private String hoStr;
    private String tenStr;
    private String sdtStr;
    private String ngaySStr;
    private String emailStr;
    private String gioiStr;
    public NangCao() {
        initComponents();
        insertNV();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taiKhoan = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tentk = new javax.swing.JLabel();
        mk = new javax.swing.JLabel();
        tthai = new javax.swing.JLabel();
        phanCap = new javax.swing.JLabel();
        doiPass = new javax.swing.JButton();
        suaQ = new javax.swing.JButton();
        suaTT = new javax.swing.JButton();
        themnv = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        manv = new javax.swing.JTextField();
        ho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ten = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        clock1 = new com.raven.component.Clock();
        jLabel6 = new javax.swing.JLabel();
        ngayS = new com.toedter.calendar.JDateChooser();
        saiMaNV = new javax.swing.JLabel();
        saiMail = new javax.swing.JLabel();
        saiSDT = new javax.swing.JLabel();
        saiNgay = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gioi = new javax.swing.JComboBox<>();
        suaNV = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hoSua = new javax.swing.JTextField();
        tenSua = new javax.swing.JTextField();
        sdtSua = new javax.swing.JTextField();
        mailSua = new javax.swing.JTextField();
        gioiSua = new javax.swing.JComboBox<>();
        sdtSuaSai = new javax.swing.JLabel();
        mailSuaSai = new javax.swing.JLabel();
        xacnhanSua = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        ngaySinhSua = new com.toedter.calendar.JDateChooser();
        saiNgaySinhSua = new javax.swing.JLabel();
        suaPass = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        mkMoi = new javax.swing.JTextField();
        passConfirm = new javax.swing.JButton();
        chonQ = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        ds_q = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        xacQ = new rojeru_san.rsbutton.RSButtonRound();
        chonTT = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        dsTT = new javax.swing.JComboBox<>();
        confirmTT = new rojeru_san.rsbutton.RSButtonRound();
        them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanVien = new javax.swing.JTable();
        choNghi = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        searchBar = new rojeru_san.rsfield.RSTextField();
        listSearch = new javax.swing.JComboBox<>();

        taiKhoan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        taiKhoan.setModal(true);
        taiKhoan.setResizable(false);
        taiKhoan.setSize(new java.awt.Dimension(717, 380));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quyền:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tên tài khoản:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Trạng thái:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        tentk.setBackground(new java.awt.Color(153, 153, 255));
        tentk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mk.setBackground(new java.awt.Color(153, 153, 255));
        mk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tthai.setBackground(new java.awt.Color(153, 153, 255));
        tthai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phanCap.setBackground(new java.awt.Color(153, 153, 255));
        phanCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        doiPass.setBackground(new java.awt.Color(255, 51, 51));
        doiPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doiPass.setForeground(new java.awt.Color(255, 255, 51));
        doiPass.setText("Sửa");
        doiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiPassActionPerformed(evt);
            }
        });

        suaQ.setBackground(new java.awt.Color(255, 51, 51));
        suaQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        suaQ.setForeground(new java.awt.Color(255, 255, 0));
        suaQ.setText("Sửa");
        suaQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaQActionPerformed(evt);
            }
        });

        suaTT.setBackground(new java.awt.Color(255, 51, 51));
        suaTT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        suaTT.setForeground(new java.awt.Color(255, 255, 0));
        suaTT.setText("Sửa");
        suaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tthai, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(tentk, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phanCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mk, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doiPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaTT, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tentk, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doiPass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(phanCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tthai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(suaTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout taiKhoanLayout = new javax.swing.GroupLayout(taiKhoan.getContentPane());
        taiKhoan.getContentPane().setLayout(taiKhoanLayout);
        taiKhoanLayout.setHorizontalGroup(
            taiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        taiKhoanLayout.setVerticalGroup(
            taiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        taiKhoan.setLocationRelativeTo(null);

        themnv.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        themnv.setModal(true);
        themnv.setResizable(false);
        themnv.setSize(new java.awt.Dimension(800, 650));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(846, 640));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 371, 40));
        jPanel2.add(ho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 371, 39));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mã nhân viên:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 199, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 199, 39));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Họ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 39));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Ngày sinh:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 199, 39));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Tên");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 199, 39));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Số điện thoại");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 199, 39));
        jPanel2.add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 371, 39));
        jPanel2.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 371, 39));
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 371, 39));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Xác nhận");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 126, 40));

        clock1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.add(clock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 371, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Ngày vào làm:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 199, 32));

        ngayS.setDateFormatString("yyyy-MM-dd");
        ngayS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(ngayS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 371, 39));
        jPanel2.add(saiMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 192, 20));
        jPanel2.add(saiMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 430, 190, 20));

        saiSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiSDT.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(saiSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 200, 20));

        saiNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgay.setForeground(new java.awt.Color(255, 51, 0));
        jPanel2.add(saiNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 170, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Giới:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 210, 40));

        gioi.setBackground(new java.awt.Color(204, 153, 255));
        gioi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel2.add(gioi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 150, 40));

        javax.swing.GroupLayout themnvLayout = new javax.swing.GroupLayout(themnv.getContentPane());
        themnv.getContentPane().setLayout(themnvLayout);
        themnvLayout.setHorizontalGroup(
            themnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        themnvLayout.setVerticalGroup(
            themnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        themnv.setLocationRelativeTo(null);

        suaNV.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        suaNV.setModal(true);
        suaNV.setResizable(false);
        suaNV.setSize(new java.awt.Dimension(794, 630));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(838, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Họ:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, 126, 41));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Tên:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 122, 126, 39));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Số điện thoại");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 190, 160, 44));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Mail:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 282, 126, 41));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Giới:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 368, 126, 42));
        jPanel3.add(hoSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 40, 337, 41));
        jPanel3.add(tenSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 122, 337, 39));
        jPanel3.add(sdtSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 193, 337, 44));

        mailSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(mailSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 282, 337, 41));

        gioiSua.setBackground(new java.awt.Color(255, 153, 204));
        gioiSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gioiSua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel3.add(gioiSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 368, 124, 42));

        sdtSuaSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sdtSuaSai.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(sdtSuaSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 240, 210, 20));

        mailSuaSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mailSuaSai.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(mailSuaSai, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 190, 20));

        xacnhanSua.setBackground(new java.awt.Color(102, 153, 255));
        xacnhanSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xacnhanSua.setText("Xác nhận");
        xacnhanSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanSuaActionPerformed(evt);
            }
        });
        jPanel3.add(xacnhanSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 110, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Ngày sinh:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 100, 40));

        ngaySinhSua.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(ngaySinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 340, 50));

        saiNgaySinhSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgaySinhSua.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(saiNgaySinhSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 160, 20));

        javax.swing.GroupLayout suaNVLayout = new javax.swing.GroupLayout(suaNV.getContentPane());
        suaNV.getContentPane().setLayout(suaNVLayout);
        suaNVLayout.setHorizontalGroup(
            suaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        suaNVLayout.setVerticalGroup(
            suaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        suaNV.setLocationRelativeTo(null);

        suaPass.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        suaPass.setModal(true);
        suaPass.setSize(new java.awt.Dimension(575, 225));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Mật khẩu mới:");

        mkMoi.setBackground(new java.awt.Color(255, 153, 204));
        mkMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mkMoi.setOpaque(true);

        passConfirm.setBackground(new java.awt.Color(255, 51, 51));
        passConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passConfirm.setForeground(new java.awt.Color(255, 255, 0));
        passConfirm.setText("Xác nhận");
        passConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mkMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(passConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout suaPassLayout = new javax.swing.GroupLayout(suaPass.getContentPane());
        suaPass.getContentPane().setLayout(suaPassLayout);
        suaPassLayout.setHorizontalGroup(
            suaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        suaPassLayout.setVerticalGroup(
            suaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        suaPass.setLocationRelativeTo(null);

        chonQ.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        chonQ.setModal(true);
        chonQ.setSize(new java.awt.Dimension(475, 212));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        ds_q.setBackground(new java.awt.Color(204, 204, 255));
        ds_q.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ds_q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị", "Nhân viên" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Chọn quyền");

        xacQ.setBackground(new java.awt.Color(153, 102, 255));
        xacQ.setText("Xác nhận");
        xacQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ds_q, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xacQ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ds_q)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(xacQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout chonQLayout = new javax.swing.GroupLayout(chonQ.getContentPane());
        chonQ.getContentPane().setLayout(chonQLayout);
        chonQLayout.setHorizontalGroup(
            chonQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        chonQLayout.setVerticalGroup(
            chonQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        chonQ.setLocationRelativeTo(null);

        chonTT.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        chonTT.setModal(true);
        chonTT.setSize(new java.awt.Dimension(578, 279));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Chọn trạng thái");

        dsTT.setBackground(new java.awt.Color(255, 153, 51));
        dsTT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dsTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vô hiệu", "Hoạt động" }));

        confirmTT.setBackground(new java.awt.Color(255, 153, 204));
        confirmTT.setForeground(new java.awt.Color(0, 0, 0));
        confirmTT.setText("Xác nhận");
        confirmTT.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        confirmTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsTT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmTT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dsTT, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(confirmTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout chonTTLayout = new javax.swing.GroupLayout(chonTT.getContentPane());
        chonTT.getContentPane().setLayout(chonTTLayout);
        chonTTLayout.setHorizontalGroup(
            chonTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chonTTLayout.setVerticalGroup(
            chonTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        chonTT.setLocationRelativeTo(null);

        setBackground(new java.awt.Color(255, 204, 153));

        them.setBackground(new java.awt.Color(102, 255, 102));
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        tableNhanVien.setBackground(new java.awt.Color(153, 255, 255));
        tableNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ", "Tên", "Số điện thoại", "Ngày sinh", "Email", "Giới tính", "Ngày vào làm", "Ngày nghỉ việc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhanVien.setRowHeight(25);
        jScrollPane1.setViewportView(tableNhanVien);
        tableNhanVien.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableNhanVien.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableNhanVien.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    ResultSet rs = conn.xem_tk(temp);
                    try{
                        rs.next();
                        tk = rs.getString(1);
                        Mk = rs.getString(2);
                        tt = rs.getString(3);
                        quyen = Integer.parseInt(rs.getString(4));
                    }catch(SQLException ex){
                        System.out.println(ex);
                    }
                    tentk.setText(tk);
                    mk.setText(Mk);
                    if(tt.equalsIgnoreCase("1")){
                        tthai.setText("Hoạt động");
                    }else{
                        tthai.setText("Vô hiệu");
                    }
                    if(quyen == 1){
                        phanCap.setText("Quản lí");
                    }else{
                        phanCap.setText("Nhân viên");
                    }
                    if(tk.equalsIgnoreCase(new com.raven.main.WelcomeJFrame().getTK())){
                        suaQ.setVisible(false);
                        suaTT.setVisible(false);
                    }else{
                        suaQ.setVisible(true);
                        suaTT.setVisible(true);
                    }
                    taiKhoan.setVisible(true);

                }else if(e.getClickCount() == 1){
                    maNVStr = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    hoStr = tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    tenStr = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    sdtStr = tableTemp.getModel().getValueAt(indexRow, 3)+"";
                    ngaySStr = tableTemp.getModel().getValueAt(indexRow, 4)+"";
                    emailStr = tableTemp.getModel().getValueAt(indexRow, 5)+"";
                    gioiStr = tableTemp.getModel().getValueAt(indexRow, 6)+"";
                    sua.setVisible(true);
                    if ((tableTemp.getModel().getValueAt(indexRow, 8)+"").equalsIgnoreCase("null")){
                        choNghi.setVisible(true);
                    }else{
                        choNghi.setVisible(false);
                    }
                    if((new com.raven.main.WelcomeJFrame().getTK().equalsIgnoreCase(maNVStr.strip()))){
                        choNghi.setVisible(false);
                    }
                }
            }
        });

        choNghi.setBackground(new java.awt.Color(153, 153, 153));
        choNghi.setText("Cho thôi");
        choNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choNghiActionPerformed(evt);
            }
        });

        sua.setBackground(new java.awt.Color(255, 153, 153));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setPhColor(new java.awt.Color(204, 204, 204));
        searchBar.setPlaceholder("Nhập ở đây.....");

        listSearch.setBackground(new java.awt.Color(255, 153, 153));
        listSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Họ", "Tên", "Số điện thoại", "Ngày sinh", "Email", "Giới tính", "Ngày vào làm", "Ngày nghỉ việc" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(choNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(listSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        choNghi.setVisible(false);
        sua.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        manv.setText(null);
        ho.setText(null);
        ten.setText(null);
        ngayS.setDate(null);
        sdt.setText(null);
        mail.setText(null);
        gioi.setSelectedIndex(0);
        themnv.setVisible(true);
    }//GEN-LAST:event_themActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với thông tin vừa nhập chưa??", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher2 = pattern1SDT.matcher(sdt.getText());
            Matcher matcher3 = pattern1Mail.matcher(mail.getText());
            Matcher matcher4 = pattern1MaKH.matcher(manv.getText());
            if(ngayS.getDate() == null){
                saiNgay.setText("Nhập sai đinh dạng ngày, định dạng là 'Năm-Tháng-Ngày'");
                saiSDT.setText(null);
                saiMail.setText(null);
                saiMaNV.setText(null);
            }
            if (matcher4.matches() == false) {
                saiMaNV.setText("Nhập mã nhân viên không đúng định dạng, phải có dạng 'NVc' với c là 1 số");
                saiSDT.setText(null);
                saiMail.setText(null);
                saiNgay.setText(null);
            }
            if (matcher2.matches() == false && sdt.getText().equalsIgnoreCase("") == false) {
                saiMaNV.setText(null);
                saiSDT.setText("Nhập sai định dạng SĐT");
                saiMail.setText(null);
                saiNgay.setText(null);
            }
            if (matcher3.matches() == false && mail.getText().equalsIgnoreCase("") == false) {
                saiSDT.setText(null);
                saiMail.setText("Nhập sai định dạng email");
                saiNgay.setText(null);
                saiMaNV.setText(null);
            }
            if (matcher4.matches() && ngayS.getDate() != null && (matcher2.matches() || sdt.getText().equalsIgnoreCase("")) && (matcher3.matches() || mail.getText().equalsIgnoreCase(""))) {
                connectSQL conn = new connectSQL();
                int result = -1, themTk = -1, themQuyen = -1, suaQuyen = -1;
                result = conn.them_nv(manv.getText(), ho.getText(), ten.getText(), ngayS.getDate(), sdt.getText(), mail.getText(), clock1.getDate(), gioi.getSelectedItem().toString());
                themTk = conn.them_tk(manv.getText());
//                suaQuyen = conn.doi_quyen(manv.getText(), 2);
//                themQuyen = conn.doi_quyen(manv.getText(), 2);
                if (result >0){
                    JOptionPane.showMessageDialog(null, "Thêm hoàn tất", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    themnv.dispose();
                    DefaultTableModel model = (DefaultTableModel) tableNhanVien.getModel();
                    model.setRowCount(0);
                    insertNV();
                }else{
                    JOptionPane.showMessageDialog(null, "Thêm không thành công", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(ngaySStr);
            ngaySinhSua.setDate(date);
        } catch (ParseException e) {
        }
        if(hoStr.equalsIgnoreCase("null")){
            hoSua.setText("");
        }else{
            hoSua.setText(hoStr);
        }
        if(tenStr.equalsIgnoreCase("null")){
            tenSua.setText("");
        }else{
            tenSua.setText(tenStr);
        }
        if(sdtStr.equalsIgnoreCase("null")){
            sdtSua.setText("");
        }else{
            sdtSua.setText(sdtStr);
        }
        if(emailStr.equalsIgnoreCase("null")){
            mailSua.setText("");
        }else{
            mailSua.setText(emailStr);
        }
        suaNV.setVisible(true);
    }//GEN-LAST:event_suaActionPerformed

    private void xacnhanSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanSuaActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không, không thể hoàn tác", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher2 = pattern1SDT.matcher(sdtSua.getText());
            Matcher matcher3 = pattern1Mail.matcher(mailSua.getText());
            if (ngaySinhSua.getDate() == null){
                saiNgaySinhSua.setText("Sai định dạng ngày!!!");
                sdtSuaSai.setText(null);
                mailSuaSai.setText(null);
            }
            if(matcher2.matches() == false && sdtSua.getText().equalsIgnoreCase("") == false){
                saiNgaySinhSua.setText(null);
                sdtSuaSai.setText("Nhập sai định dạng sđt");
                mailSuaSai.setText(null);
            }
            if(matcher3.matches() == false && mailSua.getText().equalsIgnoreCase("") == false){
                sdtSuaSai.setText(null);
                mailSuaSai.setText("Sai định dạng email");
                saiNgaySinhSua.setText(null);
            }
            if(ngaySinhSua.getDate() != null && (matcher2.matches() || sdtSua.getText().equalsIgnoreCase("")) && (matcher3.matches() || mailSua.getText().equalsIgnoreCase(""))){
                connectSQL conn = new connectSQL();
                int result = conn.sua_nv(maNVStr, hoSua.getText(), tenSua.getText(), sdtSua.getText(), mailSua.getText(), gioiSua.getSelectedItem().toString(), ngaySinhSua.getDate());
                if (result > 0){
                    JOptionPane.showMessageDialog(null, "Hoàn tất chỉnh sửa", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    suaNV.dispose();
                    DefaultTableModel model = (DefaultTableModel) tableNhanVien.getModel();
                    model.setRowCount(0);
                    insertNV();
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thất bại", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_xacnhanSuaActionPerformed

    private void choNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choNghiActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Điều ngày cũng đồng nghĩa tài khoản của nhân viên cũng sẽ bị vô hiệu hóa, bán chăc chứ????", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.nghi_viec(maNVStr);
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Đã cho nghỉ", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dt = (DefaultTableModel) tableNhanVien.getModel();
                dt.setRowCount(0);
                insertNV();
            }else{
                JOptionPane.showMessageDialog(null, "Chưa thể đuổi được!!!!!", "THất bại", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            
        }
        
    }//GEN-LAST:event_choNghiActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = listSearch.getSelectedIndex();
        String searchStr = searchBar.getText();
        DefaultTableModel dT = (DefaultTableModel) tableNhanVien.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableNhanVien.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

    private void doiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiPassActionPerformed
        // TODO add your handling code here:
        suaPass.setVisible(true);
    }//GEN-LAST:event_doiPassActionPerformed

    private void passConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConfirmActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn chắc chứ?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            if(mkMoi.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Mật khẩu không được để trống");
            }else{
                connectSQL conPass = new connectSQL();
                int result = conPass.changePass(mkMoi.getText(), tk);
                if(result > 0){
                    JOptionPane.showInternalMessageDialog(null, "Thành công");
                    Mk = mkMoi.getText();
                    mk.setText(Mk);
                    new com.raven.main.WelcomeJFrame().setMK(Mk);
                    suaPass.dispose();
                }else{
                    JOptionPane.showInternalMessageDialog(null, "Không thành công");
                }
            }
        }else{
            
        }
    }//GEN-LAST:event_passConfirmActionPerformed

    private void xacQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacQActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn chắc chứ, mỗi ngày chỉ dược đổi quyền 1 lần hãy lưu ý?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conQ = new connectSQL();
            int result = conQ.doi_quyen(tk, ds_q.getSelectedIndex()+1);
            if (result > 0) {
                JOptionPane.showInternalMessageDialog(null, "Thành công");
                Mk = mkMoi.getText();
                mk.setText(Mk);
                new com.raven.main.WelcomeJFrame().setMK(Mk);
                suaPass.dispose();
            } else {
                JOptionPane.showInternalMessageDialog(null, "Không thành công");
            }
        }else{
            
        }
    }//GEN-LAST:event_xacQActionPerformed

    private void confirmTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTTActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với lựa chọn???", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conTT = new connectSQL();
            int ttMoi = dsTT.getSelectedIndex();
            int result = conTT.sua_TT(ttMoi, tk);
            if(result > 0){
                JOptionPane.showInternalMessageDialog(null, "Thành công");
                chonTT.dispose();
                tt = String.valueOf(ttMoi);
                if(ttMoi == 0){
                    tthai.setText("Vô hiệu");
                }else if(ttMoi == 1){
                    tthai.setText("Hoạt động");
                }
            }else{
                JOptionPane.showInternalMessageDialog(null, "Không thành công");
            }
        }else{
            
        }
    }//GEN-LAST:event_confirmTTActionPerformed

    private void suaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaTTActionPerformed
        // TODO add your handling code here:
        dsTT.setSelectedIndex(Integer.parseInt(tt));
        chonTT.setVisible(true);
    }//GEN-LAST:event_suaTTActionPerformed

    private void suaQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaQActionPerformed
        // TODO add your handling code here:
        ds_q.setSelectedIndex(quyen-1);
        chonQ.setVisible(true);
    }//GEN-LAST:event_suaQActionPerformed

    public void insertNV(){
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_nv();
        DefaultTableModel model = (DefaultTableModel) tableNhanVien.getModel();
        String manv, ho, ten, sdt, ngaySinh, email, gioi, ngayVao, ngayRa;
        try {
            while(rs.next()){
                manv = rs.getString(1);
                ho = rs.getString(2);
                ten = rs.getString(3);
                ngaySinh = rs.getString(4);
                email = rs.getString(6);
                gioi = rs.getString(9);
                ngayVao = rs.getString(7);
                ngayRa = rs.getString(8);
                sdt = rs.getString(5);
                model.addRow(new Object[]{manv, ho, ten, sdt, ngaySinh, email, gioi, ngayVao, ngayRa});
            }
        } catch (SQLException ex) {
            Logger.getLogger(NangCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choNghi;
    private javax.swing.JDialog chonQ;
    private javax.swing.JDialog chonTT;
    private com.raven.component.Clock clock1;
    private rojeru_san.rsbutton.RSButtonRound confirmTT;
    private javax.swing.JButton doiPass;
    private javax.swing.JComboBox<String> dsTT;
    private javax.swing.JComboBox<String> ds_q;
    private javax.swing.JComboBox<String> gioi;
    private javax.swing.JComboBox<String> gioiSua;
    private javax.swing.JTextField ho;
    private javax.swing.JTextField hoSua;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listSearch;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mailSua;
    private javax.swing.JLabel mailSuaSai;
    private javax.swing.JTextField manv;
    private javax.swing.JLabel mk;
    private javax.swing.JTextField mkMoi;
    private com.toedter.calendar.JDateChooser ngayS;
    private com.toedter.calendar.JDateChooser ngaySinhSua;
    private javax.swing.JButton passConfirm;
    private javax.swing.JLabel phanCap;
    private javax.swing.JLabel saiMaNV;
    private javax.swing.JLabel saiMail;
    private javax.swing.JLabel saiNgay;
    private javax.swing.JLabel saiNgaySinhSua;
    private javax.swing.JLabel saiSDT;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField sdtSua;
    private javax.swing.JLabel sdtSuaSai;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private rojeru_san.rsfield.RSTextField searchBar;
    private javax.swing.JButton sua;
    private javax.swing.JDialog suaNV;
    private javax.swing.JDialog suaPass;
    private javax.swing.JButton suaQ;
    private javax.swing.JButton suaTT;
    private javax.swing.JTable tableNhanVien;
    private javax.swing.JDialog taiKhoan;
    private javax.swing.JTextField ten;
    private javax.swing.JTextField tenSua;
    private javax.swing.JLabel tentk;
    private javax.swing.JButton them;
    private javax.swing.JDialog themnv;
    private javax.swing.JLabel tthai;
    private rojeru_san.rsbutton.RSButtonRound xacQ;
    private javax.swing.JButton xacnhanSua;
    // End of variables declaration//GEN-END:variables
}
