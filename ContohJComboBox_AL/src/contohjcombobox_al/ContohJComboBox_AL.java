/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohjcombobox_al;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JW
 */
public class ContohJComboBox_AL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Contoh ComboBox");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(200, 450);
        JButton b = new JButton("Tampilkan");
        b.setBounds(200, 100, 95, 20);
        String pemrog[] = {"COBOL", "Pascal", "C++", "Java", "R"};
        final JComboBox cb = new JComboBox(pemrog);
        cb.setBounds(50, 100, 90, 20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Pilihan Anda: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

}
