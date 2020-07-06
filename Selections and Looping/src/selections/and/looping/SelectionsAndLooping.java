package selections.and.looping;

import java.util.Scanner;

/*  This program inputs an ending number and displays all numbers between
 1 and the ending number that are evenly divisible by 3.

Tallan Groberg

 */
public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        int n;
        int count;
        Scanner input;

        input = new Scanner(System.in);
      

        // input the ending number
        System.out.println("Enter the ending number: ");
        n = input.nextInt();
        System.out.println("enter the number of divisibility ");
        count = input.nextInt();
        System.out.println("Below are all the numbers that are evenly divisible by " + count + " from 1 up to " + n);

        for (int i = 0; i < n; i++) 
        {
            if(i % count == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

}
