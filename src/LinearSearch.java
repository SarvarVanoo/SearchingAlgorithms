public class LinearSearch {

    public static void search(int[] arr, int key)
    {
        boolean found = false;
        for(int i=0; i<arr.length; i++)
        {
            if(key == arr[i]) {
                found = true;
                System.out.println("The key is found at index: " + i);
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {20, 10, 36, 100, 78, 98, 356, 2, 51};
        int key = 99;

        LinearSearch obj = new LinearSearch();

        obj.search(arr, key);
    }
}
