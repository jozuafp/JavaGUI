/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjpasswordfield;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author JW
 */
public class ContohJPasswordField {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh Password Field");
        JPasswordField field = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        field.setBounds(100, 100, 100, 30);
        f.add(field);
        f.add(l1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
