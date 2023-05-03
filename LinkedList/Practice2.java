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
    
    Node head;
    int size;

    public Practice2(){
        head = null;
        size = 0;
    }

    public void add(int data){
        
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void printList(){
        Node node = head;

        while (node != null){
            System.out.print(node.data+"-->");
            node = node.next;
        }
        System.out.println("null");
    }
    
    public void addLast(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public int getSize(){
        return size;
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("List is Empty !");
        }

        head = head.next;
        size--;
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2();

        p.add(3);
        p.add(4);
        p.add(7);

        p.printList();

        p.deleteFirst();

        p.printList();

        System.out.println(p.getSize());
        
    }
}
