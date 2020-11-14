package amortization;

import javax.swing.*;

public class WindowMaker extends HelperMethods {
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
           
    }

    public static void append(String arg) {
        jta.append(arg);
    }

    public static String cleanIt(String fileName, String[]words) {
        OutputFile cleanup = new OutputFile("./" + fileName + ".txt");

        for (int i = 0; i < words.length; i++) {
            // make a way to add a space after every double quote. 
            words[i] = checkDoubleQuotes(words[i]);
                cleanup.writeWord( words[i] );
            words[i] = words[i].replaceAll("[^\\w]", " ");
               append(Integer.toString(i) + " ");
               append(words[i] + "\n");
    
            }
            cleanup.close();

        return "";
    }



}
