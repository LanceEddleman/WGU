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
    private String userSelected;
    private int userQuanity;
    private int quanityAvailable;
    private int errorCount;
    private double eggs = 3.49; // = 349 pennies
    private double bread = 1.99; // = 199 pennies
    private double cheese = 7.37; // = 737 pennies
    private int userCoins;
    private final int dollar = 100;
    private final int quarter = 25;
    private final int dimes = 10;
    private final int nickle = 5;
    private int pennies;

    /**
     * Constructor for objects of class Change
     */
    public Change()
    {
        // initialise instance variables
        x = 0;
        userSelection = 0;
        userSelected = "";
        userQuanity = 0;
        quanityAvailable = 100;
        errorCount = 0;
        userCoins = 0;
        pennies = 0;
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
        System.out.printf("Enter the ID of the item you want to purchase.\n");
        selectItem();
    }

    public void selectItem()
    {
        Scanner userInput = new Scanner(System.in); //construct scanner
        while(!userInput.hasNextInt()){
            sysClear();
            items();
            notNumber();
            userInput.next(); // input invalid, try again
        }
        int userSelection = userInput.nextInt();
        userInput.close(); //close scanner
        this.userSelection = userSelection;
        
        testSelection();
        // return userSelection;
    }

    public void testSelection()
    {
        if (userSelection == 1 || userSelection == 2 || userSelection == 3)
        {
            switch (userSelection) {
              case 1:
                    sysClear();
                    System.out.println("User Selected: Eggs");
                    this.userSelected = "Eggs";
                    quanity();
                    break;
              case 2: 
                    sysClear();
                    System.out.println("User Selected: Bread");
                    this.userSelected = "Bread";
                    quanity();
                    break;
              case 3:
                    sysClear();
                    System.out.println("User Selected: Cheese");
                    this.userSelected = "Cheese";
                    quanity();
                    break;
              default:
                    break;
            }
        }
        else
        {
            sysClear();
            items();
            notValidNumber();
            selectItem();
        }
        // next step for number of items to purchase
    }
    
    public void quanity()
    {
        items();
        // userChoice();

        System.out.printf("Enter the quanity of \"%s\" you want to purchase.\n", this.userSelected);
        selectQuanity();
    }

    public void selectQuanity()
    {
        Scanner userInput = new Scanner(System.in); //construct scanner
        while(!userInput.hasNextInt()){
            sysClear();
            items();
            notNumber();
            userInput.next(); // input invalid, try again
        }
        int userQuanity = userInput.nextInt();
        userInput.close(); //close scanner
        this.userQuanity = userQuanity;
        
        testQuanity();
        // return userSelection;
    }

    public void testQuanity()
    {
        if (userQuanity > 100)
        {
            System.out.println("We do not have that much stock on hand");
            System.out.printf("Please select less then %d.0\n",quanityAvailable);
            quanity();
        }
        else
        {
            sysClear();
            items();
            System.out.println();
            
            selectedItem();
            initialPrice();
        }
        // next step for number of items to purchase
    }

    public void userChoice()
    {
        System.out.printf("Purchse Item: %s\n", userSelection);
    }

    public void notNumberError()
    {
        System.out.println("Input was not a number");
        System.out.println("Please make another selection");
    }
    public void notValidNumberError()
    {
        System.out.println("Input was not a valid option");
        System.out.println("Please make another selection");
    }

    public void notNumber()
    {
        notNumberError();
    }
        public void notValidNumber()
    {
        notValidNumberError();
    }

    public void selectedItem()
    {
        System.out.printf("You are purchasing: %d, %s\n\n",this.userQuanity, this.userSelected);
    }
    public void initialPrice()
    {
        double cost = 0;
        int pennies = 0;
        double pbase = 0;
        double premainder = 0;
        if (userSelected == "Eggs" || userSelected == "Bread" || userSelected == "Cheese")
            {
                switch (userSelected) {
                  case "Eggs":
                        cost = this.userQuanity * eggs;
                        break;
                  case "Bread": 
                        cost = this.userQuanity * bread;
                        break;
                  case "Cheese":
                        cost = this.userQuanity * cheese;
                        break;
                  default:
                        break;
                }
            }
        // System.out.println("The price will be: " + (double) this.userSelected * this.userQuanity);
        System.out.println("Total cost is: " + cost);

        System.out.println("We only accept pennies");
        System.out.println();
        
        premainder = (cost*100) % 100;
        System.out.println("base pennies: " + premainder);
        pbase = (int)cost*100;
        System.out.println("base: " + pbase);
        
        pennies = (int)pbase+(int)premainder;
        this.pennies = pennies;
        
        System.out.printf("Total cost is: %d pennies\n\n", pennies);
        customerPrompt();
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

    public void customerPrompt()
    {
        System.out.println("Please input your nuber of pennies");
        customerCoins();
    }
    
    public void customerCoins()
    {
        Scanner userInput = new Scanner(System.in); //construct scanner
        while(!userInput.hasNextInt()){
            sysClear();
            customerPrompt();
            notNumber();
            userInput.next(); // input invalid, try again
        }
        int userCoins = userInput.nextInt();
        userInput.close(); //close scanner
        this.userCoins = userCoins;
        
        displayCustomerCoins();
        // return userSelection;
    }

    public void displayCustomerCoins()
    {
        int highLow = userCoins - pennies;
        if (userCoins > pennies)
        {
            System.out.printf("You gave me: %d\n", userCoins);
        }
        else
        {
            System.out.println("Please input a higher amount of pennies");
            customerCoins();
        }
    }
 
    public void sysClear()
    {
        System.out.print('\u000C');
    }
}