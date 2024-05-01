package heaps;

import java.util.HashMap;
import java.util.PriorityQueue;
class Couple implements Comparable<Couple>{
    int ele;
    int freq;
    Couple(int ele, int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Couple c){
        return this.freq-c.freq;
    }
}
public class topKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else map.put(ele, 1);
        }
        PriorityQueue<Couple> pq=new PriorityQueue<>();
        for(int ele: map.keySet()){
            int freq=map.get(ele);
            pq.add(new Couple(ele, freq));
            if(pq.size()>k) pq.remove();
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            Couple c=pq.remove();
            ans[i]=c.ele;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }
}
