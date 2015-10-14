import java.util.Random;
import java.util.Arrays;
/**
 * P6.15    
 * Write a program that produces ten random permutations of the numbers 1 to 10. 
 * To generate a random permutation, you need to fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents. You could do it by brute force, by generating random values until you have a value that is not yet in the array. 
   * But that is inefficient. Instead, follow this algorithm.
 * Make a second array and fill it with the numbers 1 to 10.
 * Repeat 10 times
 * Pick a random element from the second array.
 * Remove it and append it to the permutation array.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SixThreep615
{
    // instance variables - replace the example below with your own
    private static int arrayLength;

    /**
     * Constructor for objects of class SixThreep615
     */
    public SixThreep615()
    {
        // initialise instance variables
        arrayLength = 5;
    }

    public static void arrayRemoveItem()
    {
        SixThreep615 Length = new SixThreep615();
        System.out.printf("Create %s item array, initialiaze with random numbers\n",arrayLength);
        int[] baseNumbers = new int[SixThreep615.arrayLength];
        for(int i=0;i<arrayLength;i++)
        {
            Random rand = new Random();  
            int pickedNumber = rand.nextInt(10);
            baseNumbers[i] = pickedNumber;
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }
        
        int position = 2;
        int size = baseNumbers.length;
        
        System.out.println("Index item to remove is: " + position + " holding value: " + baseNumbers[position]);
        System.out.println("Current array length is: " + size);
        System.out.println("index: " + position + " | number: " + baseNumbers[position]);
        
        for (int i = position+1; i < size; i++)
        {
            baseNumbers[i-1] = baseNumbers[i];
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }
        size--;
        System.out.println("Current array length is: " + size);
        for(int i=0;i<size;i++)
        {
            System.out.println("index: " + i + " | number: " + baseNumbers[i]);
        }
    }
}
