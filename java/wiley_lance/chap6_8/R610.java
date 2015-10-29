import java.util.ArrayList;
/**
 * Write a description of class R610 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R610
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class R610
     */
    public R610()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod()
    {
        // put your code here
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(0, 0);
        values.add(1);
        values.add(2);
        for (int i = 1; i <= values.size()-1; i++)
        {
           values.set(i - 1, i * i);
           System.out.println(values.get(i));
        }

        /*
        ArrayList<Integer> values2;
        for (int i = 1; i <= 10; i++)
        {
           values2.add(i * i); 
        }
        */
    }
}
