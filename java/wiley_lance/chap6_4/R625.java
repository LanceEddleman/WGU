
/**
 * R6.25 	
What is wrong with the following method that aims to fill an array with random numbers?
public static void fillWithRandomNumbers(double[] values)
{
   double[] numbers = new double[values.length];
   for (int i = 0; i < numbers.length; i++) 
   { 
      numbers[i] = Math.random(); 
   }
   values = numbers;
}
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R625
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class R625
     */
    public R625()
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
    
        public static void fillWithRandomNumbers(double[] values)
    {
       double[] numbers = new double[values.length];
       for (int i = 0; i < numbers.length; i++) 
       { 
          numbers[i] = Math.random(); 
       }
       values = numbers;
       for(int i=0;i<numbers.length;i++)
       {
           System.out.println(numbers[i]);
        }
    }
}
