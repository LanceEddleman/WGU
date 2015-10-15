import java.util.Random;
import java.util.Arrays;
/**
 * R6.8     Rewrite the following loops without using the enhanced for loop construct. Here, values is an array of floating-point numbers.
 * a.   for (double x : values) { total = total + x; }
 * b.   for (double x : values) { if (x = = target) { return true; } }
 * c.   int i = 0; for (double x : values) { values[i] = 2 * x; i++; }
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WriteArraysR68
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WriteArraysR68
     */
    public WriteArraysR68()
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
    
    public static void aTotal()
    {
        // for (double x : values) { total = total + x; }
        // base set
        System.out.println("Create 10 item array, initialiaze with random numbers");
        int[] values = new int[10];
        for(int i=0;i<10;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10)+1;
            values[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + values[i]);
        }
        double total = 0;
        int i = 0;
        for(double x = 0;x<values.length;x++)
        {
            total = total+ values[(int)x]+x;
            System.out.println((int)x + " | " + values[i] + " | " + total);
            i++;
        }
    }
    
    public static boolean bTarget()
    {
        System.out.println("Create 10 item array, initialiaze with random numbers");
        int[] values = new int[10];
        for(int i=0;i<10;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10)+1;
            values[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + values[i]);
        }
        
        int i = 0;
        int count = 0;
        int targetHit = 5;
        boolean target = false; 
        // for (double x : values) { if (x = = target) { return true; } }

        for(double x = 0;x<values.length;x++)
        {
            System.out.println((int)x + " | " + values[i]);
            if (values[i]==targetHit)
            {
                count++;
                target = true;
                if (count > 0 || target == true)
                {
                    System.out.println("Target was hit at index (" + i + ").");
                    return true;    
                }
                else
                {
                    System.out.println("Target was not hit");
                    return false;
                }
            }
            i++;

        }
        return true;
    }
    
    public static void cCalc()
    {
        //int i = 0; for (double x : values) { values[i] = 2 * x; i++; }
        int[] values = new int[5];
        int i = 0;
        for (double x = 0; x < values.length; x++)
        {
            values[i] = 2 * (int)x;
            System.out.println((int)x + " | " + values[i]);
            i++;
        }
    }
    
    
    
    
    
    
}
