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
        char character = ascii_string.charAt(0);
        int ascii_value = (int) character;

        // Lower case letters are offset by 32 from upper case letters in ascii table.
        // So an uppercase value will become a lowercase value by adding 32 to it and
        // a lowercase value becomes an uppercase value by taking 32 from it.
        if(ascii_value >= (int) 'a' && ascii_value <= (int) 'z')
        {
            char uppercase = (char) (ascii_value - 32);
            System.out.printf("The ascii value of '%c' is: %d\nThe uppercase value of '%c' is: '%c'\n",
                              character, ascii_value, character, uppercase);
        }
        else if(ascii_value >= (int) 'A' && ascii_value <= (int) 'Z')
        {
            char lowercase = (char) (ascii_value + 32); 
            System.out.printf("The ascii value of '%c' is: %d\nThe lowercase value of '%c' is: '%c'\n",
                              character, ascii_value, character, lowercase);
        }
        else
        {
            System.out.println("Invalid input please enter a lowercase or uppercase character ");
        }
    }
}
