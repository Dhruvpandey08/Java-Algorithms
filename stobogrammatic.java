import java.util.*;

class stobogrammatic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        sc.close();

        if(isstobo(num))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean isstobo(String num)
    {
        Map <Character, Character> dict = new HashMap<> ();
        dict.put('0','0');
        dict.put('1','1');
        dict.put('6','9');
        dict.put('8','8');
        dict.put('9','6');

        int n = num.length();
        for (int i=0,j=(n-1);i<=j;i++,j--)
        {
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = dict.getOrDefault(digit_left,'-');

            if(mapping == '-')
            {
                return false;
            }
            if(mapping != digit_right)
            {
                return false;
            }
        }
        return true;
    }
}