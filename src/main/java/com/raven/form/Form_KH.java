
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_KH extends javax.swing.JPanel {

    private static String ma_kh_xoa, sdt, cccd, ngaySinh, ho, ten, gioi, mail;
    public Form_KH() {
        initComponents();
        this.insertKH();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();
        searchBar = new RSComponentShade.RSTextFieldShade();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        listSearch = new RSMaterialComponent.RSComboBoxMaterial();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        sua = new javax.swing.JButton();

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
                        sua.setVisible(false);
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
        String searchStr = search.getText();
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
        suakh.setDefaultCloseOperation(EXIT_ON_CLOSE);
        suakh.setMKH(ma_kh_xoa);
        suakh.setTen(ten);
        suakh.setCCCD(cccd);
        suakh.setEmail(mail);
        suakh.setSDT(sdt);
        suakh.setHo(ho);
        suakh.setNgaySinh(ngaySinh);
        suakh.setGioi(gioi);
    }//GEN-LAST:event_suaActionPerformed

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
        String maKH, cCCD , ten, ngaySinh, email, sdt, gioi;
        try {
            while(rs.next()){
                maKH = rs.getString("MaKH");
                cCCD =rs.getString("CCCD");
                ten = rs.getString("Ho") + " " + rs.getString("Ten");
                ngaySinh = rs.getString("NgaySinh");
                sdt = rs.getString("SDT");
                email = rs.getString("Email");
                gioi = rs.getString("Gioi");
                dT.addRow(new Object[] {maKH, cCCD, ten, ngaySinh, sdt, gioi, email});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_KH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private javax.swing.JButton sua;
    private rojeru_san.complementos.TableMetro tableMetro1;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
