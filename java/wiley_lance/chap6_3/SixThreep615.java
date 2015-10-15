import java.util.Random;
import java.util.Arrays;
/**
 * P6.15    
 * Write a program that produces ten random permutations of the numbers 1 to 10. 
 * To generate a random permutation, you need to fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents. 
 *      You could do it by brute force, by generating random values until you have a value that is not yet in the array. 
 *      But that is inefficient. Instead, follow this algorithm.
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
    private static int len;

    /**
     * Constructor for objects of class SixThreep615
     */
    public SixThreep615()
    {
        // initialise instance variables
        len = 4;
    }

    public static void arrayPermutation()
    {
        SixThreep615 len = new SixThreep615();
        System.out.printf("Create %s item array, initialiaze with random numbers\n",len);
        
        int k = 0;
        int select = 0;
        int createbase = 0;
        
        int[] baseNumbers = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayB = new int[len.len];
        int[] perm = new int[len.len];
        
        Random rand = new Random();  
        for(int i=1; i<len.len+1; i++)
        {
            System.out.println("Random set: " + i);
            for(int j=0; j<len.len;j++)
            {
                int pickedNumber = rand.nextInt(10)+1;
                baseNumbers[j] = pickedNumber;
                System.out.println("index: " + j + " | number: " + baseNumbers[j]);
            }
            System.out.println();
//            (int)(Math.random() * (max - min) + min)
            k++;
        }
        System.out.println();
        System.out.println("index: " + (k-1) + " | random: " + baseNumbers[k-1] + " | base: " + arrayB[k-1] + " | perm: " + perm[k-1]);
        /*
        for(int i = 0; i < arrayB.length; i++)
        {
            arrayB[i] = baseNumbers[rand.nextInt(10)];
            System.out.println("index: " + i + " | base: " + baseNumbers[i] + " | NewItem: " + arrayB[i]);
        }
        */
    }
}
