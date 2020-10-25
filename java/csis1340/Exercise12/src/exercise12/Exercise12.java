/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12;
import javax.swing.*; 

/**
 *
 * @author tallan
 */
public class Exercise12 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        OutputFile payroll;
        payroll = new OutputFile("employee.txt");
        
        // TODO code application logic here



        String answer;
        do 
        {

            String name, payRate, hours;
            
            
            // name = JOptionPane.showInputDialog("Employee name");
            // payroll.writeWord(name);
            
            // payRate = JOptionPane.showInputDialog("hourly pay?");;
            // payroll.writeWord(payRate);
            
            // hours = JOptionPane.showInputDialog("hours worked?");;
            // payroll.writeWord(hours);
            // payroll.writeEOL();
            // ;
            // answer = JOptionPane.showInputDialog("do you have another employee (yes/no)");
        } while(answer.equalsIgnoreCase("yes"));
            
            
            payroll.close();
            



           


        
            
            


        
    }
    
    
}
