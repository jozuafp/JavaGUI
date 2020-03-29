/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjlist;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author JW
 */
public class ContohJList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("COBOL");
        l1.addElement("Pascal");
        l1.addElement("C++");
        l1.addElement("Java");
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);
        f.add(list);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

}
