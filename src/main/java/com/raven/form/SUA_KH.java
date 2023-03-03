
package com.raven.form;

import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class SUA_KH extends javax.swing.JFrame {

    private final static String regexCCCD = "\\d{12}";
    private final static String regexSDT = "0\\d{9}";
    private final static String regexMail = "[A-Za-z0-9]+@gmail\\.com";
    private final static Pattern pattern1CCCD = Pattern.compile(regexCCCD);
    private final static Pattern pattern1SDT = Pattern.compile(regexSDT);
    private final static Pattern pattern1Mail = Pattern.compile(regexMail);
    private JTable table;
    public SUA_KH(JTable table) {
        this.table = table;
        this.setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1MAKH = new javax.swing.JLabel();
        jLabel1MAKH1 = new javax.swing.JLabel();
        jLabel1MAKH2 = new javax.swing.JLabel();
        jLabel1MAKH3 = new javax.swing.JLabel();
        jLabel1MAKH4 = new javax.swing.JLabel();
        jLabel1MAKH5 = new javax.swing.JLabel();
        jLabel1MAKH6 = new javax.swing.JLabel();
        xacNhan = new javax.swing.JButton();
        ho = new javax.swing.JTextField();
        jLabel1MAKH7 = new javax.swing.JLabel();
        cccd = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        jLabel1MAKH8 = new javax.swing.JLabel();
        ten = new javax.swing.JTextField();
        ngaySinh = new com.toedter.calendar.JDateChooser();
        saiSDT = new javax.swing.JLabel();
        gioi = new javax.swing.JComboBox<>();
        saiMail = new javax.swing.JLabel();
        saiNgay = new javax.swing.JLabel();
        saiCCCD = new javax.swing.JLabel();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1MAKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH.setText("CCCD:");

        jLabel1MAKH1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH1.setText("EMAIL:");

        jLabel1MAKH2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH2.setText("TÊN:");

        jLabel1MAKH3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH3.setText("NGÀY SINH (yyyy-MM-dd):");

        jLabel1MAKH4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH4.setText("SỐ ĐIỆN THOẠI:");

        jLabel1MAKH5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1MAKH5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1MAKH6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH6.setText("GIỚI TÍNH:");

        xacNhan.setBackground(new java.awt.Color(51, 255, 204));
        xacNhan.setLabel("Xác nhận");
        xacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanActionPerformed(evt);
            }
        });

        ho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1MAKH7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH7.setText("Mã khách hàng:");

        cccd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sdt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1MAKH8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1MAKH8.setText("HỌ:");

        ten.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ngaySinh.setDateFormatString("yyyy-MM-dd");
        ngaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ngaySinh.setName("ngaySinh"); // NOI18N
        ngaySinh.setPreferredSize(new java.awt.Dimension(200, 100));

        saiSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiSDT.setForeground(new java.awt.Color(255, 0, 51));

        gioi.setBackground(new java.awt.Color(204, 204, 255));
        gioi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        saiMail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiMail.setForeground(new java.awt.Color(255, 0, 0));

        saiNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiNgay.setForeground(new java.awt.Color(255, 0, 51));

        saiCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiCCCD.setForeground(new java.awt.Color(255, 0, 51));

        thoat.setBackground(new java.awt.Color(255, 204, 204));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1MAKH8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ho, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1MAKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1MAKH3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1MAKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1MAKH6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gioi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(saiMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saiSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(saiNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1MAKH4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saiCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1MAKH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1MAKH7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cccd)
                                    .addComponent(jLabel1MAKH5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(xacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1MAKH7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1MAKH5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1MAKH, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1MAKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1MAKH8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1MAKH3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1MAKH4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saiSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1MAKH6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gioi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1MAKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiMail, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không, không thể hoàn tác", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = pattern1CCCD.matcher(cccd.getText());
            Matcher matcher2 = pattern1SDT.matcher(sdt.getText());
            Matcher matcher3 = pattern1Mail.matcher(mail.getText());
            if (ngaySinh.getDate() == null) {
                saiNgay.setText("Nhập sai đinh dạng ngày, định dạng là 'Năm-Tháng-Ngày'");
                saiCCCD.setText(null);
                saiSDT.setText(null);
                saiMail.setText(null);
            }
            if (matcher1.matches() == false) {
                saiCCCD.setText("Nhập sai định dạng CCCD");
                saiSDT.setText(null);
                saiMail.setText(null);
                saiNgay.setText(null);
            }
            if (matcher2.matches() == false && sdt.getText().equalsIgnoreCase("") == false) {
                saiCCCD.setText(null);
                saiSDT.setText("Nhập sai định dạng SĐT");
                saiMail.setText(null);
                saiNgay.setText(null);
            }
            if (matcher3.matches() == false && mail.getText().equalsIgnoreCase("") == false) {
                saiCCCD.setText(null);
                saiSDT.setText(null);
                saiMail.setText("Nhập sai định dạng email");
                saiNgay.setText(null);
            }
            if (ngaySinh.getDate() != null && matcher1.matches() && (matcher2.matches() || sdt.getText().equalsIgnoreCase("")) && (matcher3.matches() || mail.getText().equalsIgnoreCase(""))) {
                connectSQL conn = new connectSQL();
                String StrMaKH = jLabel1MAKH5.getText();
                String StrCCCD = cccd.getText();
                String StrHo = ho.getText();
                String StrTen = ten.getText();
                Date StrNgaySinh = ngaySinh.getDate();
                String StrSDT = sdt.getText();
                String StrGioi = gioi.getSelectedItem().toString();
                String StrMail = mail.getText();
                int result = conn.sua_kh(StrMaKH, StrCCCD, StrHo, StrTen, StrGioi, StrMail, StrNgaySinh, StrSDT);
                if (result > 0){
                    JOptionPane.showMessageDialog(null, "Hoàn tất chỉnh sửa", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    ResultSet rs = conn.ds_kh();
                    String maKH, cCCD , tenn, ngaySinhh, email, SDT, gioiT;
                    try {
                        while (rs.next()) {
                            maKH = rs.getString("MaKH");
                            cCCD = rs.getString("CCCD");
                            tenn = rs.getString("Ho") + " " + rs.getString("Ten");
                            ngaySinhh = rs.getString("NgaySinh");
                            SDT = rs.getString("SDT");
                            email = rs.getString("Email");
                            gioiT = rs.getString("Gioi");
                            model.addRow(new Object[]{maKH, cCCD, tenn, ngaySinhh, SDT, gioiT, email});
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(QuanLyBaoHanh.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Chỉnh sửa thất bại", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }else{
            
        }
    }//GEN-LAST:event_xacNhanActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_thoatActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUA_KH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUA_KH(new Form_KH().getTable()).setVisible(true);
            }
        });
    }

    public void setMKH(String mkh){
        jLabel1MAKH5.setText(mkh);
    }
    public void setCCCD(String cccd){
        this.cccd.setText(cccd);
    }
    public void setHo(String ho){
        this.ho.setText(ho);
    }
    public void setTen(String ten){
        this.ten.setText(ten);
    }
    public void setNgaySinh(String ngaySinh){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(ngaySinh);
            this.ngaySinh.setDate(date);
        } catch (ParseException e) {
        }
    }
    public void setSDT(String sdt){
        if (sdt.equalsIgnoreCase("null")){
            this.sdt.setText("");
        }
        else{
            this.sdt.setText(sdt);
        }
    }
    public void setGioi(String gioiTinh){
        if (gioiTinh.equalsIgnoreCase("Nam")){
            this.gioi.setSelectedIndex(0);
        }
        else{
            this.gioi.setSelectedIndex(1);
        }
    }
    public void setEmail(String mail){
        if (mail.equalsIgnoreCase("null")){
            this.mail.setText("");
        }
        else{
            this.mail.setText(mail);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cccd;
    private javax.swing.JComboBox<String> gioi;
    private javax.swing.JTextField ho;
    private javax.swing.JLabel jLabel1MAKH;
    private javax.swing.JLabel jLabel1MAKH1;
    private javax.swing.JLabel jLabel1MAKH2;
    private javax.swing.JLabel jLabel1MAKH3;
    private javax.swing.JLabel jLabel1MAKH4;
    private javax.swing.JLabel jLabel1MAKH5;
    private javax.swing.JLabel jLabel1MAKH6;
    private javax.swing.JLabel jLabel1MAKH7;
    private javax.swing.JLabel jLabel1MAKH8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private com.toedter.calendar.JDateChooser ngaySinh;
    private javax.swing.JLabel saiCCCD;
    private javax.swing.JLabel saiMail;
    private javax.swing.JLabel saiNgay;
    private javax.swing.JLabel saiSDT;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField ten;
    private javax.swing.JButton thoat;
    private javax.swing.JButton xacNhan;
    // End of variables declaration//GEN-END:variables
}
