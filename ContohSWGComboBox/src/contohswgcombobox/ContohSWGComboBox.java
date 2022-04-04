/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohswgcombobox;

/**
 *
 * @author Jozua Palandi
 */
public class ContohSWGComboBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Contoh ComboBox");
        String pemrog[] = {"COBOL", "Pascal", "C++", "Java", "R"};
        JComboBox cb = new JComboBox(pemrog);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    
}
