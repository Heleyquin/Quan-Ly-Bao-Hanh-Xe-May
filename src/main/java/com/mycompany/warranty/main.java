
package com.mycompany.warranty;

import com.raven.main.WelcomeJFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class main {

    public static void main(String agr[]){
        WelcomeJFrame welcom = new WelcomeJFrame();
        welcom.setVisible(true);
        welcom.setLocationRelativeTo(null);
        welcom.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
