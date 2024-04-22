package hashmaps;

import java.util.HashSet;

public class countNoOfDistinctIntegers {
    public static int reverse(int n){
        int rev=0, ld;
        while (n!=0) {
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev;
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr={1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }
}
