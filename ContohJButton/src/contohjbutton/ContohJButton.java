/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjbutton;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author JW
 */
public class ContohJButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Cntoh Button");
        JButton b = new JButton("Click disini");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

}
