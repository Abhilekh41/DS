package Practice;

public class SortArrayWithZerosOnesAndTwos
{
    public static void main(String args[])
    {
        int[] arr = {1,2,0,1,2,0,2,2,0,1};
        int twos = 0;
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
               zeros++;
            }
            else if(arr[i]==2)
            {
                twos++;
            }
        }
        ones = arr.length- (zeros+twos);
        int[] arr1 = new int[arr.length];
        for (int i = 0; i<arr.length;i++)
        {
            if(zeros>0)
            {
                arr[i]=0;
                zeros--;
            }
            else if(ones>0)
            {
                arr[i]=1;
                ones--;
            }
            else
            {
                arr[i]=2;
                twos--;
            }
        }

        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
