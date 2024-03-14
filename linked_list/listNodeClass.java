package linked_list;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}
public class listNodeClass {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        a.next=b;
        b.next=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(a.value+" "+b.value+" "+c.value);
    }
}
