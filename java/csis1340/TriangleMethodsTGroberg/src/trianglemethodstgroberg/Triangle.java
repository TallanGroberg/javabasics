package trianglemethodstgroberg;

class Triangle {


    public String convertToInt(String a ,String b,String c) {
        int a_int, b_int, c_int;
        a_int = Integer.parseInt(a);
        b_int = Integer.parseInt(b);
        c_int = Integer.parseInt(c);
        return triangleType(a_int, b_int, c_int);
    }

    public String triangleType(int a, int b, int c) {
        if(a == b && b == c) {
            return equalateral();
        } else if(a == b || b == c || c == a) {
                return isosolise();
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



}