import java.util.Arrays;
/**
 * R6.28    
 * create a list of 10 ints, half will be odd half will be even
 * Write an algorithm that swaps elements so taht all evens are at the begining and all odd are at the end.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R628
{
    // instance variables - replace the example below with your own
    private int x;
    private int test;
    private int[] base = {5,3,2,7,6,10,13,22,12,1};
    private int[] odd = new int[base.length/2];
    private int[] even = new int[base.length/2];

    /**
     * Constructor for objects of class R628
     */
    public R628()
    {
        // initialise instance variables
        x = 0;
        test = 0;
    }

    /**
     * create 10 element array
     */
    public void tenE()
    {
        //R628 tenE = new R628();
        System.out.println("Base array");
        for(int i=0; i<base.length;i++)
        {
            System.out.println(base[i]);
        }
    }
    /**
     * find odd and even
     */
    public void findOE()
    {
        //R628 tenE = new R628();
        System.out.println("Find odd and even");
        int e = 0;
        int o = 0;
        for(int i=0; i<base.length;i++)
        {
            if(base[i]%2==0)
            {
                System.out.println("index location even number: " + base[i]);
                even[e] = base[i];
                e++;
            }
            else
            {
                System.out.println("index location odd number: " + base[i]);
                odd[o] = base[i];
                o++;
            }
        }
        System.out.println("Even array");
        for(int i=0; i<even.length;i++)
        {
            System.out.println(even[i]);
        }
        System.out.println("Odd array");
        for(int i=0; i<odd.length;i++)
        {
            System.out.println(odd[i]);
        }
    }
}
