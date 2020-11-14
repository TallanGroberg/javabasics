package amortization;

import javax.swing.*;

public class WindowMaker {
    public static JFrame jf = new JFrame();
    public static JTextArea jta= new JTextArea();
    public static JScrollPane jsp= new JScrollPane(jta);
    public static int count;

    public static void makeWindow() {
        jf.setSize(500, 500);
        jf.setLocation(400, 250);
           //make the X box of the window stop the program
           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
           // add the scroll pane to the JFrame instead of the text area
           jf.add(jsp);
           
           jf.setVisible(true);
   
           jta.append("\ttest");
    }





}
