import java.util.*;

public class Booth{
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        String S1 = S.next();
        System.out.print("Enter Number 2:");
        String S2 = S.next();
        int Num1 = Integer.parseInt(S1,2);
        int Num2 = Integer.parseInt(S2,2);
        System.out.print(Num1+"-"+Num2);
        System.out.println("---");
        int Ans = Num1*Num2;
        String FinalAns = Integer.toBinaryString(Ans);
        System.out.print(FinalAns);

        S.close();
    }
}