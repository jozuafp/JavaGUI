/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplebutton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 *
 * @author JW
 */
public class SimpleButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create some buttons.    
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        JLabel msg = new JLabel("Is this OK?", JLabel.CENTER);
// Create a frame, get its root pane, and set the OK button as the default. This    
// button is pressed if we press the Enter key while the frame has focus.    
        JFrame f = new JFrame();        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRootPane root = f.getRootPane();
        root.setDefaultButton(ok);
// Layout and display    
        Container content = f.getContentPane();
        content.add(msg, BorderLayout.CENTER);
        content.add(buttonPanel, BorderLayout.SOUTH);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
