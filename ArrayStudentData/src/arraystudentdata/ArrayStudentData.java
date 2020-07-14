/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystudentdata;

/**
 *
 * @author tallan
 */
import java.util.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayStudentData {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) throws FileNotFoundException 
    {
        // TODO code application logic here
        File text = new File("src/studentdata.txt");
        
        Scanner fileScan = new Scanner(text);
        int lineNum =  1;
        String[] studentArray;
        double gpa[];
        String[] splitInfo;
        String line;

        while(fileScan.hasNextLine())
        {
            lineNum++;
            line = fileScan.nextLine();
        }
       
        
       
        studentArray = new String[lineNum];
        gpa = new double[lineNum];
        fileScan = new Scanner(text);

        for (int i = 0; fileScan.hasNextLine(); i++) 
        {
            splitInfo = fileScan.nextLine().split("\\s\\s");
            studentArray[i] = splitInfo[0];
            System.out.println("  " + studentArray[i]);
            gpa[i] = Double.parseDouble(splitInfo[1]);
            System.out.println(gpa[i]);
        }
        histogram(gpa);
        studentRank(gpa, studentArray);
    }

    public static void histogram(double[] gpa) 
    {
        
        double[] gradingTotals = new double[8];
        for (double i : gpa) 
        {
            if(i < 0.5) gradingTotals[0]++;
            if(i >= 0.5 && i < 1) gradingTotals[1]++;
            if(i >= 1 && i < 1.5) gradingTotals[2]++;
            if(i >= 1.5 && i < 2) gradingTotals[3]++;
            if(i >= 2 && i < 2.5) gradingTotals[4]++;
            if(i >= 2.5 && i < 3) gradingTotals[5]++;
            if(i >= 3 && i < 3.5) gradingTotals[6]++;
            if(i >= 3.5 && i < 4) gradingTotals[7]++;
            
        }
        System.out.print(" 0.0 to 0.49 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[0] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(0)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();
        System.out.print(" 0.5 to 0.99 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[1] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(1)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 1.0 to 1.49 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[2] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(2)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 1.5 to 1.99 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[3] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(3)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 2.0 to 2.49 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[4] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(4)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 2.5 to 2.99 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[5] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(5)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 3.0 to 3.49 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[6] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(6)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

        System.out.print(" 3.5 to 3.99 "); 
        System.out.print(" " + "(" +  (int) gradingTotals[7] + ")" +  " ");
        for (double j = 0; j < gradingTotals[Math.round(7)]  ;j++) 
        {
            if(j % 10 == 0) System.out.print("*");
        }
        System.out.println();

    }

    public static void studentRank(double[] gpa, String[] studentArray) {
        
        HashMap<String, Double> students;
        double[] sorted_gpa;
        int[] ranking = new int[gpa.length];

        double  lowest = 0.0;
        sorted_gpa = gpa.clone();
        int currentRank = 0;
        double[] ties = new double[gpa.length];
        double[] tiesCount = new double[gpa.length * ties.length];
        int tieCount = 0;
        
        students = new HashMap<>(studentArray.length);
        
        for (int i = gpa.length -1;i >= 0; i--) 
        {
            ranking[i] = currentRank++;
            Arrays.sort(sorted_gpa);
            System.out.println(sorted_gpa[i] + " " + currentRank);
        }
        
        for (int i = 0; i < studentArray.length - 1; i++) 
        {
            if(sorted_gpa[i + 1] == sorted_gpa[i] && sorted_gpa[i] != sorted_gpa[i - 1])
            {   
                tieCount++;
                ties[i] = sorted_gpa[i];
                
                // System.out.println(ties[i]);
                // System.out.println(tieCount);
            }
        }

        
       
        
        
        
    }
    
}
