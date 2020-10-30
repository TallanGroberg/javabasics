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

        String[] names = {
            "Liam",
            "Olivia",
            "Noah",
            "Emma",
            "Oliver",
            "Ava",
            "William",
            "Sophia",
            "Elijah",
            "Isabella",
            "James",
            "Charlotte",
            "Benjamin",
            "Amelia",
            "Lucas",
            "Mia",
            "Mason",
            "Harper",
            "Ethan",
            "Evelyn"
        };
            
            
            

            for (int i = 0; i < names.length; i++) {
                payroll.writeWord("'" + names[i] + "'");
                payroll.writeDouble( random());
                payroll.writeDouble( random());
                payroll.writeEOL();
            }
            String name, payRate, hours;
            payroll.close();
        }

        public static int random() {
            int rando = (int) Math.round(Math.random() * 100);
            return rando;
    }
    
    
}
