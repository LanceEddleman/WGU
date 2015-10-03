/**
 * Function to discern how many years it will take to depelte an account based on given variables
 * 
 * @author (Lance Eddleman)
 * @version (09/28/15)
 */
public class DepleteAccount
{
    // instance variables - replace the example below with your own
    private int accountBase = 10000; // initial amount added to account
    private double monthlyIntrest = 0.5; // equates to 6% per year
    private int monthlyWithdrawl = 500;
    private int years = 0;
    private int months = 0;

    /**
     * Constructor for objects of class DepleteAccount
     */
    public DepleteAccount()
    {
        // initialise instance variables
        years = 0;
        months = 0;

    }

    /**
     * Calculation method
     * 
     * @param  accountBase   initial amount of cash added to the account.
     * @param  monthyIntrest   monthly intrest accrual.
     * @param  monthlyWithdrawl   amount withdrawn from the account for bills.
     * @param  years   storage variable for number of years.
     * @param  months   storage variable for number of months.
     * @return  output  number of years and months to depleate the account.
     */
    public String calculate()
    {
        sysClear();
        double balance = accountBase;
        while(balance > monthlyWithdrawl)
        {
            balance = balance - monthlyWithdrawl + monthlyIntrest;
            System.out.printf("Account balance: %6.2f \t",balance);
            months++;
            System.out.println("Month: " + months);
            if(months>=12)
            {
                years++;
                System.out.println("Years: " + years);

                months = 0;
            }
            
        }
        String output = years + " Year(s) " + months + " Month(s)";
        System.out.println(output);
        return output;
    }
    /**
     * Calculation method2
     * 
     * Allow user to input the accountBase, monthlyInterest, and withdrawlAmount
     * @param  years   storage variable for number of years.
     * @param  months   storage variable for number of months.
     * @return  output  number of years and months to depleate the account.
     */
    public String calculateTerminate(int accountBase, double monthlyIntrest, int monthlyWithdrawl)
    {
        sysClear();
        System.out.printf("Initial Balance: %d at %2.2f interest, with a %d monthly draw.\n", accountBase, monthlyIntrest, monthlyWithdrawl);
        double balance = accountBase;
        while(balance > monthlyWithdrawl)
        {
            balance = (balance - monthlyWithdrawl) + monthlyIntrest;
            System.out.printf("Account balance: %6.2f \t",balance);
            months++;
            System.out.println("Month: " + months);
            if(months >= 12)
            {
                years++;
                System.out.println("Years: " + years);

                months = 0;
                if(years >= 5)
                {
                    System.out.printf("\nAfter %d years:\nYou will still have %.2f in your account.\n\n", years, balance);
                    break;
                }
            }
            
        }
        String output = years + " Year(s) " + months + " Month(s)";
        System.out.println(output);
        return output;
    }
    public void sysClear()
    {
        System.out.print('\u000C');
    }
}
