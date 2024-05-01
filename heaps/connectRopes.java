package heaps;

import java.util.PriorityQueue;

public class connectRopes {
    public static int minCost(int[] ropes){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: ropes){
            pq.add(ele);
        }
        int cost=0;
        while (pq.size()>1) {
            int x=pq.remove();
            int y=pq.remove();
            cost+=(x+y);
            pq.add(x+y);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] ropes = {2,7,4,1,8,1};
        System.out.println(minCost(ropes));
    }
}
