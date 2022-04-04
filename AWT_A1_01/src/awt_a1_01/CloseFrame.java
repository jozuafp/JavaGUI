/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_a1_01;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jozua Palandi
 */
public class CloseFrame extends WindowAdapter{ 
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}