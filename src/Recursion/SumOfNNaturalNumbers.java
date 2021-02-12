package Recursion;

public class SumOfNNaturalNumbers
{
    public static void main(String args[])
    {
        int value = 9;
        System.out.println(sumOfNaturalNumbers(value));
    }

    private static int sumOfNaturalNumbers(int value)
    {
        if(value>0)
        {
            return value+sumOfNaturalNumbers(value-1);
        }
        return 0;
    }


}
