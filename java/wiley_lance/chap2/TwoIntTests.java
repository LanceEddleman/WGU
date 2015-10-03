/**
 * Write a description of class TwoIntTests here.
 * 
 * Write a program that prompts the user for two integers and then prints
 *      The sum
 *      The difference
 *      The product
 *      The average
 *      The distance (absolute value of the difference)
 *      The maximum (the larger of the two)
 *      The minimum (the smaller of the two)
 *   Hint: The max and min functions are declared in the Math class.
 *      
 *   Notes: 
 *      product is multiplication.
 *      sum is addition
 *      difference is subtraction
 *      quotient is division
 * 
 * @author (Ozz) 
 * @version (09/30/15)
 */
public class TwoIntTests
{
    // instance variables - replace the example below with your own
    private int one;
    private int two;

    /**
     * Constructor for objects of class TwoIntTests
     */
    public TwoIntTests()
    {
        // initialise instance variables
        one = 0;
        two = 0;
    }

    public void main(String[] args)
    {
        sysClear();
    }
    
    
    /**
     * gather ints and then do various thing to them
     * 
     * @param  one  first int
     * @param  two  second int
     * no return at this time // @return     the sum of x and y 
     */
    public void twoInts(int one, int two)
    {
        sysClear();
        System.out.println("Sum: " + (one + two));
            int dif = 0;
            if (one > two) {
                dif = (one - two);
            }
            else {
                dif = (two - one);
            };
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + (one*two));
        System.out.println("Average: " + (one+two)/2);
        System.out.println("Absolute: " + dif);
            int max = 0;
            if (one > two) {
                max = one;
            }
            else {
                max = two;
            };
        System.out.println("Max number: " + Math.max(one, two));
        System.out.println("Min number: " + Math.min(one, two));


        
    }

    public void sysClear()
    {
        System.out.print('\u000C');
    }
}