// package LinkedList;

public class Practice {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    private int size;

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // add last
    public void addLast(int data){
        Node newNode = new Node(data);

        Node current = head;
        
        if (head == null){
            head = newNode;
        }else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // print all the nodes
    public void printAll(){
        Node current = head;

        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    // get the size of the list
    public int getSize(){
        return size;
    }

    // delete first node
    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public static void main(String[] args) {
        Practice list = new Practice();

        list.addFirst(2);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printAll();

        list.deleteFirst();
        System.out.println();

        list.printAll();

        System.out.println("\n"+ list.getSize());
    }
}
