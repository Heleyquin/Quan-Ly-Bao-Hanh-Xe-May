
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
        HomeHeader = new RSMaterialComponent.RSPanelMaterial();
        iconWarrenty = new rojeru_san.rspanel.RSPanelImage();
        HomeFooter = new RSMaterialComponent.RSPanelMaterial();
        PhoneNumber = new rojeru_san.rslabel.RSLabelAnimated();
        PhoneIcon = new RSMaterialComponent.RSLabelIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TaiKhoan = new RSMaterialComponent.RSTextFieldMaterialIcon();
        MatKhau = new RSMaterialComponent.RSPasswordMaterial();
        Login = new javax.swing.JButton();
        failLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Adobe Devanagari", 1, 48)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(681, 446));
        setResizable(false);
        setSize(new java.awt.Dimension(681, 446));

        HomePanel.setBackground(new java.awt.Color(255, 255, 204));
        HomePanel.setMinimumSize(new java.awt.Dimension(0, 0));
        HomePanel.setPreferredSize(new java.awt.Dimension(681, 434));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeHeader.setBackground(new java.awt.Color(0, 51, 102));

        iconWarrenty.setImagen(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/images2.jpg"))); // NOI18N

        javax.swing.GroupLayout iconWarrentyLayout = new javax.swing.GroupLayout(iconWarrenty);
        iconWarrenty.setLayout(iconWarrentyLayout);
        iconWarrentyLayout.setHorizontalGroup(
            iconWarrentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        iconWarrentyLayout.setVerticalGroup(
            iconWarrentyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HomeHeaderLayout = new javax.swing.GroupLayout(HomeHeader);
        HomeHeader.setLayout(HomeHeaderLayout);
        HomeHeaderLayout.setHorizontalGroup(
            HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeHeaderLayout.createSequentialGroup()
                .addComponent(iconWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(862, 862, 862))
        );
        HomeHeaderLayout.setVerticalGroup(
            HomeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconWarrenty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        HomePanel.add(HomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 140));

        HomeFooter.setBackground(new java.awt.Color(255, 204, 204));

        PhoneNumber.setText("0865781023");
        PhoneNumber.setToolTipText("");
        PhoneNumber.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        PhoneNumber.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        PhoneIcon.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE_IN_TALK);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Copyright© by NĐP Team");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Contact us");

        javax.swing.GroupLayout HomeFooterLayout = new javax.swing.GroupLayout(HomeFooter);
        HomeFooter.setLayout(HomeFooterLayout);
        HomeFooterLayout.setHorizontalGroup(
            HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhoneIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        HomeFooterLayout.setVerticalGroup(
            HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(HomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PhoneIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        HomePanel.add(HomeFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 690, 60));

        TaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        TaiKhoan.setColorIcon(new java.awt.Color(0, 0, 0));
        TaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TaiKhoan.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        TaiKhoan.setPhColor(new java.awt.Color(0, 0, 0));
        TaiKhoan.setPlaceholder("Tài khoản");
        HomePanel.add(TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 70));

        MatKhau.setForeground(new java.awt.Color(0, 0, 0));
        MatKhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MatKhau.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MatKhau.setPhColor(new java.awt.Color(0, 0, 0));
        MatKhau.setPlaceholder("Mật khẩu");
        HomePanel.add(MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 253, -1, 70));

        Login.setBackground(new java.awt.Color(0, 255, 255));
        Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Login.setText("Đăng nhập");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        HomePanel.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 142, 53));

        failLog.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        failLog.setForeground(new java.awt.Color(255, 0, 51));
        HomePanel.add(failLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 400, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private RSMaterialComponent.RSPanelMaterial HomeFooter;
    private RSMaterialComponent.RSPanelMaterial HomeHeader;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton Login;
    private RSMaterialComponent.RSPasswordMaterial MatKhau;
    private RSMaterialComponent.RSLabelIcon PhoneIcon;
    private rojeru_san.rslabel.RSLabelAnimated PhoneNumber;
    private RSMaterialComponent.RSTextFieldMaterialIcon TaiKhoan;
    private javax.swing.JLabel failLog;
    private rojeru_san.rspanel.RSPanelImage iconWarrenty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
