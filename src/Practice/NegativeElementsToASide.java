package Practice;

public class NegativeElementsToASide
{
    public static void main(String args[])
    {
        int[] arr = {-1,-2,4,6,7,-6,-5};
        int[] arr1 = new int[arr.length];
        int k = 0;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr1[k] = arr[i];
                k++;
            }
        }
        for(int i = 0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
