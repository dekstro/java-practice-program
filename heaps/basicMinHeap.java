package heaps;

import java.util.PriorityQueue;

public class basicMinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(5);
        pq.add(0);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
