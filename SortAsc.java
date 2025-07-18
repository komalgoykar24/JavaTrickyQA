import java.util.*;
public class SortAsc
{
    public static void main(String[] args)
    {
		Scanner s1=new Scanner(System.in);

        //Initialize array
        int  arr [] = new int [50] ;
        int temp = 0;
        System.out.println("Enter the no of elements");
        int n=s1.nextInt();

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 1; i < n; i++)
        {
            System.out.print(i+ " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}