import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size = -1;

        String prompt, out;
        out = prompt = "Enter the length of the array [0,20]";

        do
        {
            System.out.print(out);
            size = input.nextInt();
            out = "Length must be between 0 and 20 inclusive.\n" + prompt;
        } while(size < 0 || size > 20);

        int[] array = new int[size];

        Random r = new Random();
        for(int i = 0; i < size; i++)
        {
            array[i] = 1 + r.nextInt(15); // min = 1 + 0 = 1, max = 1 + 14 = 15
        }

        int query = -1;
        prompt = out = "Enter search query: ";

        do
        {
            System.out.print(out);
            query = input.nextInt();
            out = "Query must be greater than zero\n" + prompt;
        } while(query < 0);

        int index = 0;
        boolean found = false;

        for(int e : array)
        {
            System.out.print(e + " ");
        }
        System.out.print("\n");

        while(index < size && !found)
        {
            if(array[index] == query)
            {
                found = true;
            }
            else
            {
                index++;
            }
        }

        if(found)
        {
            System.out.println("Found: " + index);
        }
        else
        {
            System.out.println("Not found: " + query);
        }
    }
}
