/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theadditiongame;

import java.util.*;
/**
 *
 * @author tallan
 */
public class TheAdditionGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input;
        int questions;
        int add1;
        int add2;
        int answers;
        int correct = 0;
        input = new Scanner(System.in);
        System.out.println("Welcome to the addition game, how many questions would you like to ask?");
        questions = input.nextInt();
        for (int i = 0; i < questions; i++) 
        {
            //the (int) converts the datatype from a double to an interger. 
            add1 = 10 + (int) (Math.random() * 41);
            add2 = 10 + (int) (Math.random() * 41);
            System.out.println("What is " + add1 + " + " + add2);
            answers = input.nextInt();

            if(add1 + add2 == answers)
            {
                correct++;
                System.out.println("----------");
                System.out.println("----------");
                System.out.println("");
                System.out.println("Correct :) ");
                System.out.println(correct + " out of " + questions);
                System.out.println("");
                System.out.println("----------");
                System.out.println("----------");
            } else 
                {
                    System.out.println("----------");
                    System.out.println("----------");
                    System.out.println("");
                    System.out.println("Incorrect :(");
                    System.out.println(correct + " out of " + questions);
                    System.out.println("");
                    System.out.println("----------");
                    System.out.println("----------");
                }
        }
        System.out.println("you got " + correct + " out of " + questions + " correct");


    }
    
}
