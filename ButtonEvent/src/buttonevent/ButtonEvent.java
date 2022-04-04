/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonevent;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author JW
 */
public class ButtonEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JButton jb = new JButton("Press Me");
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("ActionEvent!");
            }
        });
        jb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
                System.out.println("ItemEvent!");
            }
        });
        jb.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent ev) {
                System.out.println("ChangeEvent!");
            }
        });
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(jb);
        f.pack();
        f.setVisible(true);
    }
}
