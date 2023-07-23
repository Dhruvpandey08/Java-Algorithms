import java.util.*;
import java.util.Scanner;
public class Blockswap{
    public static void rotatearray(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        if(d==0){
            return;
        }
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);
    }
    public static void swap(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotatearray(arr,d);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}