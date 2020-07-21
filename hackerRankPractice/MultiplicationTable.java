package hackerRankPractice;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++)
        System.out.print(" " + j);
        System.out.println("---------------------");
        for (int i = 1; i < 10; i++) 
        {
            System.out.print( i + " | ");
            for (int j = 1; j < 10; j++) 
            {
            System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}