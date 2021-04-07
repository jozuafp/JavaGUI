/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak.angka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jozua Palandi
 */

class FrameTebakAngka extends JFrame implements ActionListener {

    private Container container = new Container();
    private Button tombolCek = new Button("Cek");
    private TextField inputan = new TextField("", 8);
    private int angkaAcak = (int) (Math.random() * 10);

    FrameTebakAngka() {
        super("Tebak angka");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 80);
        setLocation(200, 200);

        tombolCek.addActionListener(this);

        container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JLabel("Tebak angka antara 0-9"),
                BorderLayout.NORTH);
        container.add(new JLabel("Tebakan anda :"),
                BorderLayout.WEST);
        container.add(inputan, BorderLayout.CENTER);
        container.add(tombolCek, BorderLayout.EAST);

        show();
    }

    public void actionPerformed(ActionEvent e) {
        Object objek = e.getSource();

        if (objek == tombolCek) {
            int jawaban = Integer.parseInt(inputan.getText());

            if (jawaban == angkaAcak) {
                JOptionPane.showMessageDialog(null, "Benar.. Anda memang peramal jitu");
            } else {
                JOptionPane.showMessageDialog(null, "Jawaban anda salah..");
            }
        }
    }
}

public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FrameTebakAngka();
    }

}
