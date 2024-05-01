package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        while (pq.size()>1) {
            int x=pq.remove();
            int y=pq.remove();
            if(x!=y) pq.add(x-y);
        }
        if(pq.size()==0) return 0;
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
