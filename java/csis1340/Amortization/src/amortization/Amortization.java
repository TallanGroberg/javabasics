/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortization;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import amortization.WindowMaker;
import java.util.regex.*; 

/**
 *
 * @author tallan
 */
public class Amortization extends WindowMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        makeWindow();
        // TODO code application logic here
        InputFile data = new InputFile("data.txt");
        InputFile cleanedUpFile = new InputFile("withoutQuotes.txt");
        String[] words = readingHandler(data);
        String[] cleanedWords = readingHandler(cleanedUpFile);
        

        cleanIt("withOutQuotes", cleanedWords);
        separatePeople(cleanedWords);
        
        
        
    }

    public static String readIt( String[] words) {
        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].replaceAll("[^\\w]", " ");
               append(Integer.toString(i) + " ");
               append(words[i] + "\n");
            }
            

        return "";
    }

    
    
}
