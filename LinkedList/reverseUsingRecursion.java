package LinkedList;

public class reverseUsingRecursion {
    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node a=head.next;
        Node newHead=reverse(a);
        a.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a);
        System.out.println(reverse(a));
    }
}
