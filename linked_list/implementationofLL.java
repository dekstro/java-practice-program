package LinkedList;
class SLL{
    private Node head;
    private Node tail;
    int size;
    public void addAtEnd(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    public void addAtHead(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

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
    }
}
