package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr={10,2,3,8,-4,-2,6};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
