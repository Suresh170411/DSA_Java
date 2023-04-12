package LinkedList;

public class Practice1 {
    LinkedList ll = new LinkedList();

    
}

class Node{
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void add(int element){
        Node node = new Node(element);
    }
}

