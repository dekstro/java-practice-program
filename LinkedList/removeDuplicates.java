package LinkedList;

public class removeDuplicates {
    public static Node deleteDuplicates(Node head) {
        Node a=head;
        Node b=head;
        if(head==null) return null;
        while(b!=null){
            if(a.value==b.value){
                b=b.next;
            }
            else{
                a.next=b;
                a=b;
            }
        }
        a.next=b;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(20);
        Node d=new Node(30);
        Node e=new Node(40);
        Node f=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(deleteDuplicates(a));
    }
}
