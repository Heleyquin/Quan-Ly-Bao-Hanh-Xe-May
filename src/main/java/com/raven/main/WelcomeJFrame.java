
package com.raven.main;
import connectToSQL.connectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WelcomeJFrame extends javax.swing.JFrame {

    private static String tk;
    private static String mk;
    private static int quyen;
    public WelcomeJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        ChaoMung = new javax.swing.JLabel();
        NhapKhung = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        NhapMaKH = new javax.swing.JLabel();
        TextKhungXe = new rojeru_san.rsfield.RSTextFullRound();
        TextMaKH = new rojeru_san.rsfield.RSTextFullRound();
        SearchKhungXe = new RSMaterialComponent.RSButtonMaterialIconDos();
        SearchKH = new RSMaterialComponent.RSButtonMaterialIconDos();
        HomeHeader = new RSMaterialComponent.RSPanelMaterial();
        TaiKhoan = new RSMaterialComponent.RSTextFieldMaterialIcon();
        MatKhau = new RSMaterialComponent.RSPasswordMaterial();
        Login = new javax.swing.JButton();
        iconWarrenty = new rojeru_san.rspanel.RSPanelImage();
        failLog = new javax.swing.JLabel();
        HomeFooter = new RSMaterialComponent.RSPanelMaterial();
        PhoneNumber = new rojeru_san.rslabel.RSLabelAnimated();
        PhoneIcon = new RSMaterialComponent.RSLabelIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Adobe Devanagari", 1, 48)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1039, 600));
        setPreferredSize(new java.awt.Dimension(1060, 690));
        setSize(new java.awt.Dimension(0, 0));

        HomePanel.setBackground(new java.awt.Color(255, 255, 204));
        HomePanel.setPreferredSize(new java.awt.Dimension(1100, 650));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChaoMung.setBackground(new java.awt.Color(255, 255, 255));
        ChaoMung.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ChaoMung.setForeground(new java.awt.Color(0, 102, 204));
        ChaoMung.setText("Chào mừng đến với dịch vụ bảo hành của ");
        HomePanel.add(ChaoMung, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 79));

        NhapKhung.setBackground(new java.awt.Color(255, 255, 255));
        NhapKhung.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NhapKhung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NhapKhung.setText("Nhập");
        HomePanel.add(NhapKhung, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 146, 68));

        Text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Hoặc");
        HomePanel.add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 121, 58));

        NhapMaKH.setBackground(new java.awt.Color(255, 255, 255));
        NhapMaKH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NhapMaKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NhapMaKH.setText("Nhập");
        HomePanel.add(NhapMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 146, 68));

        TextKhungXe.setBackground(new java.awt.Color(204, 255, 255));
        TextKhungXe.setForeground(new java.awt.Color(204, 204, 204));
        TextKhungXe.setBorderColor(new java.awt.Color(0, 0, 0));
        TextKhungXe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TextKhungXe.setPhColor(new java.awt.Color(153, 153, 153));
        TextKhungXe.setPlaceholder("MÃ KHÁCH HÀNG");
        HomePanel.add(TextKhungXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, 68));

        TextMaKH.setBackground(new java.awt.Color(204, 255, 255));
        TextMaKH.setForeground(new java.awt.Color(204, 204, 204));
        TextMaKH.setBorderColor(new java.awt.Color(0, 0, 0));
        TextMaKH.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TextMaKH.setPhColor(new java.awt.Color(153, 153, 153));
        TextMaKH.setPlaceholder("SỐ KHUNG XE");
        HomePanel.add(TextMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, 68));

        SearchKhungXe.setBackground(new java.awt.Color(255, 255, 51));
        SearchKhungXe.setForeground(new java.awt.Color(0, 0, 0));
        SearchKhungXe.setText("Tra cứu");
        SearchKhungXe.setBackgroundHover(new java.awt.Color(102, 255, 255));
        SearchKhungXe.setFont(new java.awt.Font("Roboto Bold", 0, 24)); // NOI18N
        SearchKhungXe.setForegroundIcon(new java.awt.Color(153, 0, 153));
        SearchKhungXe.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        SearchKhungXe.setForegroundText(new java.awt.Color(0, 0, 0));
        SearchKhungXe.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        HomePanel.add(SearchKhungXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 160, 69));

        SearchKH.setBackground(new java.awt.Color(255, 255, 51));
        SearchKH.setForeground(new java.awt.Color(0, 0, 0));
        SearchKH.setText("Tra cứu");
        SearchKH.setBackgroundHover(new java.awt.Color(102, 255, 255));
        SearchKH.setFont(new java.awt.Font("Roboto Bold", 0, 24)); // NOI18N
        SearchKH.setForegroundIcon(new java.awt.Color(153, 0, 153));
        SearchKH.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        SearchKH.setForegroundText(new java.awt.Color(0, 0, 0));
        SearchKH.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        HomePanel.add(SearchKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 160, 69));

        HomeHeader.setBackground(new java.awt.Color(0, 51, 102));

        TaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        TaiKhoan.setColorIcon(new java.awt.Color(0, 0, 0));
        TaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TaiKhoan.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        TaiKhoan.setPhColor(new java.awt.Color(0, 0, 0));
        TaiKhoan.setPlaceholder("Tài khoản");

        MatKhau.setForeground(new java.awt.Color(0, 0, 0));
        MatKhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MatKhau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MatKhau.setPhColor(new java.awt.Color(0, 0, 0));
        MatKhau.setPlaceholder("Mật khẩu");

        Login.setBackground(new java.awt.Color(0, 255, 255));
        Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Login.setText("Đăng nhập");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        iconWarrenty.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/images2.jpg"))); // NOI18N

        javax.swing.GroupLayout iconWarrentyLayout = new javax.swing.GroupLayout(iconWarrenty);
        iconWarrenty.setLayout(iconWarrentyLayout);
        iconWarrentyLayout.setHorizontalGroup(
            iconWarrentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        iconWarrentyLayout.setVerticalGroup(
            iconWarrentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        failLog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        failLog.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout HomeHeaderLayout = new javax.swing.GroupLayout(HomeHeader);
        HomeHeader.setLayout(HomeHeaderLayout);
        HomeHeaderLayout.setHorizontalGroup(
            HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeHeaderLayout.createSequentialGroup()
                .addComponent(iconWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeHeaderLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeHeaderLayout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(failLog, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        HomeHeaderLayout.setVerticalGroup(
            HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeHeaderLayout.createSequentialGroup()
                        .addGroup(HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(MatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(failLog)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(iconWarrenty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        HomePanel.add(HomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 140));

        HomeFooter.setBackground(new java.awt.Color(255, 204, 204));

        PhoneNumber.setText("(028) 54 333 919");
        PhoneNumber.setToolTipText("");
        PhoneNumber.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N

        PhoneIcon.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE_IN_TALK);

        javax.swing.GroupLayout HomeFooterLayout = new javax.swing.GroupLayout(HomeFooter);
        HomeFooter.setLayout(HomeFooterLayout);
        HomeFooterLayout.setHorizontalGroup(
            HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeFooterLayout.createSequentialGroup()
                .addContainerGap(793, Short.MAX_VALUE)
                .addComponent(PhoneIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        HomeFooterLayout.setVerticalGroup(
            HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(PhoneIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        HomePanel.add(HomeFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 590, 1070, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTK(){
        tk = TaiKhoan.getText();
    }
    
    public String getTK(){
        return tk;
    }
    public void setMK(String mkMoi){
        mk = mkMoi;
    }
    public void setMK(){
        mk = String.valueOf(MatKhau.getPassword());
    }
    public String getMK(){
        return mk;
    }
    public int getQuyen(){
        return quyen;
    }
    public void setQuyen(){
        connectSQL conn = new connectSQL();
        ResultSet rs;
        rs = conn.quyen_tk(tk);
        try {
            rs.next();
            quyen = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(WelcomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        this.setTK();
        this.setMK();
        this.setQuyen();
        connectSQL conn = new connectSQL();
        int result = conn.timTk(tk, mk);
        if (result == 1){
            this.hideWelcome();
            Main mainScreen = new Main();
            mainScreen.showMain();
        }
        else if(result == -1){
            TaiKhoan.setText(null);
            MatKhau.setText(null);
            failLog.setText("Tài khoản này đã bị vô hiệu");           
        }
        else{
            TaiKhoan.setText(null);
            MatKhau.setText(null);
            failLog.setText("Sai thông tin đăng nhập");
        }
        
    }//GEN-LAST:event_LoginActionPerformed

    public void showWelcome(){
        this.setVisible(true);
    }
    public void hideWelcome(){
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChaoMung;
    private RSMaterialComponent.RSPanelMaterial HomeFooter;
    private RSMaterialComponent.RSPanelMaterial HomeHeader;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton Login;
    private RSMaterialComponent.RSPasswordMaterial MatKhau;
    private javax.swing.JLabel NhapKhung;
    private javax.swing.JLabel NhapMaKH;
    private RSMaterialComponent.RSLabelIcon PhoneIcon;
    private rojeru_san.rslabel.RSLabelAnimated PhoneNumber;
    private RSMaterialComponent.RSButtonMaterialIconDos SearchKH;
    private RSMaterialComponent.RSButtonMaterialIconDos SearchKhungXe;
    private RSMaterialComponent.RSTextFieldMaterialIcon TaiKhoan;
    private javax.swing.JLabel Text;
    private rojeru_san.rsfield.RSTextFullRound TextKhungXe;
    private rojeru_san.rsfield.RSTextFullRound TextMaKH;
    private javax.swing.JLabel failLog;
    private rojeru_san.rspanel.RSPanelImage iconWarrenty;
    // End of variables declaration//GEN-END:variables
}
