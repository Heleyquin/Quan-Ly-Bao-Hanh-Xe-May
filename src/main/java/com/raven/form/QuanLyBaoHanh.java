
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author RAVEN
 */
public class QuanLyBaoHanh extends javax.swing.JPanel {

    private static String id_nhan;
    private static String id_xoa;
    public QuanLyBaoHanh() {
        initComponents();
        this.insertTable();
    }

    public JTable getTable(){
        return tableMetro1;
    }
    public void setId_xoa(String id_xoa){
        this.id_xoa = id_xoa;
    }
    public String getId_xoa(){
        return id_xoa;
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
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableMetro1.setBackground(new java.awt.Color(153, 255, 255));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhận", "Mã thẻ bảo hành", "Nhân viên nhận", "Ngày tiếp nhận", "Nhân viên trả", "Ngày trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    Main main = new Main();
                    id_nhan = temp;
                    CTBH_JPanel CTBH = new CTBH_JPanel();
                    main.getMain().setForm(CTBH);
                    main.setStatusBH(1);
                }else if(e.getClickCount() == 1){
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    id_xoa = temp;
                    int a = conn.co_the_xoa_sua_pbh_nhan(temp);
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
        listSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã phiếu nhận", "Mã thẻ bảo hành", "Nhân viên nhận", "Ngày tiếp nhận", "Nhân viên trả", "Ngày trả" }));

        them.setBackground(new java.awt.Color(51, 255, 51));
        them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setLabel("Thêm");

        sua.setBackground(new java.awt.Color(255, 102, 102));
        sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sua.setForeground(new java.awt.Color(255, 255, 255));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        sua.setVisible(false);
        xoa.setVisible(false);
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
            if (result > 0){
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
                dT.setRowCount(0);
                this.insertTable();
            }
        } else {
            
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        NV_SUA_PBH_NHAN suapbh = new NV_SUA_PBH_NHAN(tableMetro1);
        this.setId_nhan(id_nhan);
        suapbh.setVisible(true);
        suapbh.setLocationRelativeTo(null);
        suapbh.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_suaActionPerformed

    public void setId_nhan(String id_nhan){
        this.id_nhan = id_nhan;
    }
    public String getId_nhan(){
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

    public QuanLyBaoHanh getQLH(){
        return this;
    }
    
    public void insertTable(){
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_pbh_nhan();
        try {
            while(rs.next()){
                dT.addRow(new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBaoHanh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSComboBoxMaterial listSearch;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private RSComponentShade.RSTextFieldShade searchBar;
    private javax.swing.JButton sua;
    private static rojeru_san.complementos.TableMetro tableMetro1;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
