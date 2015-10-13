
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
    private int x;

    /**
     * Constructor for objects of class SixThreep615
     */
    public SixThreep615()
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
}
