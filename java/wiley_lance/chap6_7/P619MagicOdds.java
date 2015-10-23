
/**
 * P6.19    
 * Implement the following algorithm to construct magic  squares; it works only if  is odd.
 * Set row = n − 1, column = n / 2.
 * For k = 1 … n * n
 * Place k at [row][column].
 * Increment row and column.
 *      If the row or column is n, replace it with 0.
 *      If the element at [row][column] has already been filled
 *          Set row and column to their previous values.
 *          Decrement row.
 * Here is the  square that you get if you follow this method:
 * 11 | 18 | 25 | 2 | 9
 * 10 | 12 | 19 | 21 | 3
 * 4 | 6 | 13 | 20 | 22
 * 23 | 5 | 7 | 14 | 16
 * 17 | 24 | 1 | 8 | 15
 * 
 * Write a program whose input is the number N and whose output is the magic square of order N if N is odd.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P619MagicOdds
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class P619MagicOdds
     */
    public P619MagicOdds()
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
