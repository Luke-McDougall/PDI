/* *
 * Luke McDougall
 * A command line program that prompts the user for
 * a date and prints a message based on the input date.
 * Last Updated 31/03/2020
 */
import java.util.*;

public class SplitMyDate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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
    }
}
