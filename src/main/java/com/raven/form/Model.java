
package com.raven.form;

import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Model extends javax.swing.JPanel {
    private final static String regexMD = "(MD\\d{1,8})";
    private final static String regexDau = "[\\p{L}\\d\\s]*";
    private static final String regexFloat = "^\\d+(\\.\\d+)?$";
    private final static Pattern patternMD = Pattern.compile(regexMD);
    private final static Pattern patternSo = Pattern.compile(regexFloat);
    private final static Pattern patternDau = Pattern.compile(regexDau);
    
    private String maXoa;
    private static String model;
    public Model() {
        initComponents();
        insertModel();
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void insertModel(){
        connectSQL conn = new connectSQL();
        ResultSet rs = conn.ds_model();
        DefaultTableModel dT = (DefaultTableModel) tableMetro1.getModel();
        try {
            while (rs.next()) {
                dT.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThemModel = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButtonRound4 = new rojeru_san.rsbutton.RSButtonRound();
        modelThem = new javax.swing.JTextField();
        saiModel = new javax.swing.JLabel();
        loaiThem = new javax.swing.JTextField();
        klThem = new javax.swing.JTextField();
        daiThem = new javax.swing.JTextField();
        rongThem = new javax.swing.JTextField();
        caoThem = new javax.swing.JTextField();
        dTThem = new javax.swing.JTextField();
        tenThem = new javax.swing.JTextField();
        dongCoThem = new javax.swing.JTextField();
        saiLoai = new javax.swing.JLabel();
        khoiLuongSai = new javax.swing.JLabel();
        daiThemSai = new javax.swing.JLabel();
        rongThemSai = new javax.swing.JLabel();
        caoThemSai = new javax.swing.JLabel();
        saiDungTich = new javax.swing.JLabel();
        saiTenThem = new javax.swing.JLabel();
        saiDongCo = new javax.swing.JLabel();
        suaModel = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        xacNhanSua = new rojeru_san.rsbutton.RSButtonRound();
        loaiThem1 = new javax.swing.JTextField();
        klThem1 = new javax.swing.JTextField();
        daiThem1 = new javax.swing.JTextField();
        rongThem1 = new javax.swing.JTextField();
        caoThem1 = new javax.swing.JTextField();
        dTThem1 = new javax.swing.JTextField();
        tenThem1 = new javax.swing.JTextField();
        dongCoThem1 = new javax.swing.JTextField();
        saiLoai1 = new javax.swing.JLabel();
        khoiLuongSai1 = new javax.swing.JLabel();
        daiThemSai1 = new javax.swing.JLabel();
        rongThemSai1 = new javax.swing.JLabel();
        caoThemSai1 = new javax.swing.JLabel();
        saiDungTich1 = new javax.swing.JLabel();
        saiTenThem1 = new javax.swing.JLabel();
        saiDongCo1 = new javax.swing.JLabel();
        modelSua = new java.awt.Label();
        searchBar = new rojeru_san.rsfield.RSTextField();
        search = new rojeru_san.rsbutton.RSButtonEffect();
        searchList = new javax.swing.JComboBox<>();
        them = new rojeru_san.rsbutton.RSButtonRound();
        xoa = new rojeru_san.rsbutton.RSButtonRound();
        sua = new rojeru_san.rsbutton.RSButtonRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMetro1 = new rojeru_san.complementos.TableMetro();

        ThemModel.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ThemModel.setModal(true);
        ThemModel.setPreferredSize(new java.awt.Dimension(944, 650));
        ThemModel.setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mã model:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Loại xe:");
        jLabel2.setMaximumSize(new java.awt.Dimension(86, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(86, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Khối lượng(kg):");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Dài(mm):");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cao(mm):");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Rộng(mm):");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Dung tích bình xăng(lít):");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Loại động cơ:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Tên xe:");

        rSButtonRound4.setBackground(new java.awt.Color(153, 204, 255));
        rSButtonRound4.setText("Xác nhận");
        rSButtonRound4.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound4ActionPerformed(evt);
            }
        });

        modelThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        saiModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiModel.setForeground(new java.awt.Color(255, 0, 0));

        loaiThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        klThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        daiThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rongThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        caoThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dTThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tenThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dongCoThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        saiLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiLoai.setForeground(new java.awt.Color(255, 0, 0));

        khoiLuongSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        khoiLuongSai.setForeground(new java.awt.Color(255, 0, 0));

        daiThemSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        daiThemSai.setForeground(new java.awt.Color(255, 0, 0));

        rongThemSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rongThemSai.setForeground(new java.awt.Color(255, 0, 0));

        caoThemSai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caoThemSai.setForeground(new java.awt.Color(255, 0, 0));

        saiDungTich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiDungTich.setForeground(new java.awt.Color(255, 0, 0));

        saiTenThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiTenThem.setForeground(new java.awt.Color(255, 51, 0));

        saiDongCo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiDongCo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(saiModel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(123, 123, 123)
                                            .addComponent(saiDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(modelThem, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(daiThem)
                                                    .addComponent(klThem)
                                                    .addComponent(loaiThem)
                                                    .addComponent(rongThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                                    .addComponent(caoThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                                    .addComponent(dTThem, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                                    .addComponent(tenThem, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                                    .addComponent(dongCoThem, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                                                .addComponent(saiLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(khoiLuongSai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(daiThemSai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rongThemSai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(caoThemSai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(saiDungTich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(saiTenThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(220, 220, 220)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(667, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(rSButtonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelThem)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiModel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loaiThem)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(klThem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khoiLuongSai, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(daiThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daiThemSai, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rongThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rongThemSai, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caoThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caoThemSai, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(dTThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(saiDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tenThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiTenThem, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dongCoThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(rSButtonRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ThemModelLayout = new javax.swing.GroupLayout(ThemModel.getContentPane());
        ThemModel.getContentPane().setLayout(ThemModelLayout);
        ThemModelLayout.setHorizontalGroup(
            ThemModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThemModelLayout.setVerticalGroup(
            ThemModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ThemModel.setLocationRelativeTo(null);

        suaModel.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        suaModel.setModal(true);
        suaModel.setPreferredSize(new java.awt.Dimension(991, 650));
        suaModel.setSize(new java.awt.Dimension(991, 600));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Mã model:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Loại xe:");
        jLabel11.setMaximumSize(new java.awt.Dimension(86, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(86, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Khối lượng(kg):");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Dài(mm):");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Cao(mm):");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Rộng(mm):");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Dung tích bình xăng(lít):");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Loại động cơ:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Tên xe:");

        xacNhanSua.setBackground(new java.awt.Color(153, 204, 255));
        xacNhanSua.setText("Xác nhận");
        xacNhanSua.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        xacNhanSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanSuaActionPerformed(evt);
            }
        });

        loaiThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        klThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        daiThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rongThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        caoThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dTThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tenThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dongCoThem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        saiLoai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiLoai1.setForeground(new java.awt.Color(255, 0, 0));

        khoiLuongSai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        khoiLuongSai1.setForeground(new java.awt.Color(255, 0, 0));

        daiThemSai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        daiThemSai1.setForeground(new java.awt.Color(255, 0, 0));

        rongThemSai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rongThemSai1.setForeground(new java.awt.Color(255, 0, 0));

        caoThemSai1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caoThemSai1.setForeground(new java.awt.Color(255, 0, 0));

        saiDungTich1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiDungTich1.setForeground(new java.awt.Color(255, 0, 0));

        saiTenThem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiTenThem1.setForeground(new java.awt.Color(255, 51, 0));

        saiDongCo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saiDongCo1.setForeground(new java.awt.Color(255, 0, 0));

        modelSua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saiDongCo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(daiThem1)
                                        .addComponent(klThem1)
                                        .addComponent(loaiThem1)
                                        .addComponent(rongThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                        .addComponent(caoThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                        .addComponent(dTThem1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                        .addComponent(tenThem1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                        .addComponent(dongCoThem1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                                    .addComponent(saiLoai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(khoiLuongSai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(daiThemSai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rongThemSai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caoThemSai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saiDungTich1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saiTenThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(modelSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(xacNhanSua, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 470, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(modelSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loaiThem1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(klThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khoiLuongSai1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(daiThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daiThemSai1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(rongThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rongThemSai1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(caoThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caoThemSai1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(dTThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(saiDungTich1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tenThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiTenThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(dongCoThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saiDongCo1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(xacNhanSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout suaModelLayout = new javax.swing.GroupLayout(suaModel.getContentPane());
        suaModel.getContentPane().setLayout(suaModelLayout);
        suaModelLayout.setHorizontalGroup(
            suaModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        suaModelLayout.setVerticalGroup(
            suaModelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        suaModel.setLocationRelativeTo(null);

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(799, 449));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBar.setPhColor(new java.awt.Color(102, 102, 255));
        searchBar.setPlaceholder("Nhập......");
        add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 6, 297, 45));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 6, 58, 45));

        searchList.setBackground(new java.awt.Color(255, 204, 51));
        searchList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã model", "Loại xe", "Khối lượng", "Dài", "Rộng", "Cao", "Dung tích", "Loại động cơ", "Tên xe" }));
        add(searchList, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 6, 158, 45));

        them.setBackground(new java.awt.Color(102, 255, 255));
        them.setText("Thêm");
        them.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });
        add(them, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 144, -1));

        xoa.setBackground(new java.awt.Color(255, 0, 0));
        xoa.setText("Xóa");
        xoa.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        add(xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 64, 133, -1));
        xoa.setVisible(false);

        sua.setBackground(new java.awt.Color(102, 255, 102));
        sua.setText("Sửa");
        sua.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        add(sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 64, 148, -1));
        sua.setVisible(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 153));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 450));

        tableMetro1.setBackground(new java.awt.Color(204, 255, 153));
        tableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã model", "Loại xe", "Khối lượng", "Dài", "Rộng", "Cao", "Dung tích xăng", "Loại động cơ", "Tên xe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tableMetro1.setAutoscrolls(false);
        tableMetro1.setColorFilasBackgound1(new java.awt.Color(255, 204, 102));
        tableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 153, 153));
        tableMetro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableMetro1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableMetro1.setMinimumSize(new java.awt.Dimension(600, 0));
        tableMetro1.setOpaque(false);
        tableMetro1.setPreferredScrollableViewportSize(new java.awt.Dimension(800, 600));
        tableMetro1.setRowHeight(30);
        tableMetro1.setShowGrid(true);
        tableMetro1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMetro1);
        if (tableMetro1.getColumnModel().getColumnCount() > 0) {
            tableMetro1.getColumnModel().getColumn(0).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(0).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(1).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(2).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(3).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(4).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(4).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(5).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(5).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(6).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(6).setPreferredWidth(150);
            tableMetro1.getColumnModel().getColumn(7).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(7).setPreferredWidth(200);
            tableMetro1.getColumnModel().getColumn(8).setMinWidth(100);
            tableMetro1.getColumnModel().getColumn(8).setPreferredWidth(200);
        }
        tableMetro1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableMetro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableMetro1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMetro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int indexRow = tableMetro1.rowAtPoint(e.getPoint());
                connectSQL conn = new connectSQL();
                ResultSet rs = conn.quyen_tk(new com.raven.main.WelcomeJFrame().getTK());
                JTable tableTemp = (JTable)e.getSource();
                if (e.getClickCount() == 2 && indexRow >= 0) {
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    model = temp;
                    Main main = new Main();
                    bangMau bang = new bangMau();
                    bang.setModel(temp);
                    bang.insertBangMau();
                    main.getMain().setForm(bang);
                    main.setStatusModel(1);
                }else if(e.getClickCount() == 1){
                    String temp = tableTemp.getModel().getValueAt(indexRow, 0)+"";
                    String loai = tableTemp.getModel().getValueAt(indexRow, 1)+"";
                    String khoiL = tableTemp.getModel().getValueAt(indexRow, 2)+"";
                    String dai = tableTemp.getModel().getValueAt(indexRow, 3)+"";
                    String rong = tableTemp.getModel().getValueAt(indexRow, 4)+"";
                    String cao = tableTemp.getModel().getValueAt(indexRow, 5)+"";
                    String dT = tableTemp.getModel().getValueAt(indexRow, 6)+"";
                    String dongCo = tableTemp.getModel().getValueAt(indexRow, 7)+"";
                    String tenXe = tableTemp.getModel().getValueAt(indexRow, 8)+"";
                    loaiThem1.setText(loai);
                    klThem1.setText(khoiL);
                    daiThem1.setText(dai);
                    rongThem1.setText(rong);
                    caoThem1.setText(cao);
                    dTThem1.setText(dT);
                    tenThem1.setText(tenXe);
                    maXoa = temp;
                    if(dongCo.equalsIgnoreCase("null")){
                        dongCoThem1.setText(null);
                    }else{
                        dongCoThem1.setText(dongCo);
                    }
                    modelSua.setText(temp);
                    int a = conn.co_the_xoa_model(temp);
                    sua.setVisible(true);
                    if (a == 1){
                        try{
                            rs.next();
                            int quyen = rs.getInt(1);
                            if(quyen == 2){
                            }
                            else if(quyen == 1){
                                xoa.setVisible(true);
                            }
                        }
                        catch(SQLException ex){
                            System.out.println(ex);
                        }
                    }else{
                        xoa.setVisible(false);
                    }
                }
            }
        });

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, -1));
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

    private void rSButtonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound4ActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn với thông tin vừa nhập chưa??", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = patternSo.matcher(daiThem.getText());
            Matcher matcher2 = patternMD.matcher(modelThem.getText());
            Matcher matcher3 = patternSo.matcher(klThem.getText());
            Matcher matcher4 = patternDau.matcher(loaiThem.getText());
            Matcher matcher5 = patternDau.matcher(tenThem.getText());
            Matcher matcher6 = patternDau.matcher(dongCoThem.getText());
            Matcher matcher7 = patternSo.matcher(rongThem.getText());
            Matcher matcher8 = patternSo.matcher(caoThem.getText());
            Matcher matcher9 = patternSo.matcher(dTThem.getText());
            if (matcher1.matches() == false){
                daiThemSai.setText("Dữ liệu không hợp lệ");
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if(matcher3.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText("Dữ liệu không hợp lệ");
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if(matcher7.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText("Dữ liệu không hợp lệ");
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if (matcher8.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText("Dữ liệu không hợp lệ");
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if (matcher9.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText("Dữ liệu không hợp lệ");
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if (matcher2.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText("Model phải có dạng 'MDx'");
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if (matcher4.matches() == false || loaiThem.getText().isEmpty()){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText("Dữ liệu không hợp lệ");
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
            }
            if(matcher5.matches() == false || tenThem.getText().isEmpty()){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText("Dữ liệu không hợp lệ");
                saiDongCo.setText(null);
            }
            if(matcher6.matches() == false){
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText("Dữ liệu không hợp lệ");
            }
            if(matcher1.matches() && matcher2.matches() && matcher3.matches() && matcher4.matches() && loaiThem.getText().isEmpty() == false && matcher5.matches() && tenThem.getText().isEmpty() == false && matcher6.matches() && matcher7.matches() && matcher8.matches() && matcher9.matches()){
                connectSQL conn = new connectSQL();
                daiThemSai.setText(null);
                saiModel.setText(null);
                saiLoai.setText(null);
                khoiLuongSai.setText(null);
                rongThemSai.setText(null);
                caoThemSai.setText(null);
                saiDungTich.setText(null);
                saiTenThem.setText(null);
                saiDongCo.setText(null);
                int result = conn.them_model(modelThem.getText(), loaiThem.getText(), klThem.getText(), daiThem.getText(), rongThem.getText(), caoThem.getText(), dTThem.getText(), dongCoThem.getText(), tenThem.getText());
                if(result > 0 ){
                    JOptionPane.showMessageDialog(null, "Thêm hoàn tất", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    ThemModel.dispose();
                    DefaultTableModel model = (DefaultTableModel) tableMetro1.getModel();
                    model.setRowCount(0);
                    insertModel();
                }else{
                    JOptionPane.showMessageDialog(null, "Thêm không thành công", "Thất bại", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_rSButtonRound4ActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        ThemModel.setVisible(true);
        modelThem.setText(null);
        loaiThem.setText(null);
        klThem.setText(null);
        daiThem.setText(null);
        rongThem.setText(null);
        caoThem.setText(null);
        dTThem.setText(null);
        tenThem.setText(null);
        dongCoThem.setText(null);
    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        daiThemSai1.setText(null);
        saiLoai1.setText(null);
        khoiLuongSai1.setText(null);
        rongThemSai1.setText(null);
        caoThemSai1.setText(null);
        saiDungTich1.setText(null);
        saiTenThem1.setText(null);
        saiDongCo1.setText(null);  
        suaModel.setVisible(true);

    }//GEN-LAST:event_suaActionPerformed

    private void xacNhanSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanSuaActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sửa không???", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Matcher matcher1 = patternSo.matcher(daiThem1.getText());
            Matcher matcher3 = patternSo.matcher(klThem1.getText());
            Matcher matcher4 = patternDau.matcher(loaiThem1.getText());
            Matcher matcher5 = patternDau.matcher(tenThem1.getText());
            Matcher matcher6 = patternDau.matcher(dongCoThem1.getText());
            Matcher matcher7 = patternSo.matcher(rongThem1.getText());
            Matcher matcher8 = patternSo.matcher(caoThem1.getText());
            Matcher matcher9 = patternSo.matcher(dTThem1.getText());
            if (matcher1.matches() == false){
                daiThemSai1.setText("Dữ liệu không hợp lệ");
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if(matcher3.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText("Dữ liệu không hợp lệ");
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if(matcher7.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText("Dữ liệu không hợp lệ");
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if (matcher8.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText("Dữ liệu không hợp lệ");
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if (matcher9.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText("Dữ liệu không hợp lệ");
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if (matcher4.matches() == false || loaiThem1.getText().isEmpty()){
                daiThemSai1.setText(null);
                saiLoai1.setText("Dữ liệu không hợp lệ");
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);
            }
            if(matcher5.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText("Dữ liệu không hợp lệ");
                saiDongCo1.setText(null);
            }
            if(matcher6.matches() == false){
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText("Dữ liệu không hợp lệ");
            }
            if(matcher1.matches() && loaiThem1.getText().isEmpty() == false && tenThem1.getText().isEmpty() == false && matcher3.matches() && matcher4.matches() && matcher5.matches() && matcher6.matches() && matcher7.matches() && matcher8.matches() && matcher9.matches()){
                connectSQL conn = new connectSQL();
                daiThemSai1.setText(null);
                saiLoai1.setText(null);
                khoiLuongSai1.setText(null);
                rongThemSai1.setText(null);
                caoThemSai1.setText(null);
                saiDungTich1.setText(null);
                saiTenThem1.setText(null);
                saiDongCo1.setText(null);   
                int result = conn.sua_model(modelSua.getText(), loaiThem1.getText(), klThem1.getText(), daiThem1.getText(), rongThem1.getText(), caoThem1.getText(), dTThem1.getText(), dongCoThem1.getText(), tenThem1.getText());
                if (result > 0){
                    JOptionPane.showMessageDialog(null, "Sửa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                    suaModel.dispose();
                    DefaultTableModel model = (DefaultTableModel) tableMetro1.getModel();
                    model.setRowCount(0);
                    insertModel();
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thất bại", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_xacNhanSuaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa không, không thể hoàn tác???", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            connectSQL conn = new connectSQL();
            int result = conn.xoa_mdel(maXoa);
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Xóa thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel) tableMetro1.getModel();
                model.setRowCount(0);
                insertModel();
            }else{
                JOptionPane.showMessageDialog(null, "Xóa không thành công", "Không thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ThemModel;
    private javax.swing.JTextField caoThem;
    private javax.swing.JTextField caoThem1;
    private javax.swing.JLabel caoThemSai;
    private javax.swing.JLabel caoThemSai1;
    private javax.swing.JTextField dTThem;
    private javax.swing.JTextField dTThem1;
    private javax.swing.JTextField daiThem;
    private javax.swing.JTextField daiThem1;
    private javax.swing.JLabel daiThemSai;
    private javax.swing.JLabel daiThemSai1;
    private javax.swing.JTextField dongCoThem;
    private javax.swing.JTextField dongCoThem1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel khoiLuongSai;
    private javax.swing.JLabel khoiLuongSai1;
    private javax.swing.JTextField klThem;
    private javax.swing.JTextField klThem1;
    private javax.swing.JTextField loaiThem;
    private javax.swing.JTextField loaiThem1;
    private java.awt.Label modelSua;
    private javax.swing.JTextField modelThem;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound4;
    private javax.swing.JTextField rongThem;
    private javax.swing.JTextField rongThem1;
    private javax.swing.JLabel rongThemSai;
    private javax.swing.JLabel rongThemSai1;
    private javax.swing.JLabel saiDongCo;
    private javax.swing.JLabel saiDongCo1;
    private javax.swing.JLabel saiDungTich;
    private javax.swing.JLabel saiDungTich1;
    private javax.swing.JLabel saiLoai;
    private javax.swing.JLabel saiLoai1;
    private javax.swing.JLabel saiModel;
    private javax.swing.JLabel saiTenThem;
    private javax.swing.JLabel saiTenThem1;
    private rojeru_san.rsbutton.RSButtonEffect search;
    private rojeru_san.rsfield.RSTextField searchBar;
    private javax.swing.JComboBox<String> searchList;
    private rojeru_san.rsbutton.RSButtonRound sua;
    private javax.swing.JDialog suaModel;
    private rojeru_san.complementos.TableMetro tableMetro1;
    private javax.swing.JTextField tenThem;
    private javax.swing.JTextField tenThem1;
    private rojeru_san.rsbutton.RSButtonRound them;
    private rojeru_san.rsbutton.RSButtonRound xacNhanSua;
    private rojeru_san.rsbutton.RSButtonRound xoa;
    // End of variables declaration//GEN-END:variables
}
