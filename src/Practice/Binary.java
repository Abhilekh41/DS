package Practice;

import java.util.ArrayList;
import java.util.List;

public class Binary
{
    public static void main(String args[])
    {
        List<String> longList = new ArrayList<>();
        for(long i = 1; i < 100000000l;i++)
        {
            String s  = Long.toBinaryString(i);
            if(!s.contains("11"))
            {
                longList.add(Long.toBinaryString(i));
            }
        }
        System.out.println(longList.get(2));
    }
}
