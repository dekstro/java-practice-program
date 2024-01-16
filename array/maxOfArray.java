package array;

import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many no: ");
        int n=sc.nextInt();
        System.out.println("Enter no: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        sc.close();
    }
}
