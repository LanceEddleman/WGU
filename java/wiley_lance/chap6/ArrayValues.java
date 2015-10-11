/**
 * Write code that fills an array values with each set of numbers below.
 * a - number 1-10
 * b - numbers 0-20 by 2
 * c - numbers (1,4,9,16,25,36,49,64,81, 100
 * d - 10 allwith 0
 * e - 1,4,9,16,9,7,4,9,11
 * f - 0,1,0,1,0,1,0,1,0,1
 * g - 0123401234
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayValues
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ArrayValues
     */
    public ArrayValues()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Item (a)
     */
    public void aValues()
    {
        int [] oneTen = new int[10];
        for(int i=0;i<=oneTen.length;i++)
        {
            oneTen[i] = i+1;
            System.out.println(oneTen[i]);
        }
    }
    /**
     * Item (b)
     */
    public void bValues()
    {
        int [] twoTen = new int[15];
        int j = 0;
        for(int i=0;j<21;i++)
        {
            twoTen[i] = j;
            System.out.println(twoTen[i]);
            //twoTen[i] = i;
            j = j+2;
        }
    }
    /**
     * Item (c)
     */
    public void cValues()
    {
        int [] threeTen = {1,4,9,16,25,36,49,64,81,100};
        for(int i=0;i<=threeTen.length;i++)
        {
            // threeTen[i] = i+1;
            System.out.println(threeTen[i]);
        }
    }
    /**
     * Item (d)
     */
    public void dValues()
    {
        int [] fourTen = new int[10];
        for(int i=0;i<fourTen.length;i++)
        {
            // threeTen[i] = i+1;
            System.out.println(fourTen[i]);
        }
    }
    /**
     * Item (e)
     */
    public void eValues()
    {
        int [] fiveTen = {1,4,9,16,9,7,4,9,11};
        for(int i=0;i<fiveTen.length;i++)
        {
            System.out.println(fiveTen[i]);
        }
    }
    /**
     * Item (f)
     */
    public void fValues()
    {
        int [] sixTen = new int[10];
        int j = 0;
        for(int i=0;i<sixTen.length;i++)
        {
            if(j==1)
            {
                sixTen[i] = 1;
                j = 0;
            }
            else
            {
                j = 1;
                sixTen[i] = 0;
            }
            System.out.println(sixTen[i]);
        }
    }
    /**
     * Item (g)
     */
    public void gValues()
    {
        int [] sevenTen = new int[11];
        int j = 0;
        for(int i=0;i<=sevenTen.length;i++)
        {
            if(j==5)
            {
                j = 0;
            }
            else
            {
                sevenTen[i] = j;
                System.out.println(sevenTen[i]);                
                j = j+1;
            }
        }
    }
}
