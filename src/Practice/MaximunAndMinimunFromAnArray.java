package Practice;

public class MaximunAndMinimunFromAnArray
{
    public static void main(String args[])
    {
        int[] arr = {1000, 11, 445, 1, 330};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++ )
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
