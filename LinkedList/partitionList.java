package LinkedList;

public class partitionList {
    public static Node partition(Node head, int x){
        Node a=new Node(0);
        Node b = new Node(0);
        Node tempA=a;
        Node tempB=b;
        while(head !=null){
            if(head.value<x){
                tempA.next=head;
                tempA=tempA.next;
                
            }
            else{
                tempB.next=head;
                tempB=tempB.next;
            }
            head=head.next;  
        }
        tempA.next=b.next;
        tempB.next=null;
        return a.next;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(40);
        Node c=new Node(30);
        Node d=new Node(20);
        Node e=new Node(50);
        Node f=new Node(20);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(partition(a, 3));
    }
}
