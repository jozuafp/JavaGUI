/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicfor2;

/**
 *
 * @author JW
 */
public class BasicFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int total = 0;
        //int counter;
        for(int counter=1;counter<=100;counter++)
        {
            //System.out.println(counter);  
            total = total + counter;
        }
        System.out.println("Total = " + total);
        //System.out.println("Counter =" + counter);
    }
    
}
