package LinkedList;
class Middle{
    public int middleNode(Node head){
        //method 1
        //Node temp=head;
        /** 
         * 
        int len=0;
        while (temp!=null) {
            temp=temp.next;
            len++;
        }
        int mid=(len/2)+1;
        temp=head;
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }
        return temp.value;
        * 
        */

        //method 2
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while (fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;
        
    }
}
public class findMiddleofLL {
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
        //System.out.println(a.value+" "+b.value+" "+c.value+" "+d.value+" "+e.value);
        Middle m=new Middle();
        System.out.println(m.middleNode(a));
    }
}
