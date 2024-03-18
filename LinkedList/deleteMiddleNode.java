package LinkedList;

public class deleteMiddleNode {
    public static int deleteMid(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        if(head.next==null){
            head=head.next;
            return head.value;
        }
        while (fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head.value;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(deleteMid(a));
    }
}
