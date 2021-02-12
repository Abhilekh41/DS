package Practice;

import java.util.Scanner;

public class Sweets
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.valueOf(scanner.nextLine());
        while(testCase>0)
        {
            String[] values = scanner.nextLine().split(" ");
            int sweetValue = Integer.valueOf(values[1]);
            String[] currency = scanner.nextLine().split(" ");
            int totalMoney = 0;
            int min = Integer.valueOf(currency[0]);
            for(int i = 0; i<currency.length;i++)
            {
                totalMoney = totalMoney+Integer.valueOf(currency[i]);
                if(Integer.valueOf(currency[i])<min)
                {
                    min =Integer.valueOf(currency[i]);
                }
            }
            int noOfSweets = totalMoney/sweetValue;
            int remainingMoney = totalMoney%sweetValue;

            if(remainingMoney>=min)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(noOfSweets);
            }
            testCase--;
        }
    }
}
