import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public void search(int[] arr, int key)
    {
        int l =0;
        int r = arr.length - 1;
        boolean found = false;

        while(l <= r)
        {
            int m = l + (r-l)/2;
            if(arr[m] == key)
            {
                System.out.println("Key found at index: " + m);
                found= true;
                break;
            }
            else if(arr[m]< key)
            {
                l = m+1;
            }
            else if(arr[m] > key)
            {
                r = m-1;
            }
        }

        if(found == false)
        {
            System.out.println("Key is not present");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Binary Search");
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements");

        int[] arr = new int[n];

        for(int i =0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the key to search: ");
        int key = scan.nextInt();

        Arrays.sort(arr);
        BinarySearch obj = new BinarySearch();

        obj.search(arr, key);
    }
}
