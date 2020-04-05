import java.util.*;
public class TimesTable
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cols, rows;
        cols = rows = 0;
        String errorMessage = "";

        do
        {
            System.out.print(errorMessage);

            System.out.print("Enter the number of rows: ");
            rows = input.nextInt();

            System.out.print("Enter the number of columns: ");
            cols = input.nextInt();

            errorMessage = "Rows and columns must be greater than zero.\n";
        } while(rows < 1 || cols < 1);

        int[][] table = new int[rows][cols];

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= cols; j++)
            {
                table[i - 1][j - 1] = i * j;
            }
        }

        System.out.println("The " + rows + " x " + cols + " times tables.");

        // Print top labels
        System.out.print("  | ");
        for(int i = 1; i <= cols; i++)
        {
            System.out.printf("%-4d", i);
        }
        System.out.print("\n");

        // Print separator
        for(int _i = 0; _i < cols + 1; _i++)
        {
            System.out.print("----");
        }
        System.out.print("\n");

        int row = 1;
        for(int[] arr : table)
        {
            System.out.printf("%-2d| ", row++);
            for(int e : arr)
            {
                System.out.printf("%-4d", e);
            }
            System.out.print("\n");
        }
    }
}
