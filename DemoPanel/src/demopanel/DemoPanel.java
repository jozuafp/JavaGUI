/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;
/**
 *
 * @author Jozua Palandi
 */
public class DemoPanel extends JFrame{
    public DemoPanel() {
 
      JTextField text1, text2, text3;
      JLabel label1, label2, label3;
      JButton button1, button2;
      JPanel panel1, panel2, panel3;
 
      label1 = new JLabel("Nilai Pertama");
      label2 = new JLabel("Nilai Kedua");
      label3 = new JLabel("Hasil kalkulasi");
  
      panel1 = new JPanel();
      panel1.setLayout(new GridLayout(3, 1));
      panel1.add(label1);
      panel1.add(label2);
      panel1.add(label3);
 
      text1 = new JTextField(15);
      text2 = new JTextField(15);
      text3 = new JTextField(15);
 
      panel2 = new JPanel();
      panel2.setLayout(new GridLayout(3, 1));
      panel2.add(text1);
      panel2.add(text2);
      panel2.add(text3);
 
      button1 = new JButton("Kali (x)");
      button2 = new JButton("Tambah (+)");
 
      panel3 = new JPanel();
      panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
      panel3.add(button1);
      panel3.add(button2);
 
      Container container = getContentPane();
      container.setLayout(new BorderLayout());
      container.add(panel1, BorderLayout.LINE_START);
      container.add(panel2, BorderLayout.LINE_END);
      container.add(panel3, BorderLayout.PAGE_END);
 
   }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      DemoPanel frame = new DemoPanel();
      frame.setTitle("Kelas DemoPanel");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(280, 150);
      frame.setVisible(true);
    }
    
}
