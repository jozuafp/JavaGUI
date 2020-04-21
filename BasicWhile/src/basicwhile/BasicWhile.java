/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicwhile;

/**
 *
 * @author JW
 */
public class BasicWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 100)
        {
            System.out.println(counter);
            counter += 2;
        }
        System.out.println("Counter = " + counter);
    }
    
}
