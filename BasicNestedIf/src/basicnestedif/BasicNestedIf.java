/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicnestedif;

/**
 *
 * @author JW
 */
public class BasicNestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai = 0;
        nilai = 20;
        if (nilai >= 56)
        {
            System.out.println("Anda LULUS");
            if (nilai == 100)
            {
                System.out.println("sempurna");
            }
        }
        else
        {
            System.out.println("Anda GAGAL");
            if (nilai == 0)
            {
                System.out.println("kebangeten");
            }
        }
        System.out.println("--------");
        System.out.println("Selesai."); 
    }
    
}
