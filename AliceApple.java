import java.util.*;

class AliceApple
{
    public static int Apples(int M, int K, int N, int S, int W, int E)
    {
        if(M<=S*K)
            return M;
        else if(M<=S*K+E+W)
            return S*K+(M-S*K)*K;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int K = sc.nextInt();
        int N = sc.nextInt();
        int S= sc.nextInt();
        int W= sc.nextInt();
        int E = sc.nextInt();

        sc.close();

        int ans = Apples(M,K,N,S,W,E);
        System.out.println(ans);

    }
}