package dp;

import java.util.Arrays;

public class minimumCostClimbingStairs {
    public static int minCost(int[] cost, int idx, int[] dp){
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx]+ Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
    }
    
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp)));
    }
}
