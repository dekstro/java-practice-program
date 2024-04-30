package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class basicMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq);
        pq.add(50);
        System.out.println(pq);
        pq.add(80);
        pq.add(0);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
