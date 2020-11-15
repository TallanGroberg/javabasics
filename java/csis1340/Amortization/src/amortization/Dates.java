package amortization;

public class Dates
{

    public static String isMonth(int month) 
    {
        
        String sMonth;
        switch (month) 
        {
            case 0:
                sMonth = "january";
                break; 
            case 2:
                sMonth = "feb";
                break; 
            case 3:
                sMonth = "march";
                break; 
            case 4:
                sMonth = "april";
                break; 
            case 5:
                sMonth = "may";
                break; 
            case 6:
                sMonth = "june";
                break; 
            case 7:
                sMonth = "july";
                break; 
            case 8:
                sMonth = "aug";
                break; 
            case 9:
                sMonth = "sep";
                break; 
            case 10:
                sMonth = "oct";
                break; 
            case 11:
                sMonth = "nov";
                break; 
            case 12:
                sMonth = "dec";
                break; 
            
            
            default:
            sMonth = "jan";
                break;
        }
        return sMonth;
    }
}

