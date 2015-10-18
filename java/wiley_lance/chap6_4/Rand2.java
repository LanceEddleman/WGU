import java.util.Random;
/**
 * Write a description of class Rand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rand2
{
    // instance variables - replace the example below with your own
    public static int[] mystery(int length, int n)
     {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) 
        { 
           result[i] = (int) (n * Math.random()); 
        }
        return result;
     }
}
