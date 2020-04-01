/* *
 * Luke McDougall, 17179492
 * Simple command line based menu program.
 * Last Updated 31/03/2020
 */
import java.util.*;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menu_choice;
        System.out.println("What would you like to do?\n" +
                           "    > 1. Sum of two integers.\n" +
                           "    > 2. Convert Temperature.\n" +
                           "    > 3. Convert a characters case.\n" +
                           "    > 4. Print the ascii value of a character.\n" +
                           "    > 5. Check if two integers are divisible.\n" +
                           "    > 6. Split a Date into it's components.\n" +
                           "    > 0. Exit.");
        menu_choice = input.nextInt();

        switch(menu_choice)
        {
            case 0: break;
            case 1:
            {
                int a, b, sum;
                
                System.out.print("Enter the first integer: ");
                a = input.nextInt();

                System.out.print("Enter the second integer: ");
                b = input.nextInt();

                sum = a + b;

                System.out.println("The sum of " + a + " and " + b + " is " + sum);
            } break;

            case 2:
            {
                double celsius, fahrenheit;
                char choice;

                System.out.println("What temperature scale are you working with?");
                System.out.println("    > (C)elsius");
                System.out.println("    > (F)ahrenheit");

                // input.nextLine().charAt(0) will throw a StringIndexOutOfBounds exception
                // if I don't have the following code. I have no idea why
                input.nextLine(); 

                choice = input.nextLine().charAt(0);

                if(choice == 'c' || choice == 'C')
                {
                    System.out.print("Enter the celsius value: ");
                    celsius = input.nextDouble();
                    fahrenheit = (9.0 / 5.0) * celsius + 32.0;
                    System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");
                }
                else if(choice == 'f' || choice == 'F')
                {
                    System.out.print("Enter the fahrenheit value: ");
                    fahrenheit = input.nextDouble();
                    celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
                    System.out.println(fahrenheit + " degrees Fahrenheit = " + celsius + " degrees Celsius");
                }
            } break;

            case 3:
            {
                char character;
                int ascii;
                
                System.out.print("Enter a character: ");

                // input.nextLine().charAt(0) will throw a StringIndexOutOfBounds exception
                // if I don't have the following code. I have no idea why
                input.nextLine(); 

                character = input.nextLine().charAt(0);

                ascii = (int) character;

                if(ascii >= 'a' && ascii <= 'z')
                {
                    ascii -= 32;
                }
                else if(ascii >= 'A' && ascii <= 'Z')
                {
                    ascii += 32;
                }
                System.out.println("The new character is " + (char) ascii);
            } break;

            case 4:
            {
                char character;
                int ascii;
                
                System.out.print("Enter a character: ");

                // input.nextLine().charAt(0) will throw a StringIndexOutOfBounds exception
                // if I don't have the following code. I have no idea why
                input.nextLine(); 
                
                character = input.nextLine().charAt(0);

                ascii = (int) character;
                System.out.println("The ascii value of " + character + " is " + ascii);
            } break;

            case 5:
            {
                int a, b;
                
                System.out.print("Enter the first integer: ");
                a = input.nextInt();

                System.out.print("Enter the second integer: ");
                b = input.nextInt();

                if(a % b == 0)
                {
                    System.out.println(a + " is divisible by " + b);
                }
                else
                {
                    System.out.println(a + " is not divisible by " + b);
                }
            } break;

            case 6:
            {

                int date, year, month, day;
                String[] months = {"January", "February", "March", "April", "May", "June",
                                   "July", "August", "September", "October", "November", "December"};
                int[] num_days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                System.out.println("Please enter the date in the format DDMMYYYY");
                date = input.nextInt();
                year = date % 10000;
                month = (date / 10000) % 100;
                day = (date / 1000000);

                // Add extra day to February if it is a leap year
                if(year % 4 == 0)
                {
                    num_days_in_month[1]++;
                }

                if(month <= 12 && day <= num_days_in_month[month - 1])
                {
                    String suffix;
                    switch(day % 10) // Get last digit of day to determine suffix
                    {
                        case 1:
                        {
                            suffix = "st";
                        } break;

                        case 2:
                        {
                            // twelf[th] is an exception to the usual seco[nd] suffix
                            if(day == 12)
                            {
                                suffix = "th";
                            }
                            else
                            {
                                suffix = "nd";
                            }
                        } break;

                        case 3:
                        {
                            suffix = "rd";
                        } break;

                        default:
                        {
                            suffix = "th";
                        }
                    }

                    System.out.print("The day is the " + day + suffix + " of " + months[month - 1] + ", in " + year + ".");

                    if(month == 2 && day == 29) // 29th of February only occurs in a leap year
                    {
                        System.out.print(" It's a leapyear!");
                    }
                    System.out.print("\n");
                }
                else
                {
                    System.out.println("Invalid date.");
                }
            } break;
        }
    }
}
