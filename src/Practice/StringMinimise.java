package Practice;

public class StringMinimise
{
    public static void main(String args[])
    {
        String s = "aabcccabba";

        int mid = s.length()/2;
        String s1 = s.substring(0,mid);
        String s2 = s.substring(mid);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.concat(s1));
        char[] charArray = s2.toCharArray();

        if(charArray[charArray.length/2]==charArray[charArray])
    }
}
