/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programnilaimahasiswa;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JW
 */
public class ProgramNilaiMahasiswa {

    public static void main(String[] args) {
        // Deklarasi veriabel
        int TUG,UTS,UAS;        
        String strTUG, strUTS, strUAS;
        double rerata;

        // Input nilai TUGAS
        strTUG = JOptionPane.showInputDialog(null, "Input Nilai Tugas",
                "TUGAS", JOptionPane.QUESTION_MESSAGE);
        // Input nilai UTS
        strUTS = JOptionPane.showInputDialog(null, "Input Nilai UTS",
                "UTS", JOptionPane.QUESTION_MESSAGE);
        // Input nilai UAS
        strUAS = JOptionPane.showInputDialog(null, "Input Nilai UAS",
                "UAS", JOptionPane.QUESTION_MESSAGE);
        
        // konversi ke integer
        TUG = Integer.parseInt(strTUG);
        UTS = Integer.parseInt(strUTS);
        UAS = Integer.parseInt(strUAS);

        // hitung rerata
        rerata = (TUG + UTS + UAS) / 3;
                
        // Memformat angka
        DecimalFormat duaAngka = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, 
                "TUGAS = " + TUG + 
                "\nUTS = " + UTS + 
                "\nUAS = " + UAS + 
                "\nRerata = " + duaAngka.format(rerata), 
                "Nilai", JOptionPane.INFORMATION_MESSAGE);

        // Mengakhiri program GUI
        System.exit(0);

    } // Akhir metoda main
} // Akhir kelas NilaiRata2

