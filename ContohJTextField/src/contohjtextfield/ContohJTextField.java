/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjtextfield;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author JW
 */
public class ContohJTextField {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh TextField");
        JTextField t1, t2;
        t1 = new JTextField("Java GUI");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("SWING");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

}
