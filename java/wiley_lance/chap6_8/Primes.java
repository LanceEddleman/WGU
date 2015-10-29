import java.util.ArrayList;
/**
 * Write a description of class Primes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Primes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Primes
     */
    public Primes()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * print list if prime numbers in reverse order
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void primePrint()
    {
        // put your code here
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        
        int i = primes.size();
        while (i > 0)
        {
            System.out.println(primes.get(i-1));
            i--;
        }
    }
}
