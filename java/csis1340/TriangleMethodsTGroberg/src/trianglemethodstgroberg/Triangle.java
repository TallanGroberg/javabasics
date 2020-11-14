package trianglemethodstgroberg;

import java.util.Arrays;

class Triangle {


    public String triangleType(int[] triangleSides) {
        int a, b, c;
        a = triangleSides[0];
        b = triangleSides[1];
        c = triangleSides[2];

        if(a == c ) {
            return equalateral();
        } else if(a == b || b == c) {
                return isosolise() ;
        } else {
            return scalene();
        }

    }
    public String equalateral() {
        return "Equalateral";
    }
    public String isosolise() {
        return "Isosolise";
    }
    public String scalene() {
        return "Scalene";
    }

    public String sortSides(int a, int b, int c) {
        int[] triangleSides = {a,b,c};
        System.out.println( a + " " + b + " " + c);
        Arrays.sort(triangleSides);
       

        int[] acending = {a,b,c};
        
        if(a + b >= c) {
            return triangleType(acending);
        } else {
            return "Not a triangle, the longest side is longer than the shorter sides added together";
        }
    }





}