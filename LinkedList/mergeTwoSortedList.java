package LinkedList;

public class mergeTwoSortedList {
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy=new Node(0);
        Node temp=dummy;
        Node temp1=list1;
        Node temp2=list2;
        while(temp1!=null && temp2!=null){
            if(temp1.value<=temp2.value){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null) temp.next=temp2;
        if(temp2==null) temp.next=temp1;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        d.next=e;
        e.next=f;
        System.out.println(mergeTwoLists(a, d));
    }
}
