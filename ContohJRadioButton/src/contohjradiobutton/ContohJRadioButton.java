/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjradiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author JW
 */
public class ContohJRadioButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JRadioButton r1 = new JRadioButton("Laki-laki");
        JRadioButton r2 = new JRadioButton("Perempuan");
        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
