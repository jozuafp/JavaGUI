/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listsederhana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author JW
 */
public class SimpleList extends JPanel {

    String label[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven"};
    JList list;

    public SimpleList() {
        this.setLayout(new BorderLayout());
        list = new JList(label);
        JScrollPane pane = new JScrollPane(list);
        JButton button = new JButton("Print");
        button.addActionListener(new PrintListener());
        add(pane, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }

// An inner class to respond to clicks of the Print button    
    class PrintListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int selected[] = list.getSelectedIndices();
            System.out.println("Selected Elements:  ");
            for (int i = 0; i < selected.length; i++) {
                String element = (String) list.getModel().getElementAt(selected[i]);
                System.out.println("  " + element);
            }
        }
    }
}
