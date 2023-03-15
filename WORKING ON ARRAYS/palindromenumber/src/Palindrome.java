
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {

        {
            //Take input from the user
            //Create instance of the Scanner class
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the figure: ");
            String reverse = "";
            String figure = input.nextLine();
            int length = figure.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + figure.charAt(i);
            if (figure.equals(reverse))
                System.out.println("The figure " +figure +" is a palindrome.");
            else
                System.out.println("The figure " +figure+"  isn't a palindrome.");
        }
    }



}


