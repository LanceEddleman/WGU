
/**
 * 
 * You want to decide whether you should drive your car to work or take the train. 
 * You know the one-way distance from your home to your place of work
 * , and the fuel efficiency of your car (in miles per gallon). 
 * You also know the one-way price of a train ticket. 
 * You assume the cost of gas at $4 per gallon, 
 * and car maintenance at 5 cents per mile. 
 * Write an algorithm to decide which commute is cheaper.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Commute
{
    // instance variables - replace the example below with your own
    private int wDistance; // 15 miles to work one direction
    private double tTicket = 24.00; // price of a one way ticket to work for train
    private int mpg = 3; // miles per gallon for your car
    private double costGasGallon = 4.00; // cost per gallon of gas
    private double carMaint = .05; // cost of maintiance on your car per mile


    /**
     * Constructor for objects of class Commute
     * decide which is cheaper to use your car or the train
     */
    public Commute()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod(int wDistance)
    {
        sysClear();
        double car = ((costGasGallon/mpg)*wDistance) + (wDistance*carMaint);
        System.out.println("Gas per mile " + (costGasGallon/mpg));
        System.out.println("Assumed gas per mile is 1.33 --------------------");
        System.out.println("Maint per mile " + carMaint);
        System.out.println("Total miles is " + wDistance);
                System.out.println();
        System.out.println("Assumed gas cost " + (costGasGallon/mpg) * wDistance);
        System.out.println("Assumed maint cost " + carMaint * wDistance);
        System.out.println("Assumed total " + ((costGasGallon/mpg) * wDistance) + (carMaint * wDistance));
                System.out.println();
                System.out.println("car * distance: " + car*wDistance);
        
        if (tTicket < car)
        {
            System.out.println("Total miles is " + wDistance);
            System.out.println("Train cost is " + tTicket);
            System.out.println("Car cost is " + car);
            System.out.println("You should take the train");
        }
        else
        {
            System.out.println("Total miles is " + wDistance);
            System.out.println("Train ticket is " + tTicket);
            System.out.println("Taking your car cost " + car);
            System.out.println("You should take your car");
        }
    }


    public void sysClear()
    {
        System.out.print('\u000C');
    }
}
