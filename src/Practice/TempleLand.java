package Practice;

import java.util.Scanner;

public class TempleLand
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.valueOf(scanner.nextLine());
        while(testCase>0)
        {
            int length = Integer.valueOf(scanner.nextLine());
            String[] values = scanner.nextLine().split(" ");
            String test = "yes";
            if(Integer.valueOf(values[0]) ==1 && Integer.valueOf(values[values.length-1]) ==1 && values.length%2>0)
            {
               int i = 0;
               int j = values.length-1;
               while(i!=values.length/2 && j!= values.length/2)
               {
                   if(Integer.valueOf(values[i])==Integer.valueOf(values[j]))
                   {
                       int diff = 1;
                       if(Integer.valueOf(values[i+1])-Integer.valueOf(values[i])==1 && Integer.valueOf(values[j-1])-Integer.valueOf(values[j])==1 )
                       {
                           i++;
                           j--;
                           continue;
                       }
                       else
                       {
                           test= "no";
                           break;
                       }
                   }
                   else
                   {
                       test = "no";
                       break;
                   }
               }
            }
            else
            {
                test = "no";
            }
            System.out.println(test);
            testCase--;
        }
    }
}
