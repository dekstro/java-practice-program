package twoD_Array;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][3];
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("Enter value: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max, arr[i][j]);
              
            }
        }
        System.out.println("Maximum is: "+max);
        sc.close();
    }
}
