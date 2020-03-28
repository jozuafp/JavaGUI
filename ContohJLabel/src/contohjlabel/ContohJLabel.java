/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JW
 */
public class ContohJLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh JLabel");
        JLabel l1, l2;
        l1 = new JLabel("Ini Label 1");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Ini Label 2");
        l2.setBounds(50, 100, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

}
