/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortization;

import amortization.WindowMaker;
import java.util.regex.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author tallan
 */
public class Amortization extends Mary 
{

  /**
   * @param args the command line arguments
   */

  public static void main(String[] args) 
  {
    makeWindow();
    // TODO code application logic here
    InputFile data = new InputFile("data.txt");
    InputFile cleanedUpFile = new InputFile("withoutQuotes.txt");
    String[] words = readingOneLineHandler(data);
    String[] cleanedWords = readingOneLineHandler(cleanedUpFile);

    cleanIt("withOutQuotes", cleanedWords);
    separatePeople(cleanedWords);

    heading();
    table();
    calculatePayments();
    mary();
  }
}
