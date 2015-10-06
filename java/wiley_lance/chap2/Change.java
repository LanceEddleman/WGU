import java.util.Scanner;
import java.io.*;
import java.util.concurrent.TimeUnit;
/**
 *  
 *  Giving change.
 *  Implement a program that directs a cashier how to give change.
 *  The program has two inputs: the amount due and the amount received from the customer.
 *  Display the dollars, quarters, dimes, nickels, and pennies that the customer should receive in return.
 *  In order to avoid roundoff errors, the program user should supply both amounts in pennies.
 *      example 274 instead of 2.74.
 * 
 * @author (Ozz)
 * @version (09/30/15)
 */
public class Change
{
    // instance variables - replace the example below with your own
    private int x;
    private int userSelection;
    private int errorCount;

    /**
     * Constructor for objects of class Change
     */
    public Change()
    {
        // initialise instance variables
        x = 0;
        userSelection = 0;
        errorCount = 0;
    }

    public static void main(String[] args)
    {
        Change change = new Change();
        change.sysClear();
        change.selection();
    }
    
    /**
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int giveChange(int y)
    {
        // put your code here
        return x + y;
    }

        public void selection()
    {
        items();
        selectItem();
        testSelection();
    }
        public void errorSelection()
    {
        items();
        errorSelectItem();
        testSelection();
    }

    public void selectItem()
    {
        System.out.printf("Enter the number of the item you want to purchase\n");
        Scanner userInput = new Scanner(System.in); //construct scanner
        while(!userInput.hasNextInt()){
            if (errorCount >= 2)
            {
                errorCount = 0;
                sysClear();
                selection();

            }
            errorCount++;
            System.out.println("Input was not a number");
            System.out.println("Please make another selection");
            userInput.next(); // input invalid, try again
        }
        int userSelection = userInput.nextInt();
        userInput.close(); //close scanner
        this.userSelection = userSelection;
        // return userSelection;
    }

        public void errorSelectItem()
    {
        System.out.printf("Enter the number of the item you want to purchase\n");
        Scanner userInput = new Scanner(System.in); //construct scanner
        while(!userInput.hasNextInt()){
            if (errorCount >= 2)
            {
                errorCount = 0;
                sysClear();
                System.out.println("Input was not a valid item");
                System.out.println("Please make another selection");                
                errorSelection();

            }
            errorCount++;
            System.out.println("Input was not a number");
            System.out.println("Please make another selection");
            userInput.next(); // input invalid, try again
        }
        int userSelection = userInput.nextInt();
        userInput.close(); //close scanner
        this.userSelection = userSelection;
        // return userSelection;
    }

    public void testSelection()
    {
        // selectItem();
        // userSelection = 4;
        if (userSelection == 1 || userSelection == 2 || userSelection == 3)
        {
            switch (userSelection) {
              case 1:
                    System.out.println("User Selected: Eggs");
                    break;
              case 2: 
                    System.out.println("User Selected: Bread");
                    break;
              case 3:
                    System.out.println("User Selected: Cheese");
                    break;
              default:
                    break;
            }
        }
        else
        {
            sysClear();
            errorSelectItem();
            selection();
        }
        // next step for number of items to purchase
    }
    
    public void items()
    {
        String name = "Name";
        String price = "Price";
        System.out.printf("\t %-10s | %10s\n", name, price);
        System.out.printf("____________________|____________________\n");
        System.out.printf("1\t %-10s | %10.2f\n", "Eggs", 3.49);
        System.out.printf("2\t %-10s | %10.2f\n", "Bread", 1.99);
        System.out.printf("3\t %-10s | %10.2f\n", "Cheese", 7.37);
        System.out.println();
    }

    
    public void sysClear()
    {
        System.out.print('\u000C');
    }
}

