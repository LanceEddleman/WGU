
/**
 * Write a description of class Rev2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rev2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Rev2
     */
    public Rev2()
    {
        // initialise instance variables
        x = 0;
    }

    public static int[] reverse(int[] values)
     {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++)
        {
           result[i] = values[values.length - 1 - i];
        }
        return result;
     }
}
