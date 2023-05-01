// package LinkedList;

public class Practice2 {
    
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head,tail;
    int size;

    public Practice2(){
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

    void printList(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2();

        p.add(1);
        p.add(4);
        p.add(2);

        p.printList(p.head);
    }
}
