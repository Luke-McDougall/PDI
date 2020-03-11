/* *
 * Luke McDougall 17179492
 * Simple program that converts a user input temperature from celsius to fahrenheit
 * Last updated 10/03/2020
 * */
import java.util.*;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        char choice;

        System.out.println("What temperature scale are you working with?");
        System.out.println("    > (C)elsius");
        System.out.println("    > (F)ahrenheit");
        choice = input.nextLine().charAt(0);

        if(choice == 'c' || choice == 'C')
        {
            celsius = input.nextDouble();
            fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");
        }
        else if(choice == 'f' || choice == 'F')
        {
            fahrenheit = input.nextDouble();
            celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
            System.out.println(fahrenheit + " degrees Fahrenheit = " + celsius + " degrees Celsius");
        }
    }
}
