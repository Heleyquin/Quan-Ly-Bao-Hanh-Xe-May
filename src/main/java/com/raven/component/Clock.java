
package com.raven.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Clock extends JPanel implements ActionListener{


    private JLabel clockLabel;
    private Timer timer;
    public Clock() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        clockLabel = new JLabel(dateFormat.format(new Date()));
        clockLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(clockLabel);
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        clockLabel.setForeground(Color.WHITE);
        clockLabel.setText(dateFormat.format(new Date()));
    }
    public Date getDate(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return date.parse(clockLabel.getText());
        } catch (ParseException ex) {
            System.out.println("Không lấy được ngày");
        }
        return null;
    }
}
