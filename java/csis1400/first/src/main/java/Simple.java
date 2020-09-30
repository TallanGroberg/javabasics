/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tallan
 */

import java.util.*;

import javax.swing.JFrame;

public class Simple 
{
    public static <Keyboard> void main(String[] args)
    {
         int x = 1;
         int a = 3;
         int b = 4;

        if (a < b)

        {

                    while ( a <= 30 )

                    {

                                a = a * 10;

                                x = x + 5;

                    }

                    System.out.println( x + " " );

                    System.out.println( a );

        }

        else

        {

                    System.out.println("I better find a new career");

        }
    }
}
