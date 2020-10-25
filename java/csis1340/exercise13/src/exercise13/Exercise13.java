/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;

import java.util.ArrayList;
import java.util.regex.*;

import javax.lang.model.element.Name;

/**
 *
 * @author tallan
 */
public class Exercise13 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String[] names = new String[]{};
        String[] namesadd1 = new String[names.length + 1];
        System.arraycopy(names, 0, namesadd1, 0, names.length);
        

        double[] hours = new double[]{};
        double[] hoursadd1 = new double[hours.length + 1];
        System.arraycopy(hours, 0, hoursadd1, 0, hours.length);

        double[] payRate = new double[]{};
        double[] payRateAdd1 = new double[payRate.length + 1];
        System.arraycopy(payRate, 0, payRateAdd1, 0, hours.length);

        double[] pay = new double[]{};
        double[] payadd1 = new double[pay.length + 1];
        System.arraycopy(pay, 0, payadd1, 0, pay.length);


        

        // TODO code application logic here
    InputFile payRoll = new InputFile("employee.txt");

    int countNames = 0;
    int count = 0;


    String REGREX_NUM = "\\d+";
    String REGREX_NAME =  "[a-zA-Z]+";



        while(!payRoll.eof()) 
        {

            String line = payRoll.readLine();

            Pattern namePattern = Pattern.compile(REGREX_NAME);
            Matcher nameMatcher = namePattern.matcher(line);
            
            while(nameMatcher.find())
            {
                countNames++;
                namesadd1[names.length] = nameMatcher.group();
                System.out.println("employee name: " + namesadd1[names.length]);
            }

            Pattern hoursPattern = Pattern.compile(REGREX_NUM);
            Matcher hoursMatcher = hoursPattern.matcher(line);

            while(hoursMatcher.find())
            {
                if(count % 2 == 0)
                {
                    hoursadd1[hours.length] = Double.parseDouble(hoursMatcher.group());
                    System.out.println("hours worked: " + hoursadd1[hours.length]);
                    count++;
                } else
                {
                    payRateAdd1[payRate.length] = Double.parseDouble(hoursMatcher.group());
                    System.out.println("payrate is: " + payRateAdd1[payRate.length]);
                    
                    if(hoursadd1[hours.length] < 40) 
                    {
                        payadd1[pay.length] = Double.parseDouble(hoursMatcher.group()) * hoursadd1[hours.length];
                        System.out.println("total pay: " + payadd1[pay.length]);
                        count++;
                    } else {
                        double overtimeHours;
                        overtimeHours = (hoursadd1[hours.length] - 40) * 1.5 + hoursadd1[hours.length];
                        hoursadd1[hours.length] = overtimeHours;
                        payadd1[pay.length] = Double.parseDouble(hoursMatcher.group()) * hoursadd1[hours.length];
                        System.out.println("total pay with overtime: " + payadd1[pay.length]);
                        count++;
                    }
                    
                    
                }
            }
            System.out.println();

            }


            payRoll.readLine();
        }

}
