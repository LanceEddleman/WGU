import java.util.Random;
import java.util.Arrays;

/**
 * R6.7
 * Write for loops for the following tasks.
 * a.   Printing all elements of an array in a single row, separated by spaces.
 * b.   Computing the product of all elements in an array.
 * c.   Counting how many elements in an array are negative.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomNumbers
{
    // instance variables - replace the example below with your own
    public static void randomNumbers()
    {
        System.out.println("Create 10 item array, initialiaze with random numbers");
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10)+1;
            baseNumbers[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }

        for(int i = 0; i < baseNumbers.length; i++)
        {
            System.out.print(baseNumbers[i]+" ");
        }
        System.out.println();
        
        double product = baseNumbers[0];
            for(int i = 1; i < baseNumbers.length; i++)
        {
            product = product * baseNumbers[i];
            System.out.println(baseNumbers[i]*baseNumbers[i-1]);
            
        }
        System.out.print(product);
        System.out.println();
        System.out.println("Count number of odd items in list");
        int count = 0;
        for(int i = 0; i < baseNumbers.length; i++)
        {
            int test = baseNumbers[i];
            if(test%2!=0)
            {
                count++;
                System.out.println("index: " + i + " | number: " + baseNumbers[i]);
            }
        }
        System.out.println();
        System.out.println("Count number of odd items in list: " + count);
    }
}
