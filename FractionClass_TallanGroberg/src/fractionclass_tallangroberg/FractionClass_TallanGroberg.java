/*

Tallan Groberg


package fractionclass_tallangroberg;

/**
 *
 * @author tallan
 */
import java.util.Scanner;

public class FractionClass_TallanGroberg
{

    public static void main(final String[] args) throws Exception {

        Fraction[] fs;
        Scanner input;
        String toString;
        String reduce;
        String toMixed;
        String getDecimal;

        fs = new Fraction[] { new Fraction(380, -68), new Fraction(0, 3), new Fraction(-126, -999999992),
                new Fraction(-7, 1), new Fraction(256, -8), new Fraction(1000, 10)
                // , new Fraction(5,0)
                , new Fraction() };

        input = new Scanner(System.in);
        for (final var f : fs)
        {
            toString = reduce = toMixed = getDecimal = "          ";
            
            // User chooses methods to test. Output of selected test, when applicable, displayed
            // next to menu option.
            while (true)
            {
                System.out.printf( "\n \n"
                                + "press 1 to test toString() %-35s    \n"
                                + "press 2 to test reduce() %-35s      \n"
                                + "press 3 to test toMixed() %-35s     \n"
                                + "press 4 to test getDecimal() %-35s  \n"
                                + "press 5 to test the next fraction \n"
                                + "press 6 to quit \n"

                                + "Select a method to test or skip to the next Fraction:   \n"
                                , toString, reduce, toMixed, getDecimal
                );

                switch (input.nextInt())
                {
                    case 1:
                        toString = "---  " + f.toString();
                        continue;
                    case 2:
                        reduce = "-----    " + "done";
                        f.reduce();
                        continue;
                    case 3:
                        toMixed = "----  " + f.toMixed();
                        continue;
                    case 4:
                        getDecimal = "-  " + String.format("%.7f", f.getDecimal());
                        continue;
                    case 6:
                        input.close();
                        System.out.println(" ");
                        System.out.println("bye");
                        System.out.println(" ");
                        System.exit(0);
                    default:
                        break;
                }
                break;
            }
        }
        input.close();
        System.exit(0);
    } 
}