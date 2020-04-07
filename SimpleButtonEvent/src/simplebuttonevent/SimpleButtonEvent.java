/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplebuttonevent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author JW
 */
public class SimpleButtonEvent {

    public static void main(String[] args) {
// Create some buttons.    
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        JFrame f = new JFrame();
        JRootPane root = f.getRootPane();
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("Anda menekan tombol OK");
                root.setDefaultButton(ok);
            }
        });
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("Anda menekan tombol cancel");
                root.setDefaultButton(cancel);
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        JLabel msg = new JLabel("Is this OK?", JLabel.CENTER);
// Create a frame, get its root pane, and set the OK button as the default. This    
// button is pressed if we press the Enter key while the frame has focus.    
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
// Layout and display    
        Container content = f.getContentPane();
        content.add(msg, BorderLayout.CENTER);
        content.add(buttonPanel, BorderLayout.SOUTH);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
