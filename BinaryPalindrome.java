import java.util.*;

class BinaryPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s = Integer.toBinaryString(n);
        String rev="";
        int len = s.length();
        sc.close();

        for(int i=len-1;i>=0;i--)
        {
            rev = rev+  String.valueOf(s.charAt(i));
        }
        
        if(rev.equals(s))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}