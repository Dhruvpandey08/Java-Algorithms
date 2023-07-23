import java.util.*;

class SimpleSieve
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        boolean[] bool = new boolean[num];

        sc.close();
        
        for (int i=0;i<bool.length;i++)
        {
            bool[i] = true;
            for (i=2;i<Math.sqrt(num);i++)
            {
                if(bool[i]==true)
                {
                    for(int j=(i*i);j<num;j=j+i)
                    {
                        bool[j]=false;
                    }
                }
            }
        }
        
        for (int i=2;i<bool.length;i++)
        {
            if(bool[i]==true)
            {
                System.out.println(i);
            }
        }
    }
}