
/**
 * Write a description of class TestDelete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDelete
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestDelete
     */
    public TestDelete()
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
        short a = 5;
        int b = 2;
        double c = 1.0;
        double d = 5.0;
        //int value = 33.333/3;
        
        int x = 10;
        int y = 3;
        int w = x/y;
        //System.out.println(1/0);
        // System.out.println(value);
        
        System.out.println(w);
        System.out.println(a/b/c);
        System.out.println(a/c/b);
        System.out.println(d/b);
        System.out.println(a/b);

        String fh = "won";
        String sh = "derful";
        String FAS = fh+sh;
        String ws = "wonderful";
        boolean same = (FAS == ws);
        
        System.out.println(same);

        boolean u=true;
        boolean p=(u &&!u)&&u;
        System.out.println(same);
    }
}
