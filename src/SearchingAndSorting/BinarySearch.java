package SearchingAndSorting;

public class BinarySearch
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,0,arr.length-1,1));
    }

    public static int binarySearch(int[] arr,int startIndex, int endIndex, int element)
    {
        if(endIndex>=startIndex)
        {
            int mid = (startIndex+endIndex-1)/2;

            if(arr[mid]==element)
            {
                return mid;
            }
            if(mid>element)
            {
                return binarySearch(arr,startIndex,mid-1,element);
            }
            else
            {
                return binarySearch(arr,mid+1,endIndex,element);
            }
        }
        return -1;
    }
}
