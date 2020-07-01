package hackerRankPractice;
import java.util.*;
import java.io.*;
/**
 * Java loops 2;
 */

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //loop through n 
            for(int j = 0;j < n; j++) {
                //while looping through n add a and b 
                a+=b; 
                //print the first result
                System.out.print(a + " ");
                //after its printed, times b by 2 for the next interation. 
                b=b*2;
            }
            System.out.println("");
        }
        in.close();
    }
}