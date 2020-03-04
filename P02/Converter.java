import java.util.*;

public class Converter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int celsius;
        double fahrenheit;

        System.out.print("Please enter the temperature in Celsius: ");
        celsius = input.nextInt();
        fahrenheit = (9.0 / 5.0) * (double) celsius + 32.0;

        System.out.printf("%d degrees Celsius = %.2f degrees Fahrenheit\n", celsius, fahrenheit);
    }
}
