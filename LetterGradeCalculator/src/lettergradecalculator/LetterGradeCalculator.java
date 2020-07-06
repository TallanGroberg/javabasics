/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettergradecalculator;
import java.util.*;

/**
 *
 * @author tallan
 */
public class LetterGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input;
        input = new Scanner(System.in);
        String StudentName;
        System.out.println("enter the students name. ");
        StudentName = input.nextLine();
        System.out.println("enter the students Id number. ");
        int studentId = input.nextInt();
        System.out.println("enter " + StudentName + "'s first quiz score");
        double quiz1 = input.nextDouble();
        System.out.println("enter " + StudentName + "'s second quiz score");
        System.out.println("");
        System.out.println("enter zero if only one quiz");
        double quiz2 = input.nextDouble();
        double quizScore = dropOneScore(quiz1, quiz2) * 0.4;
        System.out.println("enter first exam score");
        double exam1 = input.nextDouble();
        System.out.println("enter the second exam score");
        double exam2 = input.nextDouble();
        double examScore = dropOneScore(exam1, exam2) * 0.6;

        double score = quizScore + examScore;
        
        getGrade(score, StudentName);
        
    }
    
    public static double printGrade(double arg) 
    {
        return arg;
    }
    
    public static double dropOneScore(double arg1, double arg2) 
    {
        double result;
        if(arg1 > arg2)
        {
            result = arg1;
        }else 
        {
            result = arg2;
        }
        return result;
    }
    
    public static char getGrade(double score, String StudentName) 
    {
        
        if(score >= 90.0)
        {
            System.out.println(StudentName + "'s final letter grade is A: " + score + "%"); 
           
            return 'A';
        }
        else if (score >= 80.0)
        {
            System.out.println(StudentName + "'s final letter grade is  B: " + score + "%" ); 
            return 'B';
        }
        else if (score >= 70.0)
        {
            System.out.println(StudentName + "'s final letter grade is C: " + score + "%"); 
            return 'C';
        }
        else if (score >= 60.0)
        {
            System.out.println(StudentName + "'s final letter grade is D: " + score + "%"); 
            return 'D'; 
        }
        else
        {
            System.out.println(StudentName + "'s final letter grade is F: " + score + "%"); 
            return 'F';
        }
    }
    
}
