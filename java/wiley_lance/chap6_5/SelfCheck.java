import java.util.Arrays;
/**
 * Write a description of class SelfCheck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelfCheck
{
    // instance variables - replace the example below with your own
    private int x;
    private int odd;
    private int even;

    /**
     * Constructor for objects of class SelfCheck
     */
    public SelfCheck()
    {
        // initialise instance variables
        x = 0;
        odd = 0;
        even = 0;

    }
    
    /**
     * Create an algorithm to print the count of positive and negative values in a given array.
     * 
    **/
    public static void N26()
    {
        SelfCheck n26 = new SelfCheck();
        int[] num = new int[3];
        num[0] = 5;
        num[1] = 1;
        num[2] = 7;
        
        for(int i = 0; i < num.length; i++)
        {
            if(num[i]%2==0)
            {
                n26.even = n26.even+1;
            }
            else
            {
                n26.odd = n26.odd+1;
            }
        }
        System.out.println("Number of Even elements: " + n26.even);
        System.out.println("Number of Odd elements: " + n26.odd);
    }
    
    /**
     * Create an algorithm to to print the number of positive and negative values in a given array.
     * 
    **/
    public static void N27()
    {
        SelfCheck n27 = new SelfCheck();
        int[] num = {5,4,7,9,6,22,23,25,11,2};
        int r = 0;
        int e = 0;
        int o = 0;

        System.out.println("Total numbers: " + num.length);
        for(int i = 0; i < num.length; i++)
        {
            if(num[i]%2==0)
            {
                n27.even = n27.even+1;
                e++;
            }
            else
            {
                n27.odd = n27.odd+1;
                o++;
            }
        }
        System.out.println("Even number count: " + e);
        System.out.println("Odd number count: " + o);

        int[] eve = new int[e];
        int[] odd = new int[o];
        int ae = 0;
        int ao = 0;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i]%2==0)
            {
                eve[ae] = num[i];
                ae++;
            }
            else
            {
                odd[ao] = num[i];
                ao++;
            }
        }

        System.out.print("even numbers: ");
        for(int i = 0; i < eve.length; i++)
        {
            System.out.print(eve[i] + " ");
        }
        System.out.println();
        System.out.print("odd numbers: ");
        for(int i = 0; i < odd.length; i++)
        {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Even elements: " + n27.even);
        System.out.println("Number of Odd elements: " + n27.odd);
    }
}
