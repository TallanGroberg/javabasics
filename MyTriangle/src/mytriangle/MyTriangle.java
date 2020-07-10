/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytriangle;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tallan
 */
public class MyTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double sidea, sideb, sidec;
        sidea = Double.parseDouble(JOptionPane.showInputDialog("enther the length of the first side of the triangle: "));
        sideb = Double.parseDouble(JOptionPane.showInputDialog("enther the length of the second side of the triangle: "));
        sidec = Double.parseDouble(JOptionPane.showInputDialog("enther the length of the third side of the triangle: "));
		
        
        if(isValid(sidea,sideb,sidec) == true)
        {
            JOptionPane.showMessageDialog(null, triangleType(sidea, sideb, sidec) + " " + "with Area: " + area(sidea, sideb, sidec));
        } else 
        {
            
            JOptionPane.showMessageDialog(null, "Not a valid triangle");
        }
    
        System.exit(0);
    }
    public static boolean isValid(double sidea, double sideb, double sidec) 
    {
        if(sidea > 0 && sideb > 0 && sidec > 0 && area(sidea,sideb,sidec) > 0)
        {

            if(Math.abs(sidea - sideb) < sidec && sidea + sideb > sidec)
            {
                return true;
            } else if(Math.abs(sidea - sidec) < sideb && sidea + sidec > sideb)
            {
                
                return true;
            } else if(Math.abs(sidec - sideb) < sidea && sidec + sideb > sidea)
            {
                
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }
        public static double area(double sidea, double sideb, double sidec) 
    {
        double area;
        area = (sidea + sideb + sidec) / 2;

        double restof = Math.sqrt( area * (area - sidea) * (area - sideb) *(area - sidec) );
        return restof;
    }

    public static String triangleType(double sidea, double sideb, double sidec) 
    {
        

        if(isValid(sidea, sideb, sidec) == true) 
        {
            if(sidea == sideb && sideb == sidec)
            {
                return "Equilateral";
            } else if(sidea == sideb || sideb == sidec)
            {
                return "Isosceles";
            } else 
            {
                return "Scalene";
            }
        } 
        return "";
    }
    
}
