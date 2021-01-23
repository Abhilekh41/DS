package Practice;

public class RepeatedString
{
    public static void main(String args[])
    {
        String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
        long n = 872514961806l;
        long size = s.length(), repeated = n/size;
        long left = n - (size * repeated);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++)
        {
            if(s.charAt(i) == 'a')
            {
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        repeated = (repeated * count) + extra;
        System.out.println(repeated);

    }
}
