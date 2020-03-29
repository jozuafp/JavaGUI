/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjtextarea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author JW
 */
public class ContohJTextArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Belajar JAVA GUI");
        area.setBounds(100, 30, 200, 200);
        f.add(area);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

}
