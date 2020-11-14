package amortization;

import java.util.Arrays;



public class Header extends WindowMaker {
    private static String loanDay;
    private static String loanMonth;
    private static String loanYear;
    private static String loanAmount;
    private static String loanApr;

    public static String heading() {

        append("First Community Redevelopment Corperation \n");
        append("101 1st Street\n");
        append("Bloomingville, TN 41663 \n");
        
        getUserInfo();
        return "";
    }
    
    public static String getUserInfo() {
        InputFile bill = new InputFile("bill.txt");
        String[] billsInfo = readingHandler(bill);
        int addressCounter = 10;

        String firstAndLast = billsInfo[0] + " " + billsInfo[1];
        append("\t\t\t " + firstAndLast + "\n");
        String address = "";

        for (int i = 3; i < addressCounter; i++) address = address + billsInfo[i] + " ";
        append("\t\t\t" + address);

        loanAmount = billsInfo[12];
        loanAmount = removeWhiteSpace(loanAmount);
        double amount = Double.parseDouble(loanAmount);

        append("\n");
        append("LOAN AMOUNT: " + loanAmount + "\n");
        loanApr = billsInfo[13];
        loanApr = removeWhiteSpace(loanApr);
        double apr = Double.parseDouble(loanApr);
        double aprPercent = apr * 100;
        append("INTEREST " + aprPercent + "%");

        return "";
    }
}
