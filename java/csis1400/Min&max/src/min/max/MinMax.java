/*
Tallan Groberg
 */
package min.max;
import javax.swing.JOptionPane;

/**
 *
 * @author tallan
 */
public class MinMax 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int small;
        int large;
        int i = 0;
        int input;
        // TODO code application logic here
        large = Integer.MAX_VALUE;
        small = Integer.MIN_VALUE;
        
        do 
        {
            input = Integer.parseInt(JOptionPane.showInputDialog("press 0 three times to exit", "Please enter a whole number: "));
            
            
            if(input < large)
            {
                large = input;
            }
            else if(input > small)
            {
                small = input;
            }else if(input == 0)
            {
                i = 1;
                JOptionPane.showConfirmDialog(null, "your largest number " + large + " your smallest number is " + small, null, JOptionPane.OK_CANCEL_OPTION);

            }
            System.out.println("in the do " + " large : " + large  + " small: " + small);
            
            
        } while(i == 0); 

        if (large == Integer.MIN_VALUE)
        {
            large = small;
        }
        else if (small == Integer.MAX_VALUE)
        {
            small = large;
        }

        System.out.println("smallest" + small + "largest: " + large);
    }
}
