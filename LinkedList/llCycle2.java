package LinkedList;

public class llCycle2 {
    public static int detectCycle(Node head) {
        if(head==null || head.next==null) return 0;
        Node slow=head;
        Node fast=head;
        
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        if(fast!=slow) return 0;
        Node temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
        }
        return temp.value;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=d;
        System.out.println(detectCycle(a));
    }
}
