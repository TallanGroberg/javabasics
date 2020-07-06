/*
Tallan Groberg
 */
package ibsnchecksum;

/**
 *
 * @author tallan
 */
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ibsnchecksum.*;


public class IbsnChecksum 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String response;
        JFrame input;
        int[] ibsnfinal;
        
        input = new JFrame();
        for (int i = 0; i < 9; i++) 
        {
            String[] withX = new String[9];
            int[] ibsnIn = new int[9];
            response = JOptionPane.showInputDialog(input, "Enter the first 9 digits of an ISBN number: ");
            char[] res = response.toCharArray();

                
                for(int j = 0; j < response.length(); j++) 
                {
                    ibsnIn[j] = res[j] -48;
                    ibsnIn[j] = ibsnIn[j] * (j + 1);
                    
                }
                
                int result = Arrays.stream(ibsnIn).sum();
                System.out.println(result);
                int finalnum = result % 11;
                ibsnIn = Arrays.copyOf(ibsnIn, ibsnIn.length + 1);
                ibsnIn[ibsnIn.length -1] = finalnum;
                
                
                if(finalnum == 10)
                {
                    

                    for (int j = 0; j < withX.length; j++) 
                    {
                        withX[j] = Integer.toString(ibsnIn[j]);
                        
                    }
                    withX = Arrays.copyOf(withX, withX.length + 1);
                    withX[withX.length -1] = "X";
                    System.out.print(withX);

                }else 
                {

                    System.out.println("ibsn : " + Arrays.toString(ibsnIn));
                }

                if(ibsnIn[ibsnIn.length -1] == 10)
                {

                    int yesAndNo = JOptionPane.showConfirmDialog(null, "ibsn is: " + Arrays.toString(withX) + " would you like to go again");
                    if(yesAndNo != 0 ) System.exit(0);
                } else 
                {
                    int yesAndNo = JOptionPane.showConfirmDialog(null, "ibsn is: " + Arrays.toString(ibsnIn) + " would you like to go again");
                    if(yesAndNo != 0 ) System.exit(0);
                }


                
        }

            System.exit(0);
    }

    
    
}
