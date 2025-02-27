
package com.raven.form;

import com.raven.main.WelcomeJFrame;
import com.raven.main.Main;
import connectToSQL.connectSQL;
import java.awt.Color;
public class JFrameExit extends javax.swing.JFrame {

    public JFrameExit() {
        initComponents();
        setLocationRelativeTo(this);
        setBackground(Color.YELLOW);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelWarning = new javax.swing.JLabel();
        WarningIcon1 = new javax.swing.JLabel();
        WarningIcon2 = new javax.swing.JLabel();
        Reject = new rojeru_san.rsbutton.RSButtonCircleEffect();
        Agree = new rojeru_san.rsbutton.RSButtonCircleEffect();
        DangXuat = new rojeru_san.rsbutton.RSButtonCircleEffect();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        panel4 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelWarning.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelWarning.setForeground(new java.awt.Color(204, 0, 51));
        LabelWarning.setText("Bạn có chắc chắn muốn thoát");
        jPanel1.add(LabelWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 6, -1, 37));

        WarningIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/warning.png"))); // NOI18N
        WarningIcon1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(WarningIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 6, -1, 33));

        WarningIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/warning.png"))); // NOI18N
        WarningIcon2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(WarningIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 6, -1, 37));

        Reject.setBackground(new java.awt.Color(0, 255, 0));
        Reject.setText("Từ chối");
        Reject.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });
        jPanel1.add(Reject, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 101, 108, -1));

        Agree.setBackground(new java.awt.Color(255, 0, 102));
        Agree.setText("Đồng ý");
        Agree.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        Agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeActionPerformed(evt);
            }
        });
        jPanel1.add(Agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 101, 108, -1));

        DangXuat.setBackground(new java.awt.Color(153, 153, 255));
        DangXuat.setText("Đăng xuất");
        DangXuat.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(DangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 101, 128, -1));

        panel1.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel3.setBackground(new java.awt.Color(255, 0, 51));
        panel3.setPreferredSize(new java.awt.Dimension(528, 30));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panel4.setBackground(new java.awt.Color(255, 0, 51));
        panel4.setPreferredSize(new java.awt.Dimension(528, 30));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_AgreeActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_RejectActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangXuatActionPerformed
        // TODO add your handling code here:
        connectSQL conn = new connectSQL();
        conn.close();

        WelcomeJFrame welcomFrame = new WelcomeJFrame();
        Main main = new Main();
        welcomFrame.showWelcome();
        welcomFrame.setLocationRelativeTo(null);
        welcomFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.hideMain();
        main.reset();
    }//GEN-LAST:event_DangXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameExit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonCircleEffect Agree;
    private rojeru_san.rsbutton.RSButtonCircleEffect DangXuat;
    private javax.swing.JLabel LabelWarning;
    private rojeru_san.rsbutton.RSButtonCircleEffect Reject;
    private javax.swing.JLabel WarningIcon1;
    private javax.swing.JLabel WarningIcon2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
