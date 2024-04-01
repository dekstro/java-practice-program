package doubly_LinkedList;
class DLL{
    private Node head;
    private Node tail;
    int size;
    //add at tail
    public void addAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    //add at head
    public void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    //insert at anywhere
    public void insert(int idx, int val){
        if (idx==0){
            addAtHead(val);
            return;
        }
        if (idx==size) {
            addAtTail(val);
            return;
        }
        if (idx>size || idx<0) {
            System.out.println("Invalid Index input");
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        Node y=x.next;
        x.next=temp; temp.prev=x;
        temp.next=y; y.prev=temp; 
        size++;
    }
    //get element in particular index
    public int get(int idx){
        if (idx==size-1) return tail.val;
        if (idx>=size || idx<0) {
            System.out.println("Invalid Index input");
            return 0;
        }
        Node x=head;
        for(int i=0;i<idx;i++){
            x=x.next;
        }
        return x.val;
    }
    //display
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class implementation {
    public static void main(String[] args) {
        DLL d=new DLL();
        d.addAtTail(10);
        d.addAtTail(30);
        d.addAtHead(50);
        d.addAtHead(90);
        d.display();
        d.insert(3, 60);
        d.display();
        System.out.println(d.size);
    }
}
