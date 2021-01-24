package Sorting;


//comparing one element to it's next one
//order of n square
public class BubbleSort
{
    public static void main(String args[])
    {
        int[] arr = {8,7,6,5,4,3,2,1};
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,arr);
                }
            }
        }

        for(int k = 0; k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }

    private static void swap(int j, int[] arr)
    {
        int c = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = c;
    }
}
