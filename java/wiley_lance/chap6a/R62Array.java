/**
* ▪▪ R6.2   
Consider the following array:
int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
What is the value of total after the following loops complete?
a.      
int total = 0;
for (int i = 0; i < 10; i++) { total = total + a[i]; }
b.      
int total = 0;
for (int i = 0; i < 10; i = i + 2) { total = total + a[i]; }
c.      
int total = 0;
for (int i = 1; i < 10; i = i + 2) { total = total + a[i]; }
d.      
int total = 0;
for (int i = 2; i <= 10; i++) { total = total + a[i]; }
e.      
int total = 0;
for (int i = 1; i < 10; i = 2 * i) { total = total + a[i]; }
f.      
int total = 0;
for (int i = 9; i >= 0; i--) { total = total + a[i]; }
g.      
int total = 0;
for (int i = 9; i >= 0; i = i - 2) { total = total + a[i]; }
h.      
int total = 0;
for (int i = 0; i < 10; i++) { total = a[i] - total; }
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R62Array
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class R62Array
     */
    public R62Array()
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
    public static void main(String[] args)
    {
        //int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        // int total = 0;
        //for (int i = 0; i < 10; i++) {total = total + a[i]; System.out.println(total);}
        //for (int i = 0; i < 10; i = i + 2) { total = total + a[i]; System.out.println(total);}

        //for (int i = 1; i < 10; i = i + 2) { total = total + a[i]; System.out.println(total);}

        //for (int i = 2; i <= 10; i++) { total = total + a[i]; System.out.println(total);}
        
        //for (int i = 1; i < 10; i = 2 * i) { total = total + a[i]; System.out.println(total);}
        
        //for (int i = 9; i >= 0; i--) { total = total + a[i]; System.out.println(total);}
        
        //for (int i = 9; i >= 0; i = i - 2) { total = total + a[i]; System.out.println(total);}
        
        //for (int i = 0; i < 10; i++) { total = a[i] - total; System.out.println(total);}
        
        
    }
}
