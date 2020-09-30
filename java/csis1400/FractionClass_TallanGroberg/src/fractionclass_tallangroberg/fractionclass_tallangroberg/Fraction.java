// Tallan Groberg

package fractionclass_tallangroberg;


public class Fraction {

    private int numer;
    private int denom;

    public Fraction(int numer, int denom) throws Exception
    {
        if (denom == 0) throw new Exception("Invalid Fraction (denominator cannot be 0).");
        
        // Normalize Fractions 
        this.numer = (numer * denom >= 0) ? Math.abs(numer) : 0 - Math.abs(numer);
        this.denom = Math.abs(denom);
    }
    
    // Default to 1/1 when no arguments provided
    Fraction() 
    { 
        this.numer = this.denom = 1; 
    }
    
    @Override

    //return the fraction as is. 
    public String toString() 
    { 
        return String.valueOf(numer) + "/" + String.valueOf(denom); 
    }

    //returns decimal
    public Double getDecimal() 
    { 
        return numer / (double) denom; 
    }

    public void reduce()
    {
        int n1;
        int n2;
        int gcm;

        // Ignore sign.
        n1 = Math.abs(numer);
        if(n1 == 0) n2 = 0;
        else n2 = denom;

        gcm = 1;


        while (n1 != n2 && n1 != 0)
        {
            if (n1 > n2) n1 -= n2;
            else n2 -= n1;
            gcm = n1; 
        }

        //restore sign
        numer /= gcm;
        denom /= gcm;
     }

    public String toMixed() throws Exception
    {
        Fraction fMod;
        int divided;
        int remainder;
        
        if (numer == denom) return "1";
        if (numer == -denom) return "-1";
        if (numer == 0) return "0";
        
        divided = numer / denom;
        remainder = Math.abs(numer % denom);
        
        // Make new Fraction with remainder
        fMod = new Fraction(remainder, denom);        
        fMod.reduce();
        
        
        if (divided == 0 ^ remainder == 0)
        {
            if (divided == 0) return fMod.toString();
            if (remainder == 0) return String.valueOf(divided);
        }
        return String.valueOf(divided) + " " + fMod.toString();
    }
}