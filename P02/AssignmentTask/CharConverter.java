/* *
 * Luke McDougall
 * 17179492
 * Program that shows the ascii value of a user input character
 * Last updated 04/03/2020
 * */

import java.io.*;

public class CharConverter
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("Please enter an upper case character: ");

        int ascii = System.in.read();
        char uppercase = (char) ascii;

        // Lower case letters are offset by 32 from upper case letters in ascii table.
        char lowercase = (char) (ascii + 32); 

        System.out.printf("The ascii value of '%c' is: %d\nThe lowercase value of '%c' is: '%c'\n",
                          uppercase, ascii, uppercase, lowercase);
    }
}
