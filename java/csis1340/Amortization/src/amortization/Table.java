package amortization;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import sun.util.calendar.LocalGregorianCalendar.Date;

//get a date format form the file. 
public class Table extends Header {

    private static String loanAmount;
    private static String loanApr;
    static double interest;
     static double apr;
     static double amount;
     static int paymentNumber;
    private static double payment;
    static InputFile bill = new InputFile("bill.txt");
    static String[] billsInfo = readingHandler(bill);
    
    static String sMonth = removeWhiteSpace(billsInfo[billsInfo.length - 1]);
    static int month = (int) Double.parseDouble(sMonth);
    
    static String sYear = removeWhiteSpace(billsInfo[billsInfo.length - 4]);
    static int year = (int) Double.parseDouble(sYear);

    static double principal;

    protected static String table() {




        loanAmount = billsInfo[12];
        loanAmount = removeWhiteSpace(loanAmount);
        amount = Double.parseDouble(loanAmount);

        loanApr = billsInfo[13];
        loanApr = removeWhiteSpace(loanApr);
        apr = Double.parseDouble(loanApr);
        double aprPercent = apr * 100;
        append("\n");

        return "";
    }

    public static double calculatePayments() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double accumulatedInterest = 0;
        double total = amount;

        
       
        String sMonth;

        paymentNumber = 1;
        append( "payment#" + "\tdue date " + "\tpayment " + "\tinterest" + "\tpricipal" + "\tbalance" +  "\n");
        while(amount >= 75) {
            if(month >= 12 ) {
                month = 1;
                year++;
            }
            payment = 75;
            interest = apr * amount /12;
            principal = payment - interest;
            amount = interest + amount;
            amount -= payment;
            

            if(amount <= 75 ) {
                payment =  payment - amount;
            }

            month++;
            sMonth = isMonth(month);
            append(paymentNumber + "\t" + sMonth + year + "\t" +  df.format(payment) + "\t" +
           df.format(interest) + "\t" + df.format(principal) + "\t" + df.format(amount) + "\n");
            paymentNumber++;
            accumulatedInterest = interest + accumulatedInterest;
        }

        append("total: " + df.format(accumulatedInterest + total) + " \tAccumulated Interest: " + df.format(accumulatedInterest));
        return 0.0;
    }
}
