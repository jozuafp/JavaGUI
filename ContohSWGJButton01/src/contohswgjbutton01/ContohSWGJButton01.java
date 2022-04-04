/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohswgjbutton01;
    
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author Jozua Palandi
 */
public class ContohSWGJButton01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Contoh menggunakan Button");
        JButton b = new JButton("Click disini");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
