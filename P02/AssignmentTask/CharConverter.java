/* *
 * Luke McDougall
 * 17179492
 * Program that shows the ascii value of a user input character
 * Last updated 04/03/2020
 * */

import java.util.*;

public class CharConverter
{
    public static void main(String[] args)
    {
        System.out.print("Please enter an upper case character: ");
        Scanner in = new Scanner(System.in);

        String ascii_string = in.nextLine();
        if(ascii_string.length() > 0)
        {
            char uppercase = ascii_string.charAt(0);
            int ascii_value = (int) uppercase;

            // Lower case letters are offset by 32 from upper case letters in ascii table.
            char lowercase = (char) (ascii_value + 32); 

            System.out.printf("The ascii value of '%c' is: %d\nThe lowercase value of '%c' is: '%c'\n",
                              uppercase, ascii_value, uppercase, lowercase);
        }
        else
        {
            System.out.println("Invalid input: Empty String");
        }
    }
}
