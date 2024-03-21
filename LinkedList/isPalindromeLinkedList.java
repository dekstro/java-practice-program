package LinkedList;

public class isPalindromeLinkedList {
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
    public static boolean isPalindrome(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node j=reverse(slow);
        Node i=head;
        while(j!=null){
            if(i.value==j.value){
                i=i.next;
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
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(isPalindrome(a));
    }
}
