package array;

import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many no: ");
        int n=sc.nextInt();
        System.out.println("Enter no: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]>max) {
                max=Math.max(max,arr[i]);
            }
        }
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]!=max) {
                secMax=Math.max(secMax,arr[i]);
            }
        }
        System.out.println("Maximum number is: "+secMax);
        sc.close();
    }
}

