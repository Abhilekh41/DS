package Practice;

public class Test
{
    public static void main(String args[])
    {
        String S1 = "We love to hack on hackerearth";
        String S2 = "hack";
        int i = 14;
        char j = 'N';
        check(S1,S2,j,i);
    }

    public static void check(String S1, String S2, char C, int I)
    {
        //Solve and print your answer here
        int result = 0;
        String value = S1.substring(I);
        if(value.contains(S2))
        {
            if(C=='Y')
            {
                if(value.startsWith(S2))
                {
                    result = 0;
                    System.out.println(0);
                }
                else if(value.endsWith(S2))
                {
                    result = value.length()-S2.length();
                    System.out.println(result);
                }
                else if(value.contains(S2))
                {
                    result = value.indexOf(S2);
                    if(value.charAt(result-1)==' ' && result+S2.length()<=value.length()
                            && value.charAt(result+S2.length())==' ')
                    {
                        System.out.println(result + I);
                    }
                    else
                    {
                        System.out.println("Goodbye Watson.");
                    }
                }
                else
                {
                    System.out.println("Goodbye Watson.");
                }
            }
            else
            {
                if(value.contains(S2))
                {
                    result = value.indexOf(S2);
                    System.out.println(result);
                }
                else
                {
                    System.out.println("Goodbye Watson.");
                }
            }
        }
        else
        {
            System.out.println("Goodbye Watson.");
        }
    }
}
