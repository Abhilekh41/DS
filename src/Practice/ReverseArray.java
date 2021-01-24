package Practice;

public class ReverseArray
{
    public static void main(String args[])
    {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = new int[arr1.length];
        for(int i = arr1.length-1; i>=0; i--)
        {
            arr2[arr1.length-(i+1)]= arr1[i];
        }
    }
}
