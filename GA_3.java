package sg.edu.tp.myapplication;

public class GA_3
{
    public static void main(String[] args)
    {
        //array
        int integer[] = {12,77,92,55,24,65,41,13,76,90};

        //check thru all values in array
        for (int index = 0; index < integer.length; index++)

        //filter values >= 77
        if(integer[index] >= 77)
        {
            //print values >= 77
            System.out.println(integer[index] + " ");
        }
    }
}
