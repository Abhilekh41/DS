package Practice;

public class NegativeNumbersToOneSide
{
    public static void main(String args[])
    {
        int[] arr = {2,3,4,6,-3,-2,-2,1,9,-5};
        int[] arrNegative = new int[arr.length];
        int[] arrPositive = new int[arr.length];
        int negativeCounter = 0;
        int positiveCounter = 0;
        for(int  i=0 ; i <arr.length;i++)
        {
            if(arr[i]<0)
            {
                arrNegative[negativeCounter] = arr[i];
                negativeCounter++;
            }
            else
            {
                arrPositive[positiveCounter] = arr[i];
                positiveCounter++;
            }
        }
        for(int  i=0 ; i <arrNegative.length;i++)
        {
            if (arrNegative[i] < 0)
            {
                arr[i]= arrNegative[i];
            }
        }
        for(int  i= 0; i <arr.length;i++)
        {
            if (arrPositive[i] > 0)
            {
                arr[negativeCounter]= arrPositive[i];
                negativeCounter++;
            }
        }

        for(int  i= 0; i <arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
