/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author JW
 */
public class ContohJTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        String mhs[][] = {{"20110657", "BUDI", "70"},
        {"20110658", "DUDI", "80"},
        {"20110659", "RUDI", "90"}};
        String column[] = {"NRP", "NAMA MAHASISWA", "NILAI"};
        JTable jt = new JTable(mhs, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(500, 500);
        f.setVisible(true);
    }

}
