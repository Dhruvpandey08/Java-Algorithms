import java.util.*;

class Movehyphen
{
    public static String Move(String str, int n)
    {
        String result = " ";

        for (int i=0;i<n;i++)
        {
            if(str.charAt(i)=='-')
            {
                result = "-" + result;
            }
            else
            {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        sc.close();

        System.out.println(Move(a,a.length()));
    }
}