package LinkedList;
class SLL{
    private Node head;
    private Node tail;
    int size;
    //insert at the end
    public void addAtEnd(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    //insert at the head
    public void addAtHead(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    //insert at anywhere
    public void insert(int idx, int value){
        if (idx==0){
            addAtHead(value);
            return;
        }
        if (idx==size) {
            addAtEnd(value);
            return;
        }
        if (idx>size || idx<0) {
            System.out.println("Invalid Index input");
            return;
        }
        Node temp=new Node(value);
        Node x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    
    //get element in particular index
    public int get(int idx){
        if (idx==size-1) return tail.value;
        if (idx>=size || idx<0) {
            System.out.println("Invalid Index input");
            return 0;
        }
        Node x=head;
        for(int i=0;i<idx;i++){
            x=x.next;
        }
        return x.value;
    }

    //delete element
    public void delete(int idx){
        if(head==null) System.out.println("List is Empty");
        if(idx>=size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            head=head.next;
            size--;
            return;
        }
        Node x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        if(x.next==tail) tail=x;
        x.next=x.next.next;
        size--;
    }

    //display method
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class implementationofLL {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.print();
        System.out.println("Size: "+list.size);
        list.addAtHead(100);
        list.addAtHead(200);
        list.print();
        System.out.println("Size: "+list.size);
        list.insert(5, 99);
        list.print();
        System.out.println("Size: "+list.size);
        System.out.println(list.get(3));
        list.delete(7);
        list.print();
        System.out.println("Size: "+list.size);
    }
}
