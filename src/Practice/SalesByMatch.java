package Practice;

public class SalesByMatch
{
    public static void main(String args[])
    {
        int[] ar = {1,2,1,2,1,3,2};
        int pairs = 0;
        for(int i = 0;i< ar.length; i++)
        {
            if(ar[i]!=0)
            {
                int count = 1;
                for(int j = i+1; j<ar.length;j++)
                {
                    if(ar[i]==ar[j])
                    {
                        count++;
                        ar[j]=0;
                    }
                }
                int val = count>1?count/2:0;
                pairs = pairs + val;
            }
        }
        System.out.println(pairs);
    }
}
