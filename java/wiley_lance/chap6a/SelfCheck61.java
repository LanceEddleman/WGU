
/**
 * Write a description of class SelfCheck61 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelfCheck61
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SelfCheck61
     */
    public SelfCheck61()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args)
    {
        int[] primes = { 2, 3, 5, 7, 11 };
        for (int i=0;i<primes.length;i++)
        {
            System.out.println(primes[i]);
        }
        /*
        System.out.println();
        System.out.println("step 2");
        for (int i = 0; i < primes.length; i++)
        {
            primes[4 - i] = primes[i];
            int bob = primes[i];
            System.out.println(primes[i]);
        }
        */
        System.out.println();
        System.out.println("step 3");
        for (int i = 0; i < 5; i++)
        {
            primes[i]++;
            System.out.println(primes[i]);
        }
        System.out.println();
        System.out.println("step 4");
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i;
            System.out.println(values[i]);
        }
        System.out.println();
        System.out.println("step 5");
        String[] words = new String[10];
        for (int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
        System.out.println();
        System.out.println("step 6");
        String[] wordSix = {"Yes", "No"};
        for (int i = 0; i < wordSix.length; i++)
        {
            System.out.println(wordSix[i]);
        }
    }
}
