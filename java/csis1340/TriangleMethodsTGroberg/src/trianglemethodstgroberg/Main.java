/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglemethodstgroberg;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tallan
 */
public class Main extends Triangle {

    public static JOptionPane jPane = new JOptionPane();
    public static Triangle triangle = new Triangle();
    public static int a_int, b_int, c_int;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a,b,c;

        a = JOptionPane.showInputDialog(null, "how long is the first side? ");
        b = JOptionPane.showInputDialog(null, "how long is the second side? ");
        c = JOptionPane.showInputDialog(null, "how long is the third side? ");
        
        a_int = Integer.parseInt(a);
        b_int = Integer.parseInt(b);
        c_int = Integer.parseInt(c);
        JOptionPane.showMessageDialog(null, triangle.sortSides(a_int, b_int, c_int));
    }
}
