package LinkedList;

public class LinkedList {

    Node head, tail;
    int size;

    public LinkedList(){
        head = tail = null;
        size = 0;
    }

    // Add method for linkedList
    public void add(int data){
        Node n = new Node(data);
        if (head == null){
            head = tail = n;
        }else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    // Removing one node from the begining
    public void removeFirst(){
        if (head == null){
            System.out.println("List is Empty !");
        }else {
            head = head.next;
            size--;
        }
        
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Print linkedList data
    void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.printList(list.head);

        list.removeFirst();

        list.printList(list.head);
    }
}
