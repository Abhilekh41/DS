package Practice;

public class CountingValleys
{
    public static void main(String args[])
    {
        String path = "UDDDUDUU";
        int valley = 0;

        char[] charArray = path.toCharArray();
        int counter =0;
        for(int i =0; i<charArray.length; i++)
        {
            if(charArray[i]=='D')
            {
                counter--;
            }
            else
            {
                counter++;
            }
            if(counter==0 && charArray[i]!='D')
            {
                valley++;
            }
        }
        System.out.println(valley);
    }
}
