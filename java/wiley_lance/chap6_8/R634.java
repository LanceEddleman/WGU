import java.util.ArrayList;
/**
 * R6.34 	Create the following functions
 * a.  	sameEsameO: Test that two array lists contain the same elements in the same order.
 * b.  	** copyList: Copy one array list to another.
 * c.  	** fill0s: Fill an array list with zeroes, overwriting all elements in it.
 * d.  	** removeAll: Remove all elements from an array list.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R634
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class R634
     */
    public R634()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * copyList: Copy one array list to another.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void copyList()
    {
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0; i<10;i++)
        {
            names.add("bob " + i);
            System.out.print(names.get(i) + " | ");
        }
        System.out.println();
        while (x<names.size())
        {
            System.out.println(names.get(x));
            x++;
        }
        System.out.println();
        ArrayList<String> names2 = new ArrayList<String>();
        for(int i=0; i<names.size();i++)
        {
            names2.add(i,names.get(i));
            System.out.println(names.get(i) + " | " + names2.get(i));
        }
    }

    /**
     * fill0s: Fill an array list with zeroes, overwriting all elements in it.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fill0s()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i<10;i++)
        {
            numbers.add(i);
            System.out.print(numbers.get(i) + " | ");
        }
        System.out.println();
        while (x<numbers.size())
        {
            System.out.println(numbers.get(x));
            x++;
        }
        System.out.println();
        x = 0;
        while (x<numbers.size())
        {
            numbers.set(x, 0);
            System.out.print(numbers.get(x) + " | ");
            x++;
        }
    }

    /**
     * removeAll: Remove all elements from an array list.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void removeAll()
    {
        ArrayList<Integer> cleanR = new ArrayList<Integer>();
        for(int i=0; i<10;i++)
        {
            cleanR.add(i);
            System.out.print(cleanR.get(i) + " | ");
        }
        System.out.println();
        while (x<cleanR.size())
        {
            System.out.println(cleanR.get(x));
            x++;
        }
        System.out.println();
        x = cleanR.size()-1;
        while (x >= 0)
        {
            cleanR.remove(x);
            System.out.print(cleanR.size() + " | ");
            x--;
        }
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
