/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjbuttonicon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author JW
 */
public class ContohButton {

    ContohButton() {
        JFrame f = new JFrame("Button Icon");
        JButton b = new JButton(new ImageIcon("C:\\Users\\JW\\Music\\JavaGUI\\JavaIcon.png"));
        b.setBounds(50, 50, 300, 300);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
