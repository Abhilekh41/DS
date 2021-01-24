package Sorting;

//comparing elements to the next element
//and comparing the swaped element to the it's all previous elements
//order of complexity n square
public class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr = {8,7,6,5,4,3,2,1};
        for(int i =1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }

        for(int k = 0; k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
