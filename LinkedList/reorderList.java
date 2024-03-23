package LinkedList;

public class reorderList {
    public static Node reverseList(Node head){
        Node c=head;
        Node n=head;
        Node p=null;
        while (c!=null) {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public static void reorder(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        head2=reverseList(head2);
        while(head2!=null){
            Node node1 = head.next;
            Node node2 = head2.next;
            head.next = head2;
            head2.next = node1;
            head = node1;
            head2=node2;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        reorder(a);
    }
}
