/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutmanager_borderlayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Jozua Palandi
 */
public class LayoutManager_BorderLayout extends JFrame implements ActionListener{
private JButton tombol[];
private String names[]={"Hilangkan North","Hilangkan South", 
"Hilangkan East","Hilangkan West", 
"Hilangkan Center"};
private BorderLayout lout;
public LayoutManager_BorderLayout(){
super ("Ini Adalah Contoh Border Layout");
Container c = getContentPane();
lout = new BorderLayout (10,10);
c.setLayout(lout);
tombol = new JButton[names.length];
for (int i=0 ; i < names.length; i++){
tombol[i] = new JButton(names[i]);
tombol[i].addActionListener(this);
}
c.add(tombol[0], BorderLayout.NORTH);
c.add(tombol[1], BorderLayout.SOUTH);
c.add(tombol[2], BorderLayout.EAST);
c.add(tombol[3], BorderLayout.WEST);
c.add(tombol[4], BorderLayout.CENTER);
setSize (500,300);
}
public void actionPerformed(ActionEvent e){
for(int i=0; i<button.length;i++){
 if(e.getSource()==button[i]) 
 button[i].setVisible(false);
 else button[i].setVisible(true);
 layout.layoutContainer(getContentPane());
}
}
public static void main(String[] args) {
 LayoutManager_BorderLayout dbl = new LayoutManager_BorderLayout();
 dbl.setVisible(true);
 dbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
}