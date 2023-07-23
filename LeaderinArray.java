import java.util.*;

class LeadersinArray
{
    public static void findleaders(int[] arr, int n)
    {
        int rightmax = arr[arr.length-1];

        for (int i=n-2;i>=0;i--)
        {
            if(arr[i] > rightmax)
            {
                rightmax = arr[i];
            }

            System.out.println(rightmax + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}