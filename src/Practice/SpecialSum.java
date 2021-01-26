package Practice;

import java.util.ArrayList;
import java.util.List;

public class SpecialSum
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3};
        List<Integer> list  = new ArrayList<>();
        for(int i = 0; i <arr.length;i++)
        {
            list.add(arr[i]);
        }
        while(list.size()>1)
        {
            for(int i = 0; i< list.size();i++)
            {
                if(i+1<list.size())
                {
                    list.set(i,list.get(i)+ list.get(i+1));
                }
                else
                {
                    list.remove(i);
                }
            }
        }
    }
}
