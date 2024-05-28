package dp;

import java.util.Arrays;
import java.util.Scanner;

public class friendsPairing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(pair(n,dp));
        sc.close();
    }
    private static int pair(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=pair(n-1,dp)+(n-1)*pair(n-2,dp);
    }
}
