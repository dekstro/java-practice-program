package LinkedList;

public class reverseList2 {
    public static void reverseList(Node head){
        Node c=head;
        Node n=head;
        Node p=null;
        while (c!=null) {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
    }
    public static Node reverseBetween(Node head, int left, int right) {
        Node a=null, b=null, c=null, d=null;
        int n=1;
        Node temp=head;
        while(temp!=null){
            if(n==left-1) a=temp;
            if(n==left) b=temp;
            if(n==right) c=temp;
            if(n==right+1) d=temp;
            temp=temp.next;
            n++;
        }
        if(a!=null) a.next=null;
        if(c!=null) c.next=null;
        reverseList(b);
        if(a!=null) a.next=c;
        b.next=d;
        if(a==null) return c;
        return head;
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
        System.out.println(reverseBetween(a, 1, 3));
    }
}
