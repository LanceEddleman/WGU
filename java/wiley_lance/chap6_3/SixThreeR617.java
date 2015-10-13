import java.util.Random;
import java.util.Arrays;
/**
 * R6.17
 * Trace the flow of the loop in Section 6.3.4 with the given example. 
 * Show two columns, one with the value of i and one with the output.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SixThreeR617
{
    public static void arrayLoop()
    {
        System.out.println("Create 10 item array, initialiaze with random numbers");
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10);
            baseNumbers[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }

    }
}
