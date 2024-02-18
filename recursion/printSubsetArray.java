package recursion;

import java.util.ArrayList;
import java.util.List;

public class printSubsetArray {
    static List<List<Integer>> nums;
    public static void print(int i,int[] arr, ArrayList<Integer> ans){
        if (i==arr.length) {
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            nums.add(list);
            return;
        }
        print(i+1, arr,ans);
        ans.add(arr[i]);
        print(i+1, arr,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        nums=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        print(0,arr,ans);
        System.out.println(nums);
    }
}
