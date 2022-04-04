/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_a1_01;

/**
 *
 * @author Jozua Palandi
 */
public class AWT_A1_01 {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame mf = new MyFrame();
        mf.setSize(WIDTH, HEIGHT);
        
        CloseFrame cf = new CloseFrame();
        mf.addWindowListener(cf);
        
        mf.setVisible(true);
    }
}
