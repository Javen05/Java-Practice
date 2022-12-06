package sg.edu.tp.myapplication;

import java.util.Scanner;


public class GA_2
{
    public static void main(String[] args)
    {
        //word counter
        //By: Javen

        //Scan for value
        Scanner sc = new Scanner(System.in);

        //start
        System.out.print("Enter lower limit: ");
        int a = sc.nextInt();

        //end
        System.out.print("Enter upper limit: ");
        int b = sc.nextInt();


        System.out.print("Counting: ");

        //word counter
        for (int index = a; index < b; index = index + 1)
        {
            System.out.print(index + " ");
        }
        //upper limit
        System.out.print(b);
        //clear line
        System.out.println();
    }
}
