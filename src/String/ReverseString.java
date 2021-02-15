package String;

public class ReverseString
{
    public static void main(String args[])
    {
        String s = "Abhilekh";
        char[] c = s.toCharArray();
        String newWord = "";
        for(int i = c.length-1; i >-1; i--)
        {
            newWord = newWord.concat(String.valueOf(c[i]));
        }
        System.out.println(newWord);
    }
}
