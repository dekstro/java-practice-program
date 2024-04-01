package doubly_LinkedList;

public class checkPalindrome {
    public static boolean palin(Node mid){
        Node i=mid;
        Node j=mid;
        while (i!=null && j!=null) {
            if(i.val==j.val){
                i=i.prev;
                j=j.next;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(20);
        Node e=new Node(10);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        d.next=e; e.prev=d;
        System.out.println(palin(c));
    }
}
