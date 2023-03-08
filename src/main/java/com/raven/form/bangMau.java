
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class bangMau extends javax.swing.JPanel {

    private static String model;
    private String mauXoa;
    private String tt;
    public bangMau() {
        initComponents();
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void insertBangMau(){
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.bang_mau_model(model);
        DefaultTableModel dt = (DefaultTableModel) tableMetro1.getModel();
        try {
            while(rs.next()){
                dt.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chonMauThem = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMetro2 = new rojeru_san.complementos.TableMetro();
        themMau = new rojeru_san.rsbutton.RSButtonRound();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        searchBar = new rojeru_san.rsfield.RSTextField();
        searchList = new javax.swing.JComboBox<>();
        xoaMau = new rojeru_san.rsbutton.RSButtonRound();
        ttMau = new rojeru_san.rsbutton.RSButtonRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();
        backButton = new RSComponentShade.RSButtonShade();

        chonMauThem.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        chonMauThem.setModal(true);
        chonMauThem.setPreferredSize(new java.awt.Dimension(679, 400));
        chonMauThem.setSize(new java.awt.Dimension(679, 350));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(679, 400));

        tableMetro2.setBackground(new java.awt.Color(255, 204, 255));
        tableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Màu", "Màu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMetro2.setColorFilasBackgound1(new java.awt.Color(255, 204, 102));
        tableMetro2.setColorFilasBackgound2(new java.awt.Color(255, 255, 204));
        tableMetro2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableMetro2.setRowHeight(30);
        jScrollPane2.setViewportView(tableMetro2);
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.mau_chua_co(new Model().getModel());
        DefaultTableModel dt = (DefaultTableModel) tableMetro2.getModel();
        try {
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        tableMetro2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableMetro2.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String id_mau = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với lựa chọn??", "Cảnh báo", JOptionPane.YES_NO_OPTION);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        int result = conn.them_mau_model(model, id_mau);
                        if(result > 0){
                            JOptionPane.showMessageDialog(null, "Thêm hoàn tất", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                            chonMauThem.dispose();
                            DefaultTableModel mo = (DefaultTableModel) tableMetro1.getModel();
                            mo.setRowCount(0);
                            insertBangMau();
                        }else{
                            JOptionPane.showMessageDialog(null, "Không thể hêm", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout chonMauThemLayout = new javax.swing.GroupLayout(chonMauThem.getContentPane());
        chonMauThem.getContentPane().setLayout(chonMauThemLayout);
        chonMauThemLayout.setHorizontalGroup(
            chonMauThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chonMauThemLayout.setVerticalGroup(
            chonMauThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chonMauThemLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        chonMauThem.setLocationRelativeTo(null);

        setBackground(new java.awt.Color(255, 204, 204));

        themMau.setBackground(new java.awt.Color(51, 255, 204));
        themMau.setText("Thêm");
        themMau.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        themMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMauActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setPhColor(new java.awt.Color(102, 102, 255));
        searchBar.setPlaceholder("Nhập......");

        searchList.setBackground(new java.awt.Color(255, 204, 51));
        searchList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã màu", "Tên", "Trạng thái" }));

        xoaMau.setBackground(new java.awt.Color(255, 51, 51));
        xoaMau.setText("Xóa");
        xoaMau.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        xoaMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaMauActionPerformed(evt);
            }
        });

        ttMau.setText("Đổi trạng thái");
        ttMau.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        ttMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttMauActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 500));

        tableMetro1.setBackground(new java.awt.Color(255, 255, 204));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã màu", "Tên", "Trạng thái"
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
        tableMetro1.setColorFilasBackgound1(new java.awt.Color(255, 204, 255));
        tableMetro1.setColorFilasBackgound2(new java.awt.Color(204, 255, 255));
        tableMetro1.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 440));
        tableMetro1.setRowHeight(30);
        jScrollPane1.setViewportView(tableMetro1);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableMetro1.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                ResultSet rs = conn.quyen_tk(new com.raven.main.WelcomeJFrame().getTK());
                JTable tableTemp = (JTable)e.getSource();
                if(e.getClickCount() == 1 && indexRow >= 0){
                    mauXoa = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    tt = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    int a = conn.co_the_xoa_mau_model(mauXoa);
                    if(a > 0){
                        try{
                            rs.next();
                            int quyen = rs.getInt(1);
                            if(quyen == 2){
                                ttMau.setVisible(true);
                            }
                            else if(quyen == 1){
                                xoaMau.setVisible(true);
                                ttMau.setVisible(true);
                            }
                        }
                        catch(SQLException ex){
                            System.out.println(ex);
                        }
                    }else{
                        xoaMau.setVisible(false);
                    }
                }else{

                }
            }
        });

        backButton.setBackground(new java.awt.Color(153, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/goback2.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themMau, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(xoaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchList, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ttMau, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(themMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xoaMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        xoaMau.setVisible(false);
        ttMau.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int selectIndex = searchList.getSelectedIndex();
        String searchStr = searchBar.getText();
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dT);
        tableMetro1.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchStr, selectIndex));
    }//GEN-LAST:event_searchActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Model modell = new Model();
        Main main = new Main();
        main.getMain().setForm(modell);
        main.setStatusModel(0);
    }//GEN-LAST:event_backButtonActionPerformed

    private void themMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMauActionPerformed
        // TODO add your handling code here:
        chonMauThem.setVisible(true);
    }//GEN-LAST:event_themMauActionPerformed

    private void xoaMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaMauActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa không??", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.xoa_mau_model(mauXoa);
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dt = (DefaultTableModel) tableMetro1.getModel();
                dt.setRowCount(0);
                insertBangMau();
            }else{
                JOptionPane.showMessageDialog(null, "Xóa không thành công", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_xoaMauActionPerformed

    private void ttMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttMauActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thay đổi không??", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.doi_tt_mau(mauXoa, tt);
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Đổi thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel dt = (DefaultTableModel) tableMetro1.getModel();
                dt.setRowCount(0);
                insertBangMau();
            }else{
                JOptionPane.showMessageDialog(null, "Đổi không thành công", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ttMauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSComponentShade.RSButtonShade backButton;
    private javax.swing.JDialog chonMauThem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private rojeru_san.rsfield.RSTextField searchBar;
    private javax.swing.JComboBox<String> searchList;
    private rojeru_san.complementos.TableMetro tableMetro1;
    private rojeru_san.complementos.TableMetro tableMetro2;
    private rojeru_san.rsbutton.RSButtonRound themMau;
    private rojeru_san.rsbutton.RSButtonRound ttMau;
    private rojeru_san.rsbutton.RSButtonRound xoaMau;
    // End of variables declaration//GEN-END:variables
}
