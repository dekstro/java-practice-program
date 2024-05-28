package dp;

import java.util.Arrays;

public class houseRobber {
    public static int amount(int[] nums, int i, int[] dp) {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i] + amount(nums,i+2,dp);
        int skip=amount(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(amount(nums,0,dp));
    }
}
