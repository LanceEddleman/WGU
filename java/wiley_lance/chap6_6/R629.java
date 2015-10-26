import java.util.Arrays;
/**
 *  R6.29   
 *  Develop an algorithm for finding the most frequently occurring value in an array of numbers.
 *  Use a sequence of coins.
 *  Place paper clips below each coin that count how many other coins of the same value are in the sequence.
 *  Give the pseudocode for an algorithm that yields the correct answer
 *  Describe how using the coins and paper clips helped you find the algorithm.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R629
{
    // instance variables - replace the example below with your own
    private int x;
    private int[] all = {9,8,8,2,3,4,5,4,3};
    // private int[] all = {9,8,8,2,3,4,5,4,3,4,5,6,7,8,9,7,5,4,3,2,1,2,3,4,3,2,1,2,3,4};
    private int[] count = new int[all.length+1];

    /**
     * Constructor for objects of class R629
     */
    public R629()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Count instances
     */
    public void countInstances()
    {
        R629 all = new R629();
        System.out.println("Array length is: " + this.all.length);
        for(int i=0;i<this.all.length;i++)
        {
            System.out.print(this.all[i] + " | ");
            this.x = this.all[i];
            switch(x)
            {
                case 1: this.all[i] = 1;
                this.count[0] = this.count[0]+1;
                break;
                case 2: this.all[i] = 1;
                this.count[1] = this.count[1]+1;
                break;
                case 3: this.all[i] = 2;
                this.count[2] = this.count[2]+1;
                break;
                case 4: this.all[i] = 3;
                this.count[3] = this.count[3]+1;
                break;
                case 5: this.all[i] = 4;
                this.count[4] = this.count[4]+1;
                break;
                case 6: this.all[i] = 5;
                this.count[5] = this.count[5]+1;
                break;
                case 7: this.all[i] = 6;
                this.count[6] = this.count[6]+1;
                break;
                case 8: this.all[i] = 7;
                this.count[7] = this.count[7]+1;
                break;
                case 9: this.all[i] = 8;
                this.count[8] = this.count[8]+1;
                break;
                case 10: this.all[i] = 9;
                this.count[9] = this.count[9]+1;
                break;
            }
        }
        System.out.println();
        for(int b=0; b<=count.length+1; b++)
        {
            System.out.print("Count of " + b + "s = " + count[b] + " | ");
        }
        System.out.println();
        System.out.print("Expected: 1, 2, 2, 1, 2, 2, 1");
        
        
        
        
        
        
        
        
        
        /*
        for(int c = 0; c < this.count.length; c++)
        {
            System.out.print("Value: " + this.all[c+1]);
            System.out.println("has " + this.count[c+1]);
        }
        */
        System.out.println(); 
    }
}

