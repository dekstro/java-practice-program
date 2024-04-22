package hashmaps;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSums(int[] nums, int target) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            int rem=target-key;
            if(map.containsKey(rem)){
                ans[0]=i;
                ans[1]=map.get(rem);
                break;
            }
            else map.put(key, i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int target=9;
        int[] arr={2,7,11,15};
        System.out.println(twoSums(arr,target));
    }
}
