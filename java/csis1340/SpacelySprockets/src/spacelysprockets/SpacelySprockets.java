/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacelysprockets;

import java.util.*;
import java.util.regex.*;


/**
 *
 * @author tallan
 */

 
public class SpacelySprockets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        InputFile sprocket = new InputFile("sprockets.txt");

        int[] quantity = new int[]{};
        int[] quantityAdd1 = new int[quantity.length + 1];
        System.arraycopy(quantity, 0, quantityAdd1, 0, quantity.length);
        
        int[] nums = new int[]{};
        int[] numsAdd1 = new int[quantity.length + 1];
        System.arraycopy(nums, 0, numsAdd1, 0, nums.length);

        int[] allNums = new int[numsAdd1.length + quantityAdd1.length ];
        System.arraycopy(quantityAdd1,0,allNums,0, quantityAdd1.length);
        System.arraycopy(numsAdd1,0,allNums,quantityAdd1.length, numsAdd1.length);
        

        HashMap<Integer, Integer> orders = new HashMap<Integer, Integer>();
        

        





        int count = 1;
       

        String REGREX_NUM = "\\d+";
        
        System.out.println("Sprocket Number         total quantity");
        while(!sprocket.eof())
        {
            String line = sprocket.readLine();
            Pattern pattern = Pattern.compile(REGREX_NUM);
            Matcher matcher = pattern.matcher(line);


            while(matcher.find())
            {
                
                
                
                if(count % 2 != 0) {
                    
                    numsAdd1[nums.length] = Integer.parseInt(matcher.group());
                    System.out.print( numsAdd1[nums.length] + "                       ");
                } else if(count % 2 == 0)
                {
                    quantityAdd1[quantity.length] = Integer.parseInt(matcher.group());
                    System.out.print("    " +  quantityAdd1[quantity.length]);
                    System.out.println();
                }
                
                
                String even = Integer.toString(numsAdd1[nums.length]); 
                String odd = Integer.toString(quantityAdd1[quantity.length]);

                


                orders.put(numsAdd1[nums.length], quantityAdd1[quantity.length]);
                count++;
                
            }
            
        }

        System.out.println(orders);
    }
    
}
