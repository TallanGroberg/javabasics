package amortization;

import java.text.DecimalFormat;

public class Mary extends Table {
    
    private static String loanAmount;
  private static String loanApr;
  static double interest;
  static double apr;
  static double amount;
  static int paymentNumber;
  private static double payment;
  static InputFile mary = new InputFile("mary.txt");
  static String[] maryInfo = readingHandler(mary);

  static String sMonth = removeWhiteSpace(maryInfo[maryInfo.length - 1]);
  static int month = (int) Double.parseDouble(sMonth);

  static String sYear = removeWhiteSpace(maryInfo[maryInfo.length - 4]);
  static int year = (int) Double.parseDouble(sYear);

  static double principal;

  public static String mary() {
    loanAmount = maryInfo[maryInfo.length -3];
    loanAmount = removeWhiteSpace(loanAmount);
    amount = Double.parseDouble(loanAmount);
    
    loanApr = maryInfo[maryInfo.length -2];
    
    loanApr = removeWhiteSpace(loanApr);
    apr = Double.parseDouble(loanApr);
    System.out.println(apr);
    double aprPercent = apr * 100;
    append("\n");

    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(2);
    double accumulatedInterest = 0;
    double total = amount;

    paymentNumber = 1;
    append(
      "payment#" +
      "\tdue date " +
      "\tpayment " +
      "\tinterest" +
      "\tpricipal" +
      "\tbalance" +
      "\n"
    );





    while (amount >= 75) 
    {
      if (month >= 12) 
      {
        month = 0;
        year++;
      }
      payment = 75;
      interest = apr * amount / 12;
      principal = payment - interest;
      amount = interest + amount;
      amount -= payment;

      if (amount <= 75) 
      {
        payment = payment - amount;
      }

      month++;
      sMonth = isMonth(month);
      append(
        paymentNumber +
        "\t" +
        sMonth +
        year +
        "\t" +
        df.format(payment) +
        "\t" +
        df.format(interest) +
        "\t" +
        df.format(principal) +
        "\t" +
        df.format(amount) +
        "\n"
      );
      paymentNumber++;
      accumulatedInterest = interest + accumulatedInterest;
    }

    append(
      "total: " +
      df.format(accumulatedInterest + total) +
      " \tAccumulated Interest: " +
      df.format(accumulatedInterest)
    );



    return "";
  }

 
}
