/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicswitch;

/**
 *
 * @author JW
 */
public class BasicSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bulan = 0;
        switch(bulan)
        {
            case 1 : System.out.println("Januari");
                break;
            case 2 : System.out.println("Februari");
                break;
            case 3 : System.out.println("Maret");
                break;
            case 4 : System.out.println("April");
                break;
            case 5 : System.out.println("Mei");
                break;
            case 6 : System.out.println("Juni");
                break;
            case 7 : System.out.println("Juli");
                break;
            case 8 : System.out.println("Agustus");  
                break;
            case 9 : System.out.println("September");
                break;
            case 10 : System.out.println("Oktober");
                break;
            case 11 : System.out.println("Nopember");
                break;
            case 12 : System.out.println("Desember");  
                break;
            default :    
                System.out.print("bulan = " + bulan);
                System.out.println("\t--> Anda salah input");
        }
    }
    
}
