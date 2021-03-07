/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtextgui;

import javax.swing.JOptionPane;

/**
 *
 * @author Jozua Palandi
 */
public class InputTextGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("nama : ");
        String usia = JOptionPane.showInputDialog("usia : ");
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Usia saya " + usia + " tahun");
        System.exit(0);
    }
    
}
