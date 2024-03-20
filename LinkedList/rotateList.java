package LinkedList;

public class rotateList {
    public static Node rotateRight(Node head, int k) {
        if(head==null || head.next==null) return head;
        Node temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0) return head;
        Node slow=head;
        Node fast=head;
        //if(head==null) return head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        Node h=slow.next;
        slow.next=null;
        fast.next=head;
        return h;
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
        System.out.println(a);
        System.out.println(rotateRight(a, 2));
    }
}
