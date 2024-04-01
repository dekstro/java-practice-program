package doubly_LinkedList;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}
public class introToDoublyLL {
    public static void printfromHead(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printfromTail(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        d.next=e; e.prev=d;
        printfromHead(a);
        printfromTail(e);
    }
}
