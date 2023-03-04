
package com.raven.main;

import com.raven.event.EventMenuSelected;
import com.raven.form.CTBH_JPanel;
import com.raven.form.QuanLyBaoHanh;
import com.raven.form.Form_KH;
import com.raven.form.Form_3;
import com.raven.form.Form_CTKH;
import com.raven.form.Form_Home;
import com.raven.form.JFrameExit;
import com.raven.form.NangCao;
import com.raven.form.TBH;
import com.raven.form.doiPass;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
    
    private CTBH_JPanel form12;
    private Form_CTKH form22;
    private JFrameExit form5;
    static Main main = new Main();
    static int statusBH = 0;//Lưu trạng thai của form, 0 là Form QLBH, 1 là Form CTBH
    static int statusKH = 0;//0 ở Form_KhachHang, 1 ở Form CTKH
    public Main() {
        initComponents();
        this.setSize(1061, 690);
        setBackground(new Color(0, 0, 0, 0));
        form5 = new JFrameExit();
        menu2.initMoving(Main.this);
        menu2.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    main.setForm(new Form_Home());
                } else if (index == 1) {
                    if (getStatusBH() == 0){
                        main.setForm(new QuanLyBaoHanh());
                    }
                    else if(main.getStatusBH() == 1){
                        form12 = new CTBH_JPanel();
                        main.setForm(form12);
                    }
                } else if (index == 2) {
                    if(main.getStatusKH() == 0){
                        setForm(new Form_KH());
                    }
                    else if(main.getStatusKH() == 1){
                        form22 = new Form_CTKH();
                        System.out.print("Mã là: ");
                        System.out.println(form22.getMaKH());
                        form22.insertCTKH();
                        main.setForm(form22);
                    }
                } else if (index == 3) {
                    main.setForm(new Form_3());
                } else if(index == 4){
                    main.setForm(new TBH());
                } else if(index == 5){
                    main.setForm(new doiPass());
                } else if(index == 6){
                    if(new WelcomeJFrame().getQuyen() == 1){
                        main.setForm(new NangCao());
                    }else{
                        JOptionPane.showMessageDialog(null, "Bạn không có quyền này", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }    
                } else if(index == 8){
                    form5.setVisible(true);
                }
            }
        });
    }

    public void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        menu2 = new com.raven.component.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(153, 255, 255));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int getStatusBH(){
        return statusBH;
    }
    public void setStatusBH(int statusBH){
        this.statusBH = statusBH;
    }
    
    public int getStatusKH(){
        return statusKH;
    }
    public void setStatusKH(int statusKH){
        this.statusKH = statusKH;
    }
    public void showMain(){
        main.setForm(new Form_Home());
        main.setVisible(true);
    }
    public void hideMain(){
        main.setVisible(false);
    }
    public Main getMain(){
        return main;
    }
    public static void reset(){
        main.dispose();
        statusBH = 0;
        statusKH = 0;
        System.gc();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private com.raven.component.Menu menu2;
    private com.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
