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
    Node tail;
    int size;

    public Practice(){
        head = tail = null;
        size = 0;
    }

    void add(int data){
        Node node = new Node(data);

        if (head == null){
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void addLast(int data){
        Node temp = new Node(data);

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        size++;
    }

    void printAll(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice list = new Practice();
        list.add(10);
        list.add(29);
        list.add(29);
        list.add(32);

        list.printAll(list.head);
        
        list.addLast(59);

        list.printAll(list.head);

        System.out.println(list.size);
    }
}
