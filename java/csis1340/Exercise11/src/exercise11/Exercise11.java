
package exercise11;
/**
 *
 * @author Tallan Groberg
 */
public class Exercise11 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Keyboard input = new Keyboard();
        System.out.println("a number greater than 0");

        int n = input.readInt();
        int counter = 1;
        System.out.println("your number is: " + n);
        while((n + 1) > counter) 
        {
            System.out.println(counter);
            counter++;
        }
    }
}
