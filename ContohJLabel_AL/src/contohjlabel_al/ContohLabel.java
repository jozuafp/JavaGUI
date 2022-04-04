/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjlabel_al;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JW
 */
public class ContohLabel extends Frame implements ActionListener {

    JTextField tf;
    JLabel l;
    JButton b;

    ContohLabel() {
        tf = new JTextField();
        l = new JLabel();
        b = new JButton("Find IP");
        tf.setBounds(50, 50, 150, 20);
        l.setBounds(50, 100, 250, 20);
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
