package sg.edu.tp.myapplication;

import java.util.Scanner;

public class GA_1
{
    public static void main(String[] args)
    {
        //Largest Value Finder
        //By: Javen

        //Scan for value
        Scanner sc = new Scanner(System.in);

        //input 1
        System.out.print("First number: ");
        int a = sc.nextInt();

        //input 2
        System.out.print("Second number: ");
        int b = sc.nextInt();

        //input 3
        System.out.print("Third number: ");
        int c = sc.nextInt();

        //compare a and b, to find largest
        if(a >= b)
        //when a >= c:
        {
            //print a if a >= c
            if (a >= c) { System.out.println("The largest number: " + a); }

            //print c if c > a
            else { System.out.println("The largest number: " + c); }
        }

        //b > a
        else
        //hence:
        {
            //print b if b >= c
            if(b >= c){ System.out.println("The largest number: " + b); }

            //print c if c > b
            else{ System.out.println("The largest number: " + c); }
        }
    }
}
