package LinkedList;

public class swapNode {
    public static void swap(Node head, int k){
        Node x=head;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        for (int i=1;i<=k;i++) {
            prev=x;
            x=x.next;
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        int temp=prev.value;
        prev.value=slow.value;
        slow.value=temp;
    }
    
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        swap(a, 3);
        //System.out.print(a.value+" "+b.value+" "+c.value+" "+d.value+" "+e.value+" "+f.value+" "+g.value);
    }
}
