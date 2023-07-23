import java.util.*;

class Josephus
{
    public static int Joseph(int n, int k)
    {
        if(n==1)
            return 1;

        return (Joseph(n-1,k)+k-1)%n+1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();
        System.out.println(Joseph(n,k));
    }
}