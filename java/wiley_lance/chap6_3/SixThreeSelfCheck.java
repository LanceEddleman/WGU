import java.util.Arrays;
import java.util.Random;
/**
 * Write a description of class SixThreeSelfCheck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SixThreeSelfCheck
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class SixThreeSelfCheck
     */
    public SixThreeSelfCheck()
    {
        // initialise instance variables
    }

    public static void loopZero(){
        System.out.println("Print 10 random numbers");
            int[] baseNumbers = new int[10];
            int j = 0;
            for(int i=0;i<10;i++)
            {Random rand = new Random();  
             int pickedNumber = rand.nextInt(10);
             baseNumbers[i] = pickedNumber;
             System.out.println("index: " + i + " number: " + baseNumbers[i]);}

             System.out.println();System.out.println("Print Index for Zero value items");
            int k = 0;
            for(int x=0;x<baseNumbers.length;x++) { 
                
                if (baseNumbers[x]==0) 
                { 
                    System.out.println("index: " + x + " number: " + baseNumbers[x]);
                    k=k+1;
                }
            }
            if (k<1)
            {
                System.out.println("No Zero value items found");
            }
    }
}
