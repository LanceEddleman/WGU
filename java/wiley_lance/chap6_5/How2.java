import java.util.Arrays;
/**
 * In many data processing situations, you need to process a sequence of values.
 * This How To walks you through the steps for storing input values in an array and carrying out computations with the array elements.
 * Consider again the problem from Section 6.5: 
 * A final quiz score is computed by adding all the scores, except for the lowest one. 
 * For example, if the scores are:
 *      8 7 8.5 9.5 7 5 10
 *      Then the final score is 50.
 *      
 *      1. find the lowest number
 *      2. report the index location, report number found
 *      3. sum all numbers
 *      4. minus the low number
 *      5. return the final sum
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How2
{
    // instance variables - replace the example below with your own
    private int x;
    private double low;
    private double sum;
    private final double expected = 50;
    //double[] scores = {8, 7, 8.5, 9.5, 7, 5, 10}; // 50
    //double[] scores = {8, 7, 7, 9}; // 24
    double[] scores = {8}; // 0

    /**
     * Constructor for objects of class How2
     * hidden elements to use in all locations
     */
    public How2()
    {
        // initialise instance variables
        x = 0;
        low = 0;
        sum = 0;
    }

    public void main(String[] args)
    {
        findLow();
        endScore();
    }
    
    /**
     * Find Low
     */
    public void findLow()
    {
        // next line allows acccess to hidden base variables
        How2 H = new How2();
        this.low = scores[0];
        for(int i=1; i<scores.length;i++)
        {
            if(scores[i]<low)
            {
                this.low = scores[i];
                x = i;
            }
        }
        System.out.println("Lowest number found at Scores index: " + x +  " Lowest number is: " + this.low);
    }
    
    /**
     * Create End Score
     */
    public void endScore()
    {
        // next line allows acccess to hidden base variables
        How2 H = new How2();
        double e = 0;
        for(int i=0; i<scores.length;i++)
        {
            this.sum = this.sum + scores[i];
        }
        this.sum = this.sum-this.low;
        System.out.println("Expected (Final Score): " + expected);
        System.out.println("Final score is: " + this.sum);
    }
}
