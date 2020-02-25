import java.util.*;

public class Calculator
{
    public static void print(String str)
    {
        System.out.print(str);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num_one, num_two, answer;

        print("Please enter the first number: ");
        num_one = sc.nextInt();

        print("Please enter the second number: ");
        num_two = sc.nextInt();

        answer = num_one + num_two;

        print("The answer is: " + num_one + " + " + num_two + " = " + answer + "\n");
    }
}
