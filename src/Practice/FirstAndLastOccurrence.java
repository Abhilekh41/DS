package Practice;

import java.util.Scanner;

public class FirstAndLastOccurrence
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.valueOf(scanner.nextLine());
        while(testCase>0)
        {
            String[] value = scanner.nextLine().split(" ");
            Integer checkValue = Integer.valueOf(value[1]);
            String[] arr = scanner.nextLine().split( " ");
            int firstValue = 0;
            int lastValue = 0;
            for(int i =0; i<arr.length;i++)
            {
                if(Integer.valueOf(arr[i])==checkValue)
                {
                    if(firstValue==0)
                    {
                        firstValue=i;
                    }
                    else
                    {
                        lastValue = i;
                    }
                    if(firstValue!=0 && lastValue==0)
                    {
                        lastValue = firstValue;
                    }
                }
            }
            if(firstValue!=0 && lastValue!=0)
            {
                System.out.println(firstValue+" "+lastValue);
            }
            else
            {
                System.out.println(-1);
            }
            testCase--;
        }
    }
}
