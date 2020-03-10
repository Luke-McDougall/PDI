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

        System.out.print("Please enter the temperature in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.printf("%.2f degrees Celsius = %.2f degrees Fahrenheit\n", celsius, fahrenheit);
    }
}
