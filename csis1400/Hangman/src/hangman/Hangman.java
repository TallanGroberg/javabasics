/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;


import java.util.*;
import java.util.Scanner;

/**
 *
 * @author tallan
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String[] words = { "cucumber", "wire", "boat", "java", "ruby", };
        int count = 0;
        String word = words[(int) (Math.random() * words.length)];
        char[] underline = new char[word.length()];
        underline = explode(underline, word);
        game( count, underline, word);
    }
    
    public static void game(int count, char[] underline, String word) 
    {
        Scanner input;
        int correct = 0;
        int wrong = 0;
        String under = "_";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = new char[letters.length()];
        alphabet = explode(alphabet, letters);
        
        
        
        char correctGuesses[] = new char[underline.length];
        input = new Scanner(System.in);
        int n = 0;
        char[] wrongGuesses = new char[n + 1];
        
        while(count < 7)
        {
            
            
            for(int j = 0; j < correctGuesses.length; j++)
            {
                
                if(correctGuesses[j] != underline[j])
                System.out.print(" _ ");
                else 
                {
                    System.out.print(correctGuesses[j] + " ");
                    
                }
            }
            System.out.println();
            System.out.println("choose a letter to guess");
            char guess = input.next().charAt(0);
            

            
            

            for (int i = 0; i < alphabet.length; i++) 
            {
                if(alphabet[i] == guess)
                {
                    alphabet[i] = under.charAt(0);
                }
                System.out.print(alphabet[i] + " ");
            }
            System.out.println();
            for (int c = 0; c < underline.length; c++) 
            {
                
                if (underline[c] == guess)
                {
                    correctGuesses[c] = guess;
                    correct++;
                    System.out.println();
                }
            }
            if(correct == correctGuesses.length)
            {
                count = 7;
                
                System.out.print("you won the word was ");
                for (int i = 0; i < underline.length; i++) 
                {
                    System.out.print(underline[i]);
                }
                System.out.println();
            }

            // count++;

            image(count);
        }
        input.close();
        
    }

    public static void image(int count) 
    {
        
        if(count == 1)
        System.out.println("------");
        if(count ==2 )
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if(count == 3)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if(count == 4)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|     \\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if(count == 5)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   / \\");
            System.out.println("|    ");
            System.out.println("|");
            System.out.println("|");
        }
        if(count == 6)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   / \\");
            System.out.println("|    |");
            System.out.println("|    ");
            System.out.println("|");
        }
        if(count == 7)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   / \\");
            System.out.println("|    |");
            System.out.println("|   /");
            System.out.println("|");
        }
        if(count == 8)
        {
            System.out.println("------");
            System.out.println("|    |");
            System.out.println("|    O");
            System.out.println("|   /| \\");
            System.out.println("|    |");
            System.out.println("|   / \\");
            System.out.println("|");
        }
    }
    
    public static char[] explode(char[] underline, String word) {
        underline = word.toCharArray();
        
        return underline;
    }


    
}
