/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmonthgui;

import javax.swing.JOptionPane;

/**
 *
 * @author Jozua Palandi
 */
public class InputMonthGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bulan = JOptionPane.showInputDialog("Angka Bulan : ");
        int n = Integer.parseInt(bulan);
        switch (n)
        {
            case 1 : System.out.println("Januari");break;
            case 2 : System.out.println("Februari");break;
            case 3 : System.out.println("Maret");break;
            case 4 : System.out.println("April");break;
            case 5 : System.out.println("Mei");break;
            case 6 : System.out.println("Juni");break;
            case 7 : System.out.println("Juli");break;
            case 8 : System.out.println("Agustus");break;
            case 9 : System.out.println("September");break;
            case 10 : System.out.println("Oktober");break;
            case 11 : System.out.println("Nopember");break;
            case 12 : System.out.println("Desember");break;
            default : System.out.println("Input tidak valid.");
        }
        System.exit(0);
    }
    
}
