/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listsederhana;

import javax.swing.JFrame;

/**
 *
 * @author JW
 */
public class ListSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new SimpleList());
        frame.setSize(250, 200);
        frame.setVisible(true);
    }

}
