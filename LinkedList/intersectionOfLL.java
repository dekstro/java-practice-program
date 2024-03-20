package LinkedList;

public class intersectionOfLL {
    public static int intersection(Node headA, Node headB){
        Node tempA=headA;
        Node tempB=headB;
        int lenA=0, lenB=0;
        while (tempA!=null) {
            tempA=tempA.next;
            lenA++;
        }
        while (tempB!=null) {
            tempB=tempB.next;
            lenB++;
        }
        //System.out.print(lenA+" "+lenB);
        tempA=headA;
        tempB=headB;
        if (lenA>lenB) {
            for(int i=1;i<=lenA-lenB;i++){
                tempA=tempA.next;
            }
        }
        else{            //lenB>lenA
            for(int i=1;i<=lenB-lenA;i++){
                tempB=tempB.next;
            }
        }
        while (tempA!=tempB) {  
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA.value;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);
        Node h=new Node(90);
        Node i=new Node(100);
        a.next=b;
        b.next=c;
        c.next=d;
        e.next=f;
        f.next=g;
        d.next=h;
        g.next=h;
        h.next=i;
        //intersection(a, e);
        System.out.println(intersection(a, e));
    }
}
