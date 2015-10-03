import java.util.*;
/**
 * Write a description of class ThreeYearBlance here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeYearBlance
{
    // instance variables - replace the example below with your own
    private double initialBalance = 1000.00;
    private double interest; // = .05;  Intrest calculated by int (5 = 5%)
    private int years;
 
    public void claculate(int years, double interest)
    {
        sysClear();
        int count = 0;
        int year = 0;
        double balance = initialBalance;
        System.out.println("# of years: " + years);
        while (count < years){
            System.out.println("year: " + year);
            System.out.printf("Balance: %4.2f \n", balance);
            System.out.printf("Interest: %4.2f \n", (balance*interest)/100);
            balance = balance + ((balance * interest)/100);
            year++;
            count++;
        }
    }
    
    public void sysClear()
    {
        System.out.print('\u000C');
    }
}