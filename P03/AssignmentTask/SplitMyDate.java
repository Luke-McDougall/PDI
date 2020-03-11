import java.util.*;

public class SplitMyDate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int date, year, month, day;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] num_days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter the date in the format DDMMYYYY");
        date = input.nextInt();
        year = date % 10000;
        month = (date / 10000) % 100;
        day = (date / 1000000);

        if(month <= 12 && day <= num_days_in_month[month - 1])
        {
            String suffix;
            switch(day % 10)
            {
                case 1:
                {
                    suffix = "st";
                } break;

                case 2:
                {
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
                }

                default:
                {
                    suffix = "th";
                }
            }
            
            System.out.println("The day is the " + day + suffix + " of " + months[month - 1] + ", in " + year + ".");
        }
        else
        {
            System.out.println("Invalid date.");
        }
    }
}
