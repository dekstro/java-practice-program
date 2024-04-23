package hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueNoOfOcccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele: arr){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        for(int key: map.keySet()){
            int val=map.get(key);
            set.add(val);
        }
        if(map.size()!=set.size()) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
