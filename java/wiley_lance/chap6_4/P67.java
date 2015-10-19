/**
 * Write a method that reverses the sequence of elements in an array. For example, if you call the method with the array
 * 1 4 9 1 6 9 7 4 9 11
 * then the array is changed to
 * 11 9 4 7 9 1 6 9 4 1
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P67
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class P67
     */
    public P67()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main()
    {
        int[] base = {1, 4, 9, 1, 6, 9, 7, 4, 9, 11};
    
        System.out.println("Base Length = " + base.length);
        System.out.println("Base: 1, 4, 9, 1, 6, 9, 7, 4, 9, 11");
        System.out.print("Output: ");
        
        for(int i = base.length-1; i >= 0; i--)
        {
            System.out.print(base[i] + ", ");
        }
        System.out.println();
        System.out.println("Expected: 11, 9, 4, 7, 9, 1, 6, 9, 4, 1");
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
