import java.util.*;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of points.");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("enter the points");
        for (int i = 0; i < numberOfPoints; i++) 
        {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            System.out.println(Arrays.toString(points[i]));
        }
        int p1 = 0, p2 =1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        System.out.println(shortestDistance);

        for (int i = 0; i < points.length; i++) 
        {
            for (int j = 0; j < points[i].length; j++) 
            {   
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(shortestDistance > distance)
                {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        


    }

        public static double distance(double x1, double y1, double x2, double y2) 
        {
          return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            
        }


}