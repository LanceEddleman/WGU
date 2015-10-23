
/**
 * P6.6     
 * Compute the alternating sum of all elements in an array starting with index1 (0 based). 
 * For example, if your program reads the input:
 *  1 4 9 16 9 7 4 9 11
 *  then it computes:
 *  1-4+9-16+9-7+4-9+11= -2
 * 
 * Pass in 3 differnt arrays, return 3 different SUMs
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P66
{
    // instance variables - replace the example below with your own
    private static int x;
    private static int[] one = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    private static int[] two = {11, 4, 19, 21, 16, 9, 7, 6, 6, 3};
    private static int[] three = {0, 14, 7, 2, 4, 0, 3, 8, 3, 13};

    /**
     * Constructor for objects of class P66
     */
    public P66()
    {
        // initialise instance variables
    }

    public static void main(String[] args)
    {
        P66 boo = new P66();
        int[] base = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        
        //int[] test = one;
        //int[] test = two;
        int[] test = three;
        //int[] test = base;
        
        int x = test[0];
        
        System.out.print("X result: ");
        for(int i = 1; i < test.length; i++)
        {
            if(i%2==0)
            {
                x = x + test[i];
                System.out.print(x + " ");
            }
            else
            {
                x = x - test[i];
                System.out.print(x + " ");
            }
        }
        System.out.println();
        if(test == base)
        {
            System.out.println("expected: -3 6 -10 -1 -8 -4 -13 -2");
        }
        else if(test == one)
        {
            System.out.println("expected: -3 6 -10 -1 -8 -4 -13 -2");
        }
        else if(test == two)
        {
            System.out.println("16");
        }
        else if(test == three)
        {
            System.out.println("-20");
        }
        else
        {
            System.out.println("something bad happened");
        }
    }

}
