package LinkedList;

public class reverseList {
    public static Node reverse(Node head){
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
