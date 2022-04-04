/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjlist_al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author JW
 */
public class ContohJList_AL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JLabel label = new JLabel();
        label.setSize(50, 100);
        JButton b = new JButton("Tampilkan");
        b.setBounds(200, 100, 95, 30);
        final DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("COBOL");
        l1.addElement("Pascal");
        l1.addElement("Java");
        l1.addElement("C++");
        final JList<String> list1 = new JList<>(l1);
        list1.setBounds(100, 100, 75, 75);
        DefaultListModel<String> l2 = new DefaultListModel<>();
        l2.addElement("Windows 10");
        l2.addElement("Linux RedHat");
        l2.addElement("Mac OS");
        l2.addElement("Slacware");
        final JList<String> list2 = new JList<>(l2);
        list2.setBounds(100, 200, 75, 75);
        f.add(list1);
        f.add(list2);
        f.add(b);
        f.add(label);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "Pemrograman: " + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += " dan OS: ";
                    //for (Object frame : list2.getSelectedValues()) {
                    for (Object frame : list2.getSelectedValuesList()) {
                        data += frame + " ";
                    }
                }
                label.setText(data);
            }
        });
    }

}
