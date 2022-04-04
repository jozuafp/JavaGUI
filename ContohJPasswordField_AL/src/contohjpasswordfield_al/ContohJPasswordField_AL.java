/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjpasswordfield_al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JW
 */
public class ContohJPasswordField_AL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh Password Field");
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(20, 75, 80, 30);
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        f.add(value);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username " + text.getText();
                data += ", Password: " + new String(value.getPassword());
                label.setText(data);
            }
        });
    }
}
