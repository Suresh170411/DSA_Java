public class Practice5{
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

    public void addFirst(int node){
        Node newNode = new Node(node);

        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
        head = newNode;
        }
        size++;
    }

    public void printList(){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        Node curr = head;

        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

        size++;
    }

    public void addAfterNode(int elem, int node){
        Node newNode = new Node(node);
        Node curr = head;
        while (curr.data != elem){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        size++;
    }

    public void addBeforeNode(int elem, int node){
        Node newNode = new Node(node);
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

        size++;
    }

    public void deleteAfterNode(int elem){
        Node curr = head;

        while (curr.data != elem){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        size--;
    }

    public void deleteBeforeNode(int elem){
        Node curr = head;
        Node prev = null;
        Node secondPrev = null;

        while (curr.data != elem){
            secondPrev = prev;
            prev = curr;
            curr = curr.next;
        }
        secondPrev.next = prev.next;
        size--;
    }

    public void deleteParticular(int elem){
        Node curr = head;
        Node prev = null;

        while (curr.data != elem){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;
    }

    public int getSize(){
        return size;
    }

    public void reverseSLL(){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        printList();
    }
    
    public static void main(String[] args) {
        Practice5 list = new Practice5();

        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.deleteParticular(4);
        list.printList();
        list.reverseSLL();
    }
}