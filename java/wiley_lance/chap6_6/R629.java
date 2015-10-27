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
    //private int[] all = {9,8,8,2,3}; // expected: 1,1,2,1
    // private int[] all = {9,8,8,2,3,4,5,4,3}; // expected: 1,2,2,1,2,1
     private int[] all = {9,8,8,2,3,4,5,4,3,4,5,6,7,8,9,7,5,4,3,2,1,2,3,4,3,0,2,1,2,3,4,4,4,2,2,7,8,9,8,7}; // expected: 2,5,6,6,3,1,2,3,2
    private int[] count = new int[10];
    private int x;
    private int a = all.length;
    private int c = count.length;
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
            System.out.print("x = " + x + ", ");
            switch(x)
            {
                case 0: this.all[i] = 1;
                this.count[0] = this.count[0]+1;
                System.out.println("index: 0 = " + this.count[0]);
                break;
                case 1: this.all[i] = 1;
                this.count[1] = this.count[1]+1;
                System.out.println("index: 1 = " + this.count[1]);
                break;
                case 2: this.all[i] = 2;
                this.count[2] = this.count[2]+1;
                System.out.println("index: 2 = " + this.count[2]);
                break;
                case 3: this.all[i] = 3;
                this.count[3] = this.count[3]+1;
                System.out.println("index: 3 = " + this.count[3]);
                break;
                case 4: this.all[i] = 4;
                this.count[4] = this.count[4]+1;
                System.out.println("index: 4 = " + this.count[4]);
                break;
                case 5: this.all[i] = 5;
                this.count[5] = this.count[5]+1;
                System.out.println("index: 5 = " + this.count[5]);
                break;
                case 6: this.all[i] = 6;
                this.count[6] = this.count[6]+1;
                System.out.println("index: 6 = " + this.count[6]);
                break;
                case 7: this.all[i] = 7;
                this.count[7] = this.count[7]+1;
                System.out.println("index: 7 = " + this.count[7]);
                break;
                case 8: this.all[i] = 8;
                this.count[8] = this.count[8]+1;
                System.out.println("index: 8 = " + this.count[8]);
                break;
                case 9: this.all[i] = 9;
                this.count[9] = this.count[9]+1;
                System.out.println("index: 9 = " + this.count[9]);
                break;
            }
        }
        System.out.println();
        for(int v=0; v < c; v++)
        {
            System.out.println("Count of " + v + "s = " + count[v]);
        }
        System.out.println();
        System.out.print("Result:   ");
        for(int b=0; b<c; b++)
        {
            if(count[b] == 0)
            {
                //noda
            }
            else
            {
                System.out.print(count[b] + ", ");
            }
        }
        System.out.println();
        // System.out.print("Expected: 1, 2, 2, 1, 2, 2, 1");
        // System.out.print("Expected: 1, 1, 2, 1");
        //System.out.print("Expected: 1, 2, 2, 1, 2, 1");
        System.out.print("Expected: 2, 5, 6, 6, 3, 1, 2, 3, 2");
        int high = count[0];
        int num = 0;
        int g = 0;
        for(g=0;g<count.length;g++)
        {
            if(count[g]<high)
            {
                high = high;
            }
            else
            {
                high = count[g];
                num = g;
            }
        }
        System.out.println(); 
        System.out.println("Most often selected number is: " + high + " found in: " + num);
    }
}

