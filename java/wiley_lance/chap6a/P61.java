import java.util.Random;
/**
 * Write a program that:
 * initializes an array with ten random integers and then prints four lines of output, containing
 * Every element at an even index.
 * Every even element.
 * All elements in reverse order.
 * Only the first and last element
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P61
{
    // instance variables - replace the example below with your own
    //  current 100 lines

    /**
     * Constructor for objects of class P61
     */
    public P61()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
    }
    public static void random()
    {
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {Random rand = new Random();  
         int pickedNumber = rand.nextInt(10) + 1;
         System.out.println(pickedNumber);
         baseNumbers[i] = pickedNumber;
         System.out.println(baseNumbers[i]);
        }
    }

    public static void evenIndex()
    {
        System.out.println("Print 10 random numbers"); System.out.println();
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {Random rand = new Random();  
         int pickedNumber = rand.nextInt(10) + 1;
         System.out.println("random index " + i + ": " + pickedNumber);
         baseNumbers[i] = pickedNumber;
         System.out.println("random number : " + baseNumbers[i]);
        }
        System.out.println("Print only even index items");
        System.out.println();
        int even = 2;
        for(int i=0;i<baseNumbers.length;i++)
        {
            if (i%2==0)
            {
                System.out.println("index: " + i + " number: " + baseNumbers[i]);
            }
        }
    }

    public static void evenNumbers()
    {
        System.out.println("Starting");
        System.out.println();
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {Random rand = new Random();  
         int pickedNumber = rand.nextInt(10) + 1;
         System.out.println(pickedNumber);
         baseNumbers[i] = pickedNumber;
         System.out.println(baseNumbers[i]);
        }
        System.out.println("Evens");
        System.out.println();
        int even = 2;
        for(int i=0;i<baseNumbers.length;i++)
        {
            if (baseNumbers[i]%even==0)
            {
                System.out.println(baseNumbers[i]);
            }
        }
    }

    public static void reverse2()
    {
        System.out.println("Starting");
        System.out.println();
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {Random rand = new Random();  
         int pickedNumber = rand.nextInt(10) + 1;
         baseNumbers[i] = pickedNumber;
         System.out.println("random index " + i + ": random number : " + baseNumbers[i]);
        }
        System.out.println("reverse index");
        System.out.println();
        int end = baseNumbers.length-1;
        System.out.println(end);
        for(int i=end;i>=0;i--)
        {
            System.out.println("index: " + i + " number: " + baseNumbers[i]);
        }
    }

    public static void fNl()
    {
        System.out.println("Starting");
        System.out.println();
        int[] baseNumbers = new int[10];
        for(int i=0;i<10;i++)
        {Random rand = new Random();  
         int pickedNumber = rand.nextInt(10) + 1;
         System.out.println("random index " + i + ": " + pickedNumber);
         baseNumbers[i] = pickedNumber;
         System.out.println("random number : " + baseNumbers[i]);
        }
        System.out.println("fNl index");
        System.out.println();

        System.out.println("index: " + 1 + " number: " + baseNumbers[0]);
        System.out.println("index: " + baseNumbers.length + " number: " + baseNumbers[baseNumbers.length-1]);

    }

    public static void allRequest(){
        System.out.println("Print 10 random numbers");
            int[] baseNumbers = new int[10];
            for(int i=0;i<10;i++)
            {Random rand = new Random();  
             int pickedNumber = rand.nextInt(10) + 1;
             baseNumbers[i] = pickedNumber;
             System.out.println(" number: " + baseNumbers[i]);}
        System.out.println();System.out.println("Print only even index items");
            int even = 2;
            for(int i=0;i<baseNumbers.length;i++) { if (i%2==0) { System.out.println("index: " + i + " number: " + baseNumbers[i]); } }
        System.out.println();System.out.println("Print only Even numbers");
            int x1 = 2;
            for(int i=0;i<baseNumbers.length;i++) { if (baseNumbers[i]%x1==0) { System.out.println(baseNumbers[i]);}  }
        System.out.println();System.out.println("Print index in reverse");
            int end = baseNumbers.length-1;
            for(int i=end;i>=0;i--) { System.out.println("index: " + i + " number: " + baseNumbers[i]);}
        System.out.println();System.out.println("Print first and last numbers only");
            System.out.println("index: " + 1 + " number: " + baseNumbers[0]);
            System.out.println("index: " + baseNumbers.length + " number: " + baseNumbers[baseNumbers.length-1]);
    }
}
