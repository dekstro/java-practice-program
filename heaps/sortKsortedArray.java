package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKsortedArray {
    public static void main(String[] args) {
        int[] arr={10,3,8,-4,-2,6};
        int k=3;
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: arr){
            pq.add(ele);
            if (pq.size()>k) {
                ans.add(pq.remove());
            }
        }
        while (pq.size()>0) {
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }
}
