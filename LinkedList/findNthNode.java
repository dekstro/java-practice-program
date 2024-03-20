package LinkedList;

public class findNthNode {
    public static int nthNode(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.value;
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
        System.out.println(nthNode(a,2));
    }
}
