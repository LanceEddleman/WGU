import java.util.Random;
import java.util.Arrays;
/**
 * R6.20 	
 * Trace the algorithm for removing an element described in Section 6.3.6. 
 * Use an array values with elements 110 90 100 120 80, and remove the element at index 2.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SixThreeR620
{
    // instance variables - replace the example below with your own
    private static int arrayLength;

    /**
     * Constructor for objects of class SixThreep615
     */
    public SixThreeR620()
    {
        // initialise instance variables
        arrayLength = 5;
    }

    public static void arrayRemoveItem()
    {
        SixThreeR620 Length = new SixThreeR620();
        System.out.printf("Create %s item array, initialiaze with random numbers\n",arrayLength);
        int[] baseNumbers = new int[SixThreeR620.arrayLength];
        for(int i=0;i<arrayLength;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10);
            baseNumbers[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }

    }
}
