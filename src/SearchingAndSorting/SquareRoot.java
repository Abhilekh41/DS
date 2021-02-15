package SearchingAndSorting;

public class SquareRoot
{
    public static void main(String args[])
    {
        int value = 49;

        System.out.println(sqrt(value));
    }

    private static int sqrt(int value)
    {
        int half = value/2;
        int number = 1;
        while(number<=half)
        {
            if(number*number==value)
            {
                return number;
            }
            number++;
        }
        return -1;
    }
}
