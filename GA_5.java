package sg.edu.tp.myapplication;

import java.util.Scanner;

public class GA_5
{
    //method to calculate sum
    public static int computeResult (int one, int two, int three)
    {
        //conditions check for 3 inputs, i, given: 10 <= i <= 100
        if((10 <= one)&&(one <= 100)&&(10 <= two)&&(two <= 100)&&(10 <= three)&&(three <= 100))
        {
            //calculate
            int product = one * two * three;
            return product;
        }

        //print comment, terminate program: unsuccessful, return nothing (to complete method)
        else
        {
            System.out.println("Not in range.");
            break;
        }
    }

    //main
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //collect 3 inputs
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();

        //print product of all 3 input, i, if 10 <= i <=100
        System.out.println("The product is " + computeResult(firstNumber, secondNumber, thirdNumber));
    }
}
