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

    /**
     * Constructor for objects of class SixThreep615
     */
    public SixThreep615()
    {
        // initialise instance variables
    }

    public static void arrayPermutation()
    {
        SixThreep615 len = new SixThreep615();
        System.out.println("Create an item array, randomly place each number into a new array");
        int[] base = {1,2,3,4,5,6,7,8,9,10};
        int[] baseNumbers = {1,2,3,4,5,6,7,8,9,10};
        int size = baseNumbers.length;
        int[] perm = new int[10];
        int pos = 0;

        for(int i = 0; i<baseNumbers.length;i++)
        {
            System.out.println("Index: " + i + " | Number: " + baseNumbers[i]);
        }
        for(int i = 0; i < baseNumbers.length; i++)
        {
            Random rand = new Random();
            int picked = rand.nextInt(size); System.out.println("pos picked: " + picked);
            System.out.println("baseNumbers: " + picked + " value of: " + baseNumbers[picked]);
            perm[i] = baseNumbers[picked]; System.out.println("Perm index: " + i + " | Number: " + perm[i]);
            pos = picked;
            System.out.println("baseNumbers index " + pos + " to be removed");

            for(int b = pos; b < baseNumbers.length ;b++)
            {
                if(pos == baseNumbers.length)
                {
                    System.out.println("last item no change needed");
                }
                else
                {
                    for(int u = pos; u < baseNumbers.length-1; u++)
                    {
                        System.out.println("baseNumbers[pos] " + u + " was value: " + baseNumbers[u]);
                        baseNumbers[u] = baseNumbers[u+1];
                        System.out.println("baseNumbers[pos] " + u + " now: " + baseNumbers[u]);
                    }
                    size = size - 1;
                    break;
                }
            }
            System.out.println("new length: " + size);
            System.out.println("index of perm: " + i + " | number: " + perm[i]);
            System.out.println("base");
            for(int x = 0; x<size;x++)
            {
                System.out.println(x + " | " + baseNumbers[x]);
            }
            System.out.println();
        }
        System.out.println("Base Array");
        for(int l=0;l<perm.length;l++)
        {
            System.out.println(l + " | " + base[l]);
        }
        System.out.println();
        System.out.println("New random Array");
        for(int l=0;l<perm.length;l++)
        {
            System.out.println(l + " | " + perm[l]);
        }
    }
}