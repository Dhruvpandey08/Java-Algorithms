import java.util.*;

class Maneuvering
{
    public static int noofpaths(int m, int n)
    {
        if(m==1 || n==1)
            return 1;

        return noofpaths(m-1,n) + noofpaths(m,n-1) + noofpaths(m-1,n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        System.out.println(noofpaths(m,n));
        
    }
}