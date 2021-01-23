package Practice;

public class JumpingTheClouds
{
    public static void main(String args[])
    {
        int[] c = {0,0,0,0,1,0};
        int steps = 0;
        int i =0;
        while(i<c.length)
        {
            if(i+2<c.length && c[i+2]==0)
            {
                i = i +2;
            }
            else {
                i++;
            }
            if( i>0 && i!=c.length-1)
            {
                steps++;
            }
        }
        System.out.println(steps);
    }
}
