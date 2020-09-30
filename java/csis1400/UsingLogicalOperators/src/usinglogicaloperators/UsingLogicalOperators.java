/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinglogicaloperators;
import java.util.Scanner; 
/**
 *
 * @author tallan
 */
public class UsingLogicalOperators 
{

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) 
    {
        // TODO code application logic here
        int response;
        Scanner prompt;
        prompt = new Scanner(System.in);

        System.out.println("enter a number: ");
        response = prompt.nextInt();
        if(response % 5 == 0 || response % 6 == 0)
        {
            if(response % 5 == 0 && response % 6 == 0)
            {
                System.out.println(response + " divisible by 5 and 6");
            }
            if(response % 5 == 0 && response % 6 != 0)
            {
               System.out.println(response + " is divisible by 5 but not 6");
            }
            if(response % 6 == 0 && response % 5 != 0 )
            {
                System.out.println(response + " is divisible by 6 but not 5");
            }
                
        }
            else
            {
                System.out.println("not divisible by 5 or 6.");
            }
    }
    
}
