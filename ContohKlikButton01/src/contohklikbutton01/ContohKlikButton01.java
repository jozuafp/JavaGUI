/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohklikbutton01;

/**
 *
 * @author Jozua Palandi
 */
public class ContohKlikButton01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh Klik Button");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click disini");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Belajar GUI");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
