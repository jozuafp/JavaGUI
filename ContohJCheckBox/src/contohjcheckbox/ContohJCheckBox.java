/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjcheckbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author JW
 */
public class ContohJCheckBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f= new JFrame("Contoh CheckBox");  
        JCheckBox checkBox1 = new JCheckBox("Pascal");  
        checkBox1.setBounds(100,100, 65,50);  
        JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,150, 65,50);  
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
    }
    
}
