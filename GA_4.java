package sg.edu.tp.myapplication;
import java.util.Scanner;

public class GA_4
{
    //method to calculate total cost of iphones
    public static int calculateCost (int amountOfiPhones)
    {
        //$1500 per iPhone
        int priceOfiPhone = 1500;
        //iPhone cost x amount (input)
        int totalCost = priceOfiPhone * amountOfiPhones;
        return totalCost;
    }

    //main
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //collect input: amount of iPhones
        System.out.print("Enter the number of iPhone: ");
        int amount = sc.nextInt();

        System.out.println("The Total Cost of iPhones is $" + calculateCost(amount));
    }
}
