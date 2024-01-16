package array;

import java.util.Scanner;

public class minOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many no: ");
        int n=sc.nextInt();
        System.out.println("Enter no: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println("Minimum number is: "+min);
        sc.close();
    }
}
